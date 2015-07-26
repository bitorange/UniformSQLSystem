package cn.edu.bit.linc.zql.connections;

import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;

import java.util.Date;

/**
 * 会话类，用于存储用户会话，每个实例对应一个连接
 */
public class ZQLSession {
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 构造函数
     *
     * @param userName 连接用户名
     * @param database 连接数据库
     * @param token    挑战认证数据
     */
    public ZQLSession(String userName, String database, String token) {
        this.userName = userName;
        this.database = database;
        this.token = token;
        connectedTime = new Date();
        logger.i("用户 " + userName + " 于 " + connectedTime.toString() + " 创建新会话" + ((database == null) ? "" : "，连接到数据库 " + database));
    }

    private String userName;
    private String database;
    private String token;   // Scramble Info
    private Date connectedTime;

    /**
     * 获取连接用户名
     *
     * @return 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 获取连接数据库，可以为空
     *
     * @return 所连接数据库，可能会 null
     */
    public String getDatabase() {
        return database;
    }

    /**
     * 修改用户所连接的数据库（use db_name 命令）
     *
     * @param database 用户新连接的数据库
     */
    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * 获取挑战认证数据
     *
     * @return 挑战认证数据
     */
    public String getToken() {
        return token;
    }

    /**
     * 获取会话建立时间
     *
     * @return 会话建立时间
     */
    public Date getConnectedTime() {
        return connectedTime;
    }
}
