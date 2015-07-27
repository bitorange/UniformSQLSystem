package cn.edu.bit.linc.zql.command;

import cn.edu.bit.linc.zql.databases.Database;

/**
 * SQL 命令生成适配器
 */
public abstract class CommandAdapter {
    public static Database.DBType dbType;

    public final static String CREATE_DATABASE = "CREATE DATABASE %s %s";
    public final static String DROP_DATABASE = "DROP DATABASE %s %s";
    public final static String CREATE_USER = "CREATE USER %s IDENTIFIED BY '%s'";
    public final static String GRANT_PRIV = "GRANT %s ON table_or_view_name TO %s %s";
    public final static String REVOKE_PRIV = "REVOKE %s ON %s TO %s %s";
    public final static String SHOW_GRANT = "SHOW GRANT %s ON %";
    public final static String DROP_TABLE = "DROP TABLE %s %s";
    public final static String ALTER_TABLE_NAME = "ALTER TABLE %s RENAME TO %s %s";


    /**
     * 创建数据库
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String createDatabase(Object... args) {
        String command = String.format(CREATE_DATABASE, args);
        return command;
    }

    /**
     * 删除数据库
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String dropDatabase(Object... args) {
        return String.format(DROP_DATABASE, args);
    }
}