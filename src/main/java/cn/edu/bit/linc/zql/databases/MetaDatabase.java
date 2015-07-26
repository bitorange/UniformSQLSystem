package cn.edu.bit.linc.zql.databases;

import cn.edu.bit.linc.zql.ZQLEnv;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;

/**
 * 元数据库类，存储元数据相关的信息与操作
 */
public class MetaDatabase extends Database {
    private final static Logger logger = LoggerFactory.getLogger(MetaDatabase.class);

    /**
     * 构造函数
     *
     * @param dbId       数据库编号（从 0 开始，其中 0 表示元数据库）
     * @param dbType     数据库类型
     * @param dbAlias    数据库别名
     * @param dbHost     数据库地址
     * @param dbUser     数据库连接用户
     * @param dbPassword 数据库用户密码
     */
    private MetaDatabase(int dbId, DBType dbType, String dbAlias, String dbHost, String dbUser, String dbPassword) {
        super(dbId, dbType, dbAlias, dbHost, dbUser, dbPassword);
    }

    private String metaDbName;  // 元数据库中，存储元数据的数据库的名字
    public final static int META_DB_ID = 0;    // 元数据库的编号固定为 1
    public final static String META_DB_ALIAS = "db_meta";   // 元数据库的别名固定为 db_meta
    public final static DBType META_DB_TYPE = DBType.MySQL; // 元数据的数据库类型固定为 MySQL

    /**
     * 获取元数据库中，存储元数据的数据库的名字
     *
     * @return 存储元数据的数据库的名字
     */
    public String getMetaDbName() {
        return metaDbName;
    }

    /**
     * 空构造函数
     */
    private MetaDatabase(String dbHost, String dbUser, String dbPassword, String metaDbName) {
        super(META_DB_ID, META_DB_TYPE, META_DB_ALIAS, dbHost, dbUser, dbPassword);
        this.metaDbName = metaDbName;
    }

    private static MetaDatabase metaDatabase = null;

    /**
     * 获取 MetaDatabase 实例
     *
     * @return MetaDatabase 实例
     */
    public static MetaDatabase getInstance() {
        if(metaDatabase == null){
            readMetaDatabaseFromConfigurationFile();
            createMetaDatabase();
        }
        return metaDatabase;
    }


    /**
     * 从系统配置中读取元数据库信息
     */
    private static void readMetaDatabaseFromConfigurationFile() {
        logger.i("正在从配置文件中读取元数据库信息");
        String host = ZQLEnv.get("metadb.host");
        String user = ZQLEnv.get("metadb.username");
        String password = ZQLEnv.get("metadb.password");
        String dbName = ZQLEnv.get("metadb.dbname");
        metaDatabase = new MetaDatabase(host, user, password, dbName);
    }

    /**
     * 创建元数据库
     */
    private static void createMetaDatabase() {
        logger.d("正在创建元数据库");
    }
}
