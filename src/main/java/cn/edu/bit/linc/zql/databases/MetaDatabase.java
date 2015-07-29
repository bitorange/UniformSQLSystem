package cn.edu.bit.linc.zql.databases;

import cn.edu.bit.linc.zql.ZQLEnv;
import cn.edu.bit.linc.zql.connections.connector.ConnectionPools;
import cn.edu.bit.linc.zql.exceptions.MetaDatabaseOperationsException;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * 元数据库类，存储元数据相关的信息与操作
 */
public class MetaDatabase extends Database {
    private final static Logger logger = LoggerFactory.getLogger(MetaDatabase.class);

    /**
     * 构造函数
     *
     * @param dbId       数据库编号（从 0 开始，其中 0 表示元数据库）
     * @param dbType     数据库类型
     * @param dbAlias    数据库别名
     * @param dbHost     数据库地址
     * @param dbUser     数据库连接用户
     * @param dbPassword 数据库用户密码
     */
    private MetaDatabase(int dbId, DBType dbType, String dbAlias, String dbHost, String dbUser, String dbPassword) {
        super(dbId, dbType, dbAlias, dbHost, dbUser, dbPassword);
    }

    private String metaDbName;  // 元数据库中，存储元数据的数据库的名字
    public final static int META_DB_ID = 0;    // 元数据库的编号固定为 1
    public final static String META_DB_ALIAS = "db_meta";   // 元数据库的别名固定为 db_meta
    public final static DBType META_DB_TYPE = DBType.MySQL; // 元数据的数据库类型固定为 MySQL

    /**
     * 获取元数据库中，存储元数据的数据库的名字
     *
     * @return 存储元数据的数据库的名字
     */
    public String getMetaDbName() {
        return metaDbName;
    }


    /**
     * 构造函数
     *
     * @param dbHost     数据库地址
     * @param dbUser     数据库连接用户
     * @param dbPassword 数据库用户密码
     * @param metaDbName 元数据库中，存储元数据的数据库的名字
     */
    private MetaDatabase(String dbHost, String dbUser, String dbPassword, String metaDbName) {
        super(META_DB_ID, META_DB_TYPE, META_DB_ALIAS, dbHost, dbUser, dbPassword);
        this.metaDbName = metaDbName;
    }

    private static MetaDatabase metaDatabase = null;

    /**
     * 获取 MetaDatabase 实例
     *
     * @return MetaDatabase 实例
     */
    public static MetaDatabase getInstance() {
        if (metaDatabase == null) {
            readMetaDatabaseFromConfigurationFile();
            createMetaDatabase();
        }
        return metaDatabase;
    }


    /**
     * 从系统配置中读取元数据库信息
     */
    private static void readMetaDatabaseFromConfigurationFile() {
        logger.i("正在从配置文件中读取元数据库信息");
        String host = ZQLEnv.get("metadb.host");
        String user = ZQLEnv.get("metadb.username");
        String password = ZQLEnv.get("metadb.password");
        String dbName = ZQLEnv.get("metadb.dbname");
        if (host == null || user == null || password == null || dbName == null) {
            logger.f("元数据库配置项不完整");
            System.exit(0);
        }
        metaDatabase = new MetaDatabase(host, user, password, dbName);
    }

    private final static String CREATE_META_DB_SQL = "CREATE DATABASE IF NOT EXISTS %s";
    private final static String CREATE_ZQL_USERS_TB_SQL = "CREATE TABLE IF NOT EXISTS %s.zql_users (User char(64) PRIMARY KEY, Password char(41), Grant_option enum('Y', 'N') DEFAULT 'N') ENGINE=InnoDB";
    private final static String CREATE_ZQL_DBS_TB_SQL = "CREATE TABLE IF NOT EXISTS %s.zql_dbs (Db char(64) PRIMARY KEY, Inner_db_id int(10), Db_alias char(64), User char(64), Timestamp timestamp, FOREIGN KEY(User) REFERENCES zql_users(User) ON UPDATE CASCADE ON DELETE SET NULL) ENGINE=InnoDB";
    private final static String CREATE_ZQL_TABLES_TB_SQL = "CREATE TABLE IF NOT EXISTS %s.zql_tables (Db char(64), Tb char(16), User char(64), Timestamp timestamp, PRIMARY KEY(Db, Tb), FOREIGN KEY(User) REFERENCES zql_users(User) ON UPDATE CASCADE ON DELETE SET NULL, FOREIGN KEY(Db) REFERENCES zql_dbs(Db) ON UPDATE CASCADE ON DELETE CASCADE) ENGINE=InnoDB";
    private final static String CREATE_ZQL_TABLES_PRIV = "CREATE TABLE IF NOT EXISTS %s.zql_tables_priv (User char(64), Db char(64), Tb char(16), Select_priv enum('Y', 'N') DEFAULT 'N', Insert_priv enum('Y', 'N') DEFAULT 'N', Update_priv enum('Y', 'N') DEFAULT 'N', Delete_priv enum('Y', 'N') DEFAULT 'N', All_priv enum('Y', 'N') DEFAULT 'N',  PRIMARY KEY(User, Db, Tb), FOREIGN KEY(User) REFERENCES zql_users(User) ON UPDATE CASCADE ON DELETE CASCADE, FOREIGN KEY(Db, Tb) REFERENCES zql_tables(Db, Tb) ON UPDATE CASCADE ON DELETE CASCADE) ENGINE=InnoDB";

    /**
     * 创建元数据库
     */
    private static void createMetaDatabase() {
        logger.i("正在创建元数据库");

        /* 连接元数据库 */
        ConnectionPools connectionPools = ConnectionPools.getInstance();
        Connection connection;
        try {
            connection = connectionPools.getConnection(0);
            Statement statement = connection.createStatement();
            statement.execute(String.format(CREATE_META_DB_SQL, metaDatabase.getMetaDbName()));
            statement.execute(String.format(CREATE_ZQL_USERS_TB_SQL, metaDatabase.getMetaDbName()));
            statement.execute(String.format(CREATE_ZQL_DBS_TB_SQL, metaDatabase.getMetaDbName()));
            statement.execute(String.format(CREATE_ZQL_TABLES_TB_SQL, metaDatabase.getMetaDbName()));
            statement.execute(String.format(CREATE_ZQL_TABLES_PRIV, metaDatabase.getMetaDbName()));
        } catch (SQLException e) {
            logger.f("创建元数据库失败", e);
            System.exit(0);
        }
    }

    public final static String DROP_DATABASE_SQL = "DELETE FROM %s.zql_dbs WHERE Db = '%s'";
    public final static String DROP_RELEVANT_TABLES = "DELETE FROM %s.zql_tables WHERE Db = '%s'";
    public final static String DELETE_RELEVANT_PRIV = "DELETE FROM %s.zql_tables_priv WHERE Db = '%s'";

    /**
     * 从元数据库中清除特定数据库的信息
     *
     * @param dbName 数据库名称
     * @throws MetaDatabaseOperationsException 从元数据库中清除特定数据库的信息失败
     */
    public static void dropDatabase(String dbName) throws MetaDatabaseOperationsException {
        /* 连接元数据库并执行命令 */
        ConnectionPools connectionPools = ConnectionPools.getInstance();
        Connection connection;
        try {
            connection = connectionPools.getConnection(0);
            Statement statement = connection.createStatement();
            String sqlCommandDropDb = String.format(DROP_DATABASE_SQL, metaDatabase.getMetaDbName(), dbName);
            String sqlCommandDropTables = String.format(DROP_RELEVANT_TABLES, metaDatabase.getMetaDbName(), dbName);
            String sqlCommandDeleteRelevantPriv = String.format(DELETE_RELEVANT_PRIV, metaDatabase.getMetaDbName(), dbName);

            logger.d("从元数据库 zql_dbs 中删除数据库信息：" + sqlCommandDropDb);
            statement.execute(sqlCommandDropDb);
            logger.d("从元数据库 zql_tables 中删除数据库信息：" + sqlCommandDropDb);
            statement.execute(sqlCommandDropTables);
            logger.d("从元数据库 zql_tables_priv 中删除数据库信息：" + sqlCommandDropDb);
            statement.execute(sqlCommandDeleteRelevantPriv);
        } catch (SQLException e) {
            MetaDatabaseOperationsException metaDatabaseOperationsException = new MetaDatabaseOperationsException();
            metaDatabaseOperationsException.initCause(e);
            logger.e("从元数据库删除数据库信息", e);
            throw metaDatabaseOperationsException;
        }
    }

    public final static String SELECT_DB_FORM_ZQL_DBS_SQL = "SELECT * FROM %s.zql_dbs WHERE Db = '%s'";

    /**
     * 获取指定名字数据库所在的底层库
     *
     * @param dbName 数据库名
     * @return 底层库 ID，如果元数据库中没有记录，则返回 1
     * @throws cn.edu.bit.linc.zql.exceptions.MetaDatabaseOperationsException 从元数据库中查询某数据库所述的底层库失败
     */
    public int getInnerDatabaseId(String dbName) throws MetaDatabaseOperationsException {
        /* 连接元数据库并执行命令 */
        ConnectionPools connectionPools = ConnectionPools.getInstance();
        Connection connection;
        try {
            connection = connectionPools.getConnection(0);
            Statement statement = connection.createStatement();
            String sqlCommand = String.format(SELECT_DB_FORM_ZQL_DBS_SQL, metaDatabase.getMetaDbName(), dbName);
            logger.d("从元数据库中查询某数据库所述的底层库：" + sqlCommand);
            ResultSet resultSet = statement.executeQuery(sqlCommand);
            while (resultSet.next()) {
                int id = Integer.valueOf(resultSet.getString("Inner_db_id"));
                return id;
            }
        } catch (SQLException e) {
            MetaDatabaseOperationsException metaDatabaseOperationsException = new MetaDatabaseOperationsException();
            metaDatabaseOperationsException.initCause(e);
            logger.e("从元数据库中查询某数据库所述的底层库", e);
            throw metaDatabaseOperationsException;
        }
        return 1;   // 默认使用第 1 个底层库
    }

    public final static String SELECT_DB_NAME_FROM_ZQL_TABLES = "SELECT Db FROM %s.zql_tables WHERE Tb = '%s'";

    /**
     * 获取数据表所在的数据库
     *
     * @param tableName 表名
     * @return 节点访问结果
     * @throws MetaDatabaseOperationsException
     */
    public String getDbNameOfATable(String tableName) throws MetaDatabaseOperationsException {
        /* 连接元数据库并执行命令 */
        ConnectionPools connectionPools = ConnectionPools.getInstance();
        Connection connection;
        try {
            connection = connectionPools.getConnection(0);
            Statement statement = connection.createStatement();
            String sqlCommand = String.format(SELECT_DB_NAME_FROM_ZQL_TABLES, metaDatabase.getMetaDbName(), tableName);
            logger.d("从元数据库中查询某数据表所在的数据库：" + sqlCommand);
            ResultSet resultSet = statement.executeQuery(sqlCommand);
            while (resultSet.next()) {
                String dbName = resultSet.getString("Db");
                return dbName;
            }
        } catch (SQLException e) {
            MetaDatabaseOperationsException metaDatabaseOperationsException = new MetaDatabaseOperationsException();
            metaDatabaseOperationsException.initCause(e);
            logger.e("从元数据库中查询某数据表所在的数据库：", e);
            throw metaDatabaseOperationsException;
        }
        return null;   // 默认使用第 1 个底层库
    }

}
