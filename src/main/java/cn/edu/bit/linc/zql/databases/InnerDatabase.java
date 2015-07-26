package cn.edu.bit.linc.zql.databases;

/**
 * 底层数据库类，存储底层库相关的信息与操作
 */
public class InnerDatabase extends Database {
    /**
     * 构造函数
     *
     * @param dbId       数据库编号（从 1 开始，其中 0 表示元数据库）
     * @param dbType     数据库类型
     * @param dbAlias    数据库别名
     * @param dbHost     数据库地址
     * @param dbUser     数据库连接用户
     * @param dbPassword 数据库用户密码
     */
    public InnerDatabase(int dbId, DBType dbType, String dbAlias, String dbHost, String dbUser, String dbPassword) {
        super(dbId, dbType, dbAlias, dbHost, dbUser, dbPassword);
    }
}
