package cn.edu.bit.linc.zql.connector;

import java.sql.SQLException;

/**
 * 底层数据库类
 */
public class InnerDatabase {
    private String dbName, url, type, username, password, driver;
    private JDBCConnector connector;

    /**
     * 获取底层数据库名
     *
     * @return 底层数据库名
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * 获取底层数据库 URL
     *
     * @return 底层数据库 URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * 获取底层数据库类型
     *
     * @return 底层数据库类型
     */
    public String getType() {
        return type;
    }

    /**
     * 获取底层数据库用户名
     *
     * @return 底层数据库用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 获取底层数据库密码
     *
     * @return 底层数据库密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 获取底层数据库 JDBC 驱动名
     *
     * @return 底层数据库 JDBC 驱动名
     */
    public String getDriver() {
        return driver;
    }

    /**
     * 获取 JDBC 连接器
     *
     * @return JDBC 连接器
     */
    public JDBCConnector getConnector() {
        return connector;
    }

    /**
     * 构造函数，连接远程数据库
     *
     * @param dbName   唯一标示的底层数据库名
     * @param url      底层数据库 URL
     * @param type     底层数据库类型
     * @param username 底层数据库用户名
     * @param password 底层数据库密码
     * @param driver   底层数据库驱动
     */
    public InnerDatabase(String dbName, String url, String type, String username, String password, String driver) {
        this.dbName = dbName;
        this.url = url;
        this.type = type;
        this.username = username;
        this.password = password;
        this.driver = driver;

        try {
            this.connector = new JDBCConnector(url, username, password, "", driver);
        } catch (ClassNotFoundException e) {
            System.err.println("找不到底层数据库 JDBC 驱动 " + driver);
            e.printStackTrace();
            System.exit(0);
        } catch (SQLException e) {
            System.err.println("连接到底层数据库 + " + dbName + "(" + url + ")" + " + 失败");
            e.printStackTrace();
            System.exit(0);
        } catch (JDBCConnector.NotSupportDatabaseException e) {
            System.err.println("不支持的底层数据库类型");
            e.printStackTrace();
            System.exit(0);
        }
    }
}
