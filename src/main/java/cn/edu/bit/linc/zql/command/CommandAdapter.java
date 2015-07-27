package cn.edu.bit.linc.zql.command;

import cn.edu.bit.linc.zql.databases.Database;

/**
 * SQL 命令生成适配器
 */
public abstract class CommandAdapter {
    public static Database.DBType dbType;
    /* 当前以 MySQL 语法为准 */
    public final static String CREATE_USER = "CREATE USER %s IDENTIFIED BY '%s'";   // CREATE USER ihainan IDENTIFIED BY 123456，只考虑 MySQL
    public final static String DROP_USER = "DELETE FROM %s.zql_user";  // DROP user ihainan，只考虑 MySQL

    public final static String GRANT = "GRANT %s ON table_or_view_name TO %s %s";  // GRANT SELECT, DELETE ON table_test TO ihainan, snow [WITH GRANT OPTION]，只考虑 MySQL
    public final static String REVOKE_GRANT = "REVOKE %s %s ON %s TO %s %s"; // REVOKE SELECT, DELETE ON table_test [GRANT OPTION] FROM ihainan, snow
    public final static String SHOW_GRANT = "SHOW GRANT %s ON %s %s";   // SHOW GRANT FOR ihainan

    public final static String DROP_TABLE = "DROP TABLE %s %s";         // DROP TABLE [IF EXISTS] tb_name
    public final static String ALTER_TABLE_NAME = "RENAME TABLE %s TO %s"; // RENAME TABLE old_table TO backup_table
    public final static String ALTER_COLUMN_NAME = "ALTER TABLE %s CHANGE COLUMN %s %s %s"; // ALTER TABLE table_name CHANGE COLUMN old_name new_name type
    public final static String SHOW_TABLES = "SHOW TABLES %s %s";    // SHOW TABLES [IN db_test] [LIKE "db_*"]
    public final static String SHOW_COLUMNS = "SHOW COLUMNS FROM %s %s"; // SHOW COLUMNS FROM tb_name [FROM db_name]

    public final static String CREATE_DATABASE = "CREATE DATABASE %s %s";   // CREATE DATABASE [IF NOT EXISTS] db_name
    public final static String CREATE_DATABASE_META_DB = "INSERT IGNORE INTO %s.zql_dbs VALUES('%s', '%s', '%s', '%s', '%s')";

    public final static String SHOW_DATABASES = "SHOW DATABASES %s";        // SHOW DATABASES [LIKE "fuck you"];
    public final static String DROP_DATABASE = "DROP DATABASE %s %s";       // DROP DATABASE [IF EXISTS] db_name
    public final static String USE_DATABASE = "USE %s"; // USE db_name

    /**
     * 删除用户
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String dropUser(Object... args) {
        String command = String.format(DROP_USER, args);
        return command;
    }

    /**
     * 授权
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String grant(Object... args) {
        String command = String.format(GRANT, args);
        return command;
    }

    /**
     * 回收授权
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String revokeGrant(Object... args) {
        String command = String.format(REVOKE_GRANT, args);
        return command;
    }

    /**
     * 显示授权
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String showGrant(Object... args) {
        String command = String.format(SHOW_GRANT, args);
        return command;
    }

    /**
     * 删除数据表
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String dropTable(Object... args) {
        String command = String.format(DROP_TABLE, args);
        return command;
    }

    /**
     * 修改数据表名
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String alterTableName(Object... args) {
        String command = String.format(ALTER_TABLE_NAME, args);
        return command;
    }

    /**
     * 修改数据列
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String alterColumnName(Object... args) {
        String command = String.format(ALTER_COLUMN_NAME, args);
        return command;
    }

    /**
     * 显示数据表
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String showTables(Object... args) {
        String command = String.format(SHOW_TABLES, args);
        return command;
    }

    /**
     * 显示数据列
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String showColumns(Object... args) {
        String command = String.format(SHOW_COLUMNS, args);
        return command;
    }

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
     * 创建数据库 - 更新元数据库
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String createDatabaseMetaDb(Object... args) {
        String command = String.format(CREATE_DATABASE_META_DB, args);
        return command;
    }

    /**
     * 查看数据库
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String showDatabases(Object... args) {
        String command = String.format(SHOW_DATABASES, args);
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

    /**
     * 使用指定数据库
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String useDatabase(Object... args) {
        String command = String.format(USE_DATABASE, args);
        return command;
    }

    /**
     * 创建用户
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String createUser(Object... args) {
        String command = String.format(CREATE_USER, args);
        return command;
    }
}