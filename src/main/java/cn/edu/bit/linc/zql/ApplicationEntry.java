package cn.edu.bit.linc.zql;

/**
 * 应用入口
 */
public class ApplicationEntry {
    /**
     * 解析程序运行参数，读取配置文件
     *
     * @param args 程序参数
     */
    private static void readConfigureFile(String[] args) {
        GlobalVar.parseArgs(args);
    }

    /**
     * 初始化系统
     */
    private static void initSystem(){
        // 元数据库初始化（连接元数据库 / 初始化 JDBC 连接 / 判断是否第一次启动 / 读取底层库信息）


        // 底层库初始化（尝试连接底层库，初始化 JDBC 连接）
    }

    /**
     * 主函数
     * @param args 程序参数
     */
    public static void main(String[] args){
        // 解析程序运行参数，读取配置文件
        ApplicationEntry.readConfigureFile(args);
        GlobalVar.printConf();

        // 系统初始化
        ApplicationEntry.initSystem();

        // 读取 ZQL 语句

        // 分别执行 ZQL 语句，输出结果
    }
}