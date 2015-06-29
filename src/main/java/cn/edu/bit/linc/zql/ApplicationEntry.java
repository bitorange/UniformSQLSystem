package cn.edu.bit.linc.zql;

import cn.edu.bit.linc.zql.connector.InnerDatabases;
import cn.edu.bit.linc.zql.connector.MetaDatabase;
import cn.edu.bit.linc.zql.parser.uniformSQLLexer;
import cn.edu.bit.linc.zql.parser.uniformSQLParser;
import cn.edu.bit.linc.zql.parser.visitor.VisitResult;
import cn.edu.bit.linc.zql.parser.visitor.ZQLVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

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
    private static void initSystem() {
        // 元数据库初始化（连接元数据库 / 初始化 JDBC 连接 / 判断是否第一次启动 / 读取底层库信息）
        MetaDatabase.initMetaDatabase();

        // 底层库初始化（尝试连接底层库，初始化 JDBC 连接）
        InnerDatabases.initInnerDatabases();
    }

    /**
     * 主函数
     *
     * @param args 程序参数
     */
    public static void main(String[] args) {
        // 解析程序运行参数，读取配置文件
        ApplicationEntry.readConfigureFile(args);
        // GlobalVar.printConf();

        // 系统初始化
        ApplicationEntry.initSystem();

        // 读取 ZQL 语句
        String sqlCommand = "CREATE DATABASE IF NOT EXISTS table_name";
        InputStream is = new ByteArrayInputStream(sqlCommand.getBytes(StandardCharsets.UTF_8));
        try {
            // 获取词法 / 语法解析器
            ANTLRInputStream input = new ANTLRInputStream(is);
            uniformSQLLexer lexer = new uniformSQLLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            uniformSQLParser parser = new uniformSQLParser(tokens);
            ParseTree tree = parser.root_statement();

            // 执行 SQL 语句
            InnerDatabases.executeSQLCommand(sqlCommand);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}