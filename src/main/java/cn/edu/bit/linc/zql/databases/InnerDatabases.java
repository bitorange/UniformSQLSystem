package cn.edu.bit.linc.zql.databases;

import cn.edu.bit.linc.zql.ZQLEnv;
import cn.edu.bit.linc.zql.connections.connector.ConnectionPools;
import cn.edu.bit.linc.zql.exceptions.UnsupportedDatabaseException;
import cn.edu.bit.linc.zql.exceptions.ZQLCommandExecutionError;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 数据库底层库管理类
 */
public class InnerDatabases {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private ArrayList<InnerDatabase> innerDatabaseArray = new ArrayList<InnerDatabase>();  // 底层库数组

    /**
     * 获取底层库连接信息
     *
     * @return 底层库连接信息
     */
    public ArrayList<InnerDatabase> getInnerDatabaseArray() {
        return new ArrayList<InnerDatabase>(innerDatabaseArray);
    }

    /**
     * 构造函数
     */
    private InnerDatabases() {
        // 读取配置文件，获取底层库信息
        getInnerDatabasesFromConfigurationFile();
    }

    private static InnerDatabases innerDatabases;

    /**
     * 获取 InnerDatabases 实例
     *
     * @return InnerDatabases 实例
     */
    public static InnerDatabases getInstance() {
        if (innerDatabases == null) {
            innerDatabases = new InnerDatabases();
        }
        return innerDatabases;
    }

    /**
     * 从系统配置中读取底层库信息
     */
    private void getInnerDatabasesFromConfigurationFile() {
        logger.i("正在从配置文件中读取底层库信息");
        int dbNo = 1;
        Map<String, Integer> aliasHashMap = new HashMap<String, Integer>();
        while (true) {
            String prefix = "innerdb.db" + dbNo;
            if (ZQLEnv.get(prefix) != null
                    && ZQLEnv.get(prefix) != null
                    && ZQLEnv.get(prefix).equals("enable")) {
                String dbAlias = ZQLEnv.get(prefix + ".alias");
                String dbHost = ZQLEnv.get(prefix + ".host");
                String dbUser = ZQLEnv.get(prefix + ".username");
                String dbPassword = ZQLEnv.get(prefix + ".password");
                if (dbAlias == null || dbHost == null | dbUser == null || dbPassword == null) {
                    logger.f("底层数据库 " + dbNo + " 配置项不完整");
                    System.exit(0);
                }

                // 检测别名是否冲突
                Integer preId = aliasHashMap.put(dbAlias, dbNo);
                if (preId != null) {
                    logger.f("数据库 " + dbNo + " 与 " + preId + " 的别名发生冲突");
                    System.exit(-1);
                }

                Database.DBType dbType = null;
                try {
                    dbType = Database.DBType.valueOf(ZQLEnv.get(prefix + ".type"));
                } catch (Exception e) {
                    UnsupportedDatabaseException unsupportedDatabaseException = new UnsupportedDatabaseException();
                    unsupportedDatabaseException.initCause(e);
                    logger.f("不支持的数据库类型", unsupportedDatabaseException);
                    System.exit(0);
                }
                InnerDatabase innerDatabase = new InnerDatabase(dbNo, dbType, dbAlias, dbHost, dbUser, dbPassword);
                innerDatabaseArray.add(innerDatabase);
                dbNo++;
            } else {
                break;
            }
        }
        logger.i("从配置文件中读取底层库信息成功，共有 " + innerDatabaseArray.size() + " 个底层库：" + innerDatabaseArray);
    }

    public final static String SELECT_FIELD_TYPE = "SHOW FIELDS FROM %s.%s where Field ='%s'";

    /**
     * 获取特定数据列的类型
     *
     * @param DbNo         底层库编号
     * @param databaseName 数据库名
     * @param tableName    数据表名
     * @param columnName   数据列名
     * @return 数据列的类型
     */
    public String getColumnType(int DbNo, String databaseName, String tableName, String columnName) throws ZQLCommandExecutionError {
        /* 连接底层库并执行命令 */
        ConnectionPools connectionPools = ConnectionPools.getInstance();
        Connection connection;
        try {
            connection = connectionPools.getConnection(DbNo);
            Statement statement = connection.createStatement();
            String sqlCommand = String.format(SELECT_FIELD_TYPE, databaseName, tableName, columnName);
            ResultSet resultSet = statement.executeQuery(sqlCommand);
            if (resultSet.next()) {
                return resultSet.getString("Type");
            }
        } catch (SQLException e) {
            ZQLCommandExecutionError zqlCommandExecutionError = new ZQLCommandExecutionError("获取数据列 " +
                    databaseName + "." + tableName + "." + columnName + " 的类型失败");
            zqlCommandExecutionError.initCause(e);
            throw zqlCommandExecutionError;
        }
        return "INT";
    }
}
