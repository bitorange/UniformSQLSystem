package cn.edu.bit.linc.zql.connector;

import java.sql.*;

/**
 * JDBC 连接器
 */
public class JDBCConnector {
    private String url, username, password, driver;
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
     */
    public JDBCConnector(String url, String username, String password, String driver) throws ClassNotFoundException, SQLException {
        this.url = url;
        this.username = username;
        this.password = password;
        this.driver = driver;

        // 连接数据库
        Class.forName(this.driver);
        this.conn = DriverManager.getConnection(url, username, password);
        this.stmt = conn.createStatement();
    }

    /**
     * 执行 SQL 命令
     *
     * @param sql 需要执行的 SQL 命令
     * @return SQL 命令执行结果
     * @throws SQLException 执行 SQL 命令失败
     */
    public ResultSet execute(String sql) throws SQLException {
        ResultSet resultSet = stmt.executeQuery(sql);
        return resultSet;
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
