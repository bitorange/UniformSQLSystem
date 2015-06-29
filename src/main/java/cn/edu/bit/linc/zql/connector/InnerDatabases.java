package cn.edu.bit.linc.zql.connector;

import cn.edu.bit.linc.zql.GlobalVar;
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
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 底层数据库
 */
public class InnerDatabases {
    private static ArrayList<InnerDatabase> databases = null;
    private static String defaultDatabaseName;

    /**
     * 初始化底层数据库
     */
    public static void initInnerDatabases(){
        // 从元数据库中获取底层库信息
        InnerDatabases.databases = MetaDatabase.getInnerDatabasesInfo();

        // 从配置文件中获取默认数据库和数据表
        defaultDatabaseName = GlobalVar.configMap.get("innerdb.dafault.database");
    }

    /**
     * 执行 SQL 命令
     * @param sqlCommand 需要执行的 SQL 命令
     * @throws IOException ？
     */
    public static void executeSQLCommand(String sqlCommand) throws IOException {
        InputStream is = new ByteArrayInputStream(sqlCommand.getBytes(StandardCharsets.UTF_8));

        // 获取词法 / 语法解析器
        // TODO: 异常解析
        ANTLRInputStream input = new ANTLRInputStream(is);
        uniformSQLLexer lexer = new uniformSQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        uniformSQLParser parser = new uniformSQLParser(tokens);
        ParseTree tree = parser.root_statement();

        ZQLVisitor visitor = new ZQLVisitor();
        VisitResult visitResult = visitor.visit(tree);

        // 执行 SQL
        if(visitResult.getOperationType() != null && visitResult.getOperationType().equals("create_database_statement")) {
            for (InnerDatabase innerDatabase : databases) {
                if (defaultDatabaseName != null && defaultDatabaseName.equals(innerDatabase.getDbName())) {
                    try {
                        innerDatabase.getConnector().executeUpdate(sqlCommand);
                    } catch (SQLException e) {
                        System.err.println("执行 SQL 命令失败");
                        e.printStackTrace();
                    }
                    break;
                }
            }
        }
    }
}
