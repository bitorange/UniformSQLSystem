package cn.edu.bit.linc.zql.command;

import cn.edu.bit.linc.zql.databases.Database;

import java.util.HashMap;
import java.util.Map;

/**
 * SQL 命令生成适配器
 */
public abstract class CommandAdapter {
    public static Database.DBType dbType;

    /* 数据类型映射 - 当前以 MySQL 为准 */
    public static Map<String, String> TYPE_MAP = new HashMap<String, String>();

    static {
        TYPE_MAP.put("TINYINT", "TINYINT");
        TYPE_MAP.put("SMALLINT", "SMALLINT");
        TYPE_MAP.put("INT", "INT");
        TYPE_MAP.put("BIGINT", "BIGINT");
        TYPE_MAP.put("FLOAT", "FLOAT");
        TYPE_MAP.put("DOUBLE", "DOUBLE");
        TYPE_MAP.put("DECIMAL", "DECIMAL");
        TYPE_MAP.put("TIMESTAMP", "TIMESTAMP");
        TYPE_MAP.put("DATE", "DATE");
        TYPE_MAP.put("VARCHAR", "VARCHAR");  // TODO: 长度限制
        TYPE_MAP.put("Boolean", "ENUM('true'', 'false'')");
        TYPE_MAP.put("BINARY", "_BLOB");
    }

    /* 当前以 MySQL 语法为准 */
    public final static String CREATE_USER = "INSERT INTO %s.`zql_users` VALUES('%s', '%s')";   // CREATE USER ihainan IDENTIFIED BY 123456，只考虑 MySQL
    public final static String DROP_USER = "DELETE FROM %s.zql_users WHERE User = '%s'";  // DROP user ihainan，只考虑 MySQL

    public final static String GRANT = "INSERT IGNORE INTO %s.zql_tables_priv VALUES('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')";  // GRANT SELECT, DELETE ON table_test TO ihainan, snow [WITH GRANT OPTION]，只考虑 MySQL
    public final static String UPDATE_GRANT = "UPDATE %s.zql_tables_priv SET %s WHERE User = '%s' and Db = '%s' and Tb = '%s'";

    public final static String REVOKE_GRANT = "REVOKE %s %s ON %s TO %s %s"; // REVOKE SELECT, DELETE ON table_test [GRANT OPTION] FROM ihainan, snow

    public final static String SHOW_GRANT = "SELECT * FROM %s.zql_tables_priv WHERE %s and %s";   // SHOW GRANT FOR ihainan

    public final static String DROP_TABLE = "DROP TABLE %s %s"; // DROP TABLE [IF EXISTS] tb_name
    public final static String DROP_TABLE_META_DB = "DELETE FROM %s.zql_tables WHERE Tb = '%s' and Db = '%s'";

    public final static String CREATE_TABLE = "CREATE %s %s TABLE %s %s.%s (%s) %s %s";
    public final static String CREATE_TABLE_META = "INSERT INTO %s.zql_tables VALUES('%s', '%s', '%s', '%s')";


    public final static String ALTER_TABLE_NAME = "RENAME TABLE %s TO %s"; // RENAME TABLE old_table TO backup_table
    public final static String ALTER_TABLE_NAME_META_DB = "UPDATE %s.zql_tables SET Tb = '%s' WHERE Tb = '%s' and Db = '%s'";

    public final static String ALTER_COLUMN_NAME = "ALTER TABLE %s CHANGE COLUMN %s %s %s"; // ALTER TABLE table_name CHANGE COLUMN old_name new_name type

    public final static String SHOW_TABLES = "SELECT * FROM %s.zql_tables WHERE %s and %s";    // SHOW TABLES [IN db_test] [LIKE "db_*"]
    public final static String SHOW_COLUMNS = "SHOW COLUMNS FROM %s %s"; // SHOW COLUMNS FROM tb_name [FROM db_name]

    public final static String SHOW_CREATE_TABLE = "SHOW CREATE TABLE %s";

    public final static String CREATE_DATABASE = "CREATE DATABASE %s %s";   // CREATE DATABASE [IF NOT EXISTS] db_name
    public final static String CREATE_DATABASE_META_DB = "INSERT IGNORE INTO %s.zql_dbs VALUES('%s', '%s', '%s', '%s', '%s')";

    public final static String SHOW_DATABASES = "SELECT * FROM %s.zql_dbs %s";        // SHOW DATABASES [LIKE "fuck you"];

    public final static String DROP_DATABASE = "DROP DATABASE %s %s";       // DROP DATABASE [IF EXISTS] db_name
    public final static String DROP_DATABASE_META_DB = "DELETE FROM %s.zql_dbs WHERE Db = '%s'";

    public final static String USE_DATABASE = "USE %s"; // USE db_name

    public final static String SHOW_SERVER_ALIASES = "SELECT Inner_db_id, Db_alias FROM %s.zql_dbs";

    public final static String SELECT = "SELECT %s %s FROM %s %s %s %s %s";

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
     * 更新
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String updateGrant(Object... args) {
        String command = String.format(UPDATE_GRANT, args);
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
     * 创建数据表
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String createTable(Object... args) {
        String command = String.format(CREATE_TABLE, args);
        return command;
    }

    /**
     * 创建数据表 - 元数据库
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String createTableMateDb(Object... args) {
        String command = String.format(CREATE_TABLE_META, args);
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
     * 删除数据表 - 元数据库
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String dropTableMetaDb(Object... args) {
        String command = String.format(DROP_TABLE_META_DB, args);
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
     * 修改数据表名 - 元数据库
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String alterTableNameMetaDb(Object... args) {
        String command = String.format(ALTER_TABLE_NAME_META_DB, args);
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
     * 查看创建表语句
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String showCreateTable(Object... args) {
        String command = String.format(SHOW_CREATE_TABLE, args);
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
     * 删除数据库 - 更新元数据库
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String dropDatabaseMetaDb(Object... args) {
        return String.format(DROP_DATABASE_META_DB, args);
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

    /**
     * 显示 DB 别名
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String showServerAliases(Object... args) {
        String command = String.format(SHOW_SERVER_ALIASES, args);
        return command;
    }

    /**
     * SELECT
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String select(Object... args) {
        String command = String.format(SELECT, args);
        return command;
    }

}