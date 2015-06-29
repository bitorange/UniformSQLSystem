package cn.edu.bit.linc.zql.connector;

import java.sql.*;

/**
 * JDBC 连接器
 */
public class JDBCConnector {
    private String url, username, password, dbName, driver;
    private Connection conn = null;
    private Statement stmt = null;

    /**
     * 获取 Connection 对象
     *
     * @return Connection 对象
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * 获取 Statement 对象
     *
     * @return Statement 对象
     */
    public Statement getStmt() {
        return stmt;
    }

    /**
     * 构造器，加载驱动器类并尝试连接远程服务器
     *
     * @param url      服务器地址
     * @param username 数据库用户名
     * @param password 数据库密码
     * @param driver   数据库 JDBC 驱动程序
     * @throws java.lang.ClassNotFoundException 找不到 JDBC 驱动
     * @throws java.sql.SQLException            连接远程数据库失败
     * @throws NotSupportDatabaseException      不支持的数据库类型
     */
    public JDBCConnector(String url, String username, String password, String dbName, String driver) throws ClassNotFoundException, SQLException, NotSupportDatabaseException {
        this.username = username;
        this.password = password;
        this.driver = driver;
        this.dbName = dbName;

        // 构建 URL
        if (driver.equals("com.mysql.jdbc.Driver")) {
            this.url = "jdbc:mysql://" + url + "/" + dbName;
        } else if (driver.equals("org.apache.hive.jdbc.HiveDriver")) {
            this.url = "jdbc:hive://" + url + "/" + dbName;
        } else {
            throw new NotSupportDatabaseException();
        }

        // 连接数据库
        // TODO: 未抛出异常？
        Class.forName(this.driver);
        this.conn = DriverManager.getConnection(this.url, this.username, this.password);
        this.stmt = conn.createStatement();
    }

    /**
     * 遇见系统不支持的数据库抛出的异常
     */
    public class NotSupportDatabaseException extends Exception {
        public NotSupportDatabaseException() {
        }

        public NotSupportDatabaseException(String message) {
            super(message);
        }
    }

    /**
     * 执行 SQL 查询命令
     *
     * @param sql 需要执行的 SQL 命令
     * @return SQL 命令执行结果
     * @throws SQLException 执行 SQL 命令失败
     */
    public ResultSet executeQuery(String sql) throws SQLException {
        ResultSet resultSet = stmt.executeQuery(sql);
        return resultSet;
    }

    /**
     * 执行 SQL 更新命令
     *
     * @param sql 需要执行的 SQL 命令
     * @return 更改的行数
     * @throws SQLException 执行 SQL 命令失败
     */
    public int executeUpdate(String sql) throws SQLException {
        return stmt.executeUpdate(sql);
    }


    /**
     * 析构函数
     *
     * @throws Throwable 析构出现错误
     */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
