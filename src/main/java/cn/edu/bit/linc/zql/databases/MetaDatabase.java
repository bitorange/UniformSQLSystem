package cn.edu.bit.linc.zql.databases;

import cn.edu.bit.linc.zql.ZQLEnv;
import cn.edu.bit.linc.zql.connections.connector.ConnectionPools;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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
     * 空构造函数
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
        metaDatabase = new MetaDatabase(host, user, password, dbName);
    }

    public final static String CREATE_META_DB_SQL = "CREATE DATABASE IF NOT EXISTS %s";
    public final static String CREATE_ZQL_USERS_TB_SQL = "CREATE TABLE IF NOT EXISTS %s.zql_users(User char(64), Password char(41), PRIMARY KEY(User, Password))";
    public final static String CREATE_ZQL_DBS_TB_SQL = "CREATE TABLE IF NOT EXISTS %s.zql_dbs(" +
            "Inner_db_id int(10), Db_alias char(64), Db char(64), User char(64), Timestamp timestamp, " +
            "PRIMARY KEY(Inner_db_id, Db_alias, Db), " +
            "FOREIGN KEY(User) REFERENCES zql_users(User))";
    public final static String CREATE_ZQL_TABLES_TB_SQL = "CREATE TABLE IF NOT EXISTS %s.zql_tables(Inner_db_id int(10), Db_alias char(64), " +
            "Db char(64), Tb char(16), User char(64), Timestamp timestamp, " +
            "PRIMARY KEY(Inner_db_id, Db_alias, Db, Tb), " +
            "FOREIGN KEY(Inner_db_id, Db_alias, Db) REFERENCES zql_dbs(Inner_db_id, Db_alias, Db), " +
            "FOREIGN KEY(User) REFERENCES zql_users(User))";
    public final static String CREATE_ZQL_TABLES_PRIV = "CREATE TABLE IF NOT EXISTS %s.zql_tables_priv(User char(64), Db char(64), " +
            "Tb char(64), Select_priv enum('Y', 'N'), Insert_priv enum('Y', 'N'), " +
            "Update_priv enum('Y', 'N'), Delete_priv enum('Y', 'N'), All_priv enum('Y', 'N'), " +
            "PRIMARY KEY(User, Db, Tb))";

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
}
