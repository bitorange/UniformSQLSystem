package cn.edu.bit.linc.zql.connector;

import cn.edu.bit.linc.zql.GlobalVar;

import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

/**
 * 元数据库
 */
public class MetaDatabase {
    private static JDBCConnector connector = null;
    private static String url, username, password, dbName, driver;

    static {
        // 读取配置文件内容
        MetaDatabase.url = GlobalVar.configMap.get("metadb.url");
        MetaDatabase.username = GlobalVar.configMap.get("metadb.username");
        MetaDatabase.password = GlobalVar.configMap.get("metadb.password");
        MetaDatabase.dbName = GlobalVar.configMap.get("metadb.dbname");
        MetaDatabase.driver = GlobalVar.configMap.get("metadb.jdbc.driver");
    }

    /**
     * 初始化元数据库
     */
    public static void initMetaDatabase() {
        // 尝试连接元数据库
        if (MetaDatabase.connector == null) {
            try {
                MetaDatabase.connector = new JDBCConnector(url, username, password, dbName, driver);
            } catch (ClassNotFoundException e) {
                System.err.println("找不到元数据库 JDBC 驱动 " + driver);
                e.printStackTrace();
                System.exit(0);
            } catch (SQLException e) {
                System.err.println("连接到元数据库 + " + dbName + "(" + url + ")" + " + 失败");
                e.printStackTrace();
                System.exit(0);
            } catch (JDBCConnector.NotSupportDatabaseException e) {
                System.err.println("不支持的数据库类型");
                e.printStackTrace();
                System.exit(0);
            }
        }

        // 检查是否第一次启动
        Properties prop = new Properties();
        String propFileName = GlobalVar.configMap.get("conf.properties.path");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File(propFileName));
        } catch (FileNotFoundException e) {
            System.err.println("找不到系统内部配置文件");
            e.printStackTrace();
            System.exit(0);
        }

        try {
            prop.load(inputStream);
        } catch (IOException e) {
            System.err.println("解析 properties 文件失败");
            e.printStackTrace();
            System.exit(0);
        }

        boolean isFirstRun = prop.getProperty("isFirstRun").equals("true") ? true : false;


        // 第一次启动，创建数据表，读取底层数据库信息，存储到元数据库
        if (isFirstRun) {
            // 创建数据表
            try {
                MetaDatabase.createTables();   // 创建数据表
            } catch (SQLException e) {
                System.err.println("创建数据表失败");
                e.printStackTrace();
                System.exit(0);
            }

            // 从配置文件中获取底层库信息
            int dbNo = 1;
            while (true) {
                if (GlobalVar.configMap.containsKey("innerdb.db" + String.valueOf(dbNo))
                        && GlobalVar.configMap.get("innerdb.db" + String.valueOf(dbNo)).equals("enable")) {
                    String dbName = "db" + String.valueOf(dbNo);
                    String type = GlobalVar.configMap.get("innerdb.db" + String.valueOf(dbNo) + ".type");
                    String url = GlobalVar.configMap.get("innerdb.db" + String.valueOf(dbNo) + ".url");
                    String username = GlobalVar.configMap.get("innerdb.db" + String.valueOf(dbNo) + ".username");
                    String password = GlobalVar.configMap.get("innerdb.db" + String.valueOf(dbNo) + ".password");
                    String driver = GlobalVar.configMap.get("innerdb.db" + String.valueOf(dbNo) + ".jdbc.driver");
                    try {
                        addNewInnerDatabase(dbName, type, url, username, password, driver);
                    } catch (SQLException e) {
                        System.err.println("登记底层数据库 " + dbName + " 到元数据库中失败");
                        e.printStackTrace();
                        System.exit(0);
                    }
                    dbNo++;
                } else {
                    break;
                }
            }

            // 修改 isFirstRun 为 false
            try {
                FileOutputStream outStream = new FileOutputStream(new File(propFileName));
                prop.setProperty("isFirstRun", "false");
                prop.store(outStream, null);
            } catch (FileNotFoundException e) {
                System.err.println("找不到系统内部配置文件 " + propFileName);
                e.printStackTrace();
                System.exit(0);
            } catch (IOException e) {
                System.err.println("写入系统内部配置文件 " + propFileName + " 失败");
                e.printStackTrace();
                System.exit(0);
            }
        }

        // 否则不做任何处理
    }


    private static final String CREATE_INNER_DBS_INFO_TABLE_SQL =
            "CREATE TABLE IF NOT EXISTS inner_dbs_info_table" +
                    "(db_name VARCHAR(256) NOT NULL, " +
                    "type VARCHAR(256) NOT NULL, " +
                    "url VARCHAR(256) NOT NULL, " +
                    "username VARCHAR(256) NOT NULL, " +
                    "password VARCHAR(256) NOT NULL, " +
                    "driver VARCHAR(256) NOT NULL, " +
                    "PRIMARY KEY(db_name))";        // 创建 inner_dbs_info 数据表，用于存储底层数据库信息
    private static final String CREATE_INNER_TABLE_AND_DB_INFO_TABLE_SQL =
            "CREATE TABLE IF NOT EXISTS inner_table_and_db_info" +
                    "(table_name VARCHAR(256) NOT NULL, " +
                    "db_name VARCHAR(256) REFERENCES inner_dbs_info_table(db_name), " +
                    "PRIMARY KEY(table_name))";     // inner_table_and_db_info, 存储底层数据表和数据库之间的关系信息

    /**
     * 创建基础数据表
     *
     * @throws SQLException 创建数据表失败
     */
    private static void createTables() throws SQLException {
        connector.executeUpdate(CREATE_INNER_DBS_INFO_TABLE_SQL);
        connector.executeUpdate(CREATE_INNER_TABLE_AND_DB_INFO_TABLE_SQL);
    }


    private static final String INSERT_NEW_TABLE_SQL = "INSERT INTO inner_dbs_info_table VALUES('%s', '%s', '%s', '%s', '%s', '%s')";

    /**
     * 添加底层库信息到 inner_table_and_db_info 数据表中
     *
     * @param db_name  数据库名，命名规则为 db + 数字，数字从 1 起
     * @param type     数据库类型
     * @param url      数据库 URL
     * @param username 数据库用户名
     * @param password 数据库密码
     * @param driver   数据库 JDBC 连接驱动
     * @throws SQLException 执行 SQL 命令失败
     */
    private static void addNewInnerDatabase(String db_name, String type, String url, String username, String password, String driver) throws SQLException {
        String sql = String.format(INSERT_NEW_TABLE_SQL, db_name, type, url, username, password, driver);
        connector.executeUpdate(sql);
    }


    private static final String GET_INNER_DBS_INFO_SQL = "SELECT * FROM inner_dbs_info_table";

    /**
     * 从元数据库中获取底层库信息
     *
     * @return 底层库信息列表
     */
    public static ArrayList<InnerDatabase> getInnerDatabasesInfo() {
        ArrayList<InnerDatabase> innerDatabases = new ArrayList<InnerDatabase>();
        ResultSet rs = null;
        try {
            rs = connector.executeQuery(GET_INNER_DBS_INFO_SQL);
        } catch (SQLException e) {
            System.err.println("从元数据库中获取底层数据库信息失败");
            e.printStackTrace();
            System.exit(0);
        }

        if (rs != null) {
            try {
                while (rs.next()) {
                    String dbName = rs.getString("db_name");
                    String url = rs.getString("url");
                    String type = rs.getString("type");
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                    String driver = rs.getString("driver");
                    InnerDatabase innerDatabase = new InnerDatabase(dbName, url, type, username, password, driver);
                    innerDatabases.add(innerDatabase);
                }
            } catch (SQLException e) {
                System.err.println("Result Set 已经关闭");
                e.printStackTrace();
                System.exit(0);
            }
        }

        return innerDatabases;
    }
}
