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
     * 主函数
     * @param args 程序参数
     */
    public static void main(String[] args){
        // 解析程序运行参数，读取配置文件
        ApplicationEntry.readConfigureFile(args);
        GlobalVar.printConf();

        // 系统初始化

        // 读取 ZQL 语句

        // 分别执行 ZQL 语句，输出结果
    }
}