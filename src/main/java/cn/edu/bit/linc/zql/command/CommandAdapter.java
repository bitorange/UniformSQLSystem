package cn.edu.bit.linc.zql.command;

import cn.edu.bit.linc.zql.databases.Database;

/**
 * SQL 命令生成适配器
 */
public abstract class CommandAdapter {
    public static Database.DBType dbType;

    /**
     * 生成创建数据库命令
     *
     * @param dbName        数据库名
     * @param checkIsExists 是否检查数据库已经存在
     * @return 创建数据库命令
     */
    public abstract String createDatabase(String dbName, Boolean checkIsExists);
}