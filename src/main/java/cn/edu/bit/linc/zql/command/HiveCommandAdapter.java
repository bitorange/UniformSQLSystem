package cn.edu.bit.linc.zql.command;

import cn.edu.bit.linc.zql.databases.Database;

/**
 * Hive SQL 命令生成适配器
 */
public class HiveCommandAdapter extends CommandAdapter {
    static {
        dbType = Database.DBType.Hive;

        /* Hive 模板在此定义*/
        CREATE_USER = "INSERT INTO %s.`zql_users` VALUES('%s', '%s')";   // CREATE USER ihainan IDENTIFIED BY 123456，只考虑 MySQL
    }
}
