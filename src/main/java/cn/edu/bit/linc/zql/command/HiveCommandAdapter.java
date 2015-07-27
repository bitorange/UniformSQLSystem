package cn.edu.bit.linc.zql.command;

import cn.edu.bit.linc.zql.databases.Database;

/**
 * Hive SQL 命令生成适配器
 */
public class HiveCommandAdapter extends CommandAdapter {
    static {
        dbType = Database.DBType.Hive;
    }
}
