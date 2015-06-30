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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 底层数据库
 */
public class InnerDatabases {
    private static ArrayList<InnerDatabase> databases = null;
    private static String defaultDatabaseName;

    /**
     * 获取创建数据库命令所指定的默认底层库
     *
     * @return 默认底层库
     */
    public static String getDefaultDatabaseName() {
        return defaultDatabaseName;
    }

    /**
     * 初始化底层数据库
     */
    public static void initInnerDatabases() {
        // 从元数据库中获取底层库信息
        InnerDatabases.databases = MetaDatabase.getInnerDatabasesInfo();

        // 从配置文件中获取默认数据库和数据表
        defaultDatabaseName = GlobalVar.configMap.get("innerdb.dafault.database");
    }

    /**
     * 执行 SQL 命令
     *
     * @param sqlCommand 需要执行的 SQL 命令
     * @throws IOException ？
     */
    public static ExecutiveResult executeSQLCommand(String sqlCommand) throws IOException, SQLException, InnerDBNotFoundException {
        /* 获取词法 / 语法解析器 */
        InputStream is = new ByteArrayInputStream(sqlCommand.getBytes(StandardCharsets.UTF_8));
        ANTLRInputStream input = new ANTLRInputStream(is);
        uniformSQLLexer lexer = new uniformSQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        uniformSQLParser parser = new uniformSQLParser(tokens);
        ParseTree tree = parser.root_statement();

        ZQLVisitor visitor = new ZQLVisitor();
        VisitResult visitResult = visitor.visit(tree);


        /* 执行 SQL */
        // 更新操作
        if (visitResult.getOperationType().equals("create_database_statement")) {
            for (InnerDatabase innerDatabase : databases) {
                if (visitResult.getDbName().equals(innerDatabase.getDbName())) {
                    int affectedRows = innerDatabase.getConnector().executeUpdate(visitResult.getResult());
                    return new ExecutiveResult("update", affectedRows, null);
                }
            }
        }
        // 查询操作
        else {
            for (InnerDatabase innerDatabase : databases) {
                if (visitResult.getDbName().equals(innerDatabase.getDbName())) {
                    ResultSet resultSet = innerDatabase.getConnector().executeQuery(visitResult.getResult());
                    return new ExecutiveResult("query", -1, resultSet);
                }
            }
        }
        throw new InnerDBNotFoundException();
    }

    /**
     * 获取指定数据库名的底层库类型
     *
     * @param dbName 数据库名
     * @return 底层库类型
     */
    public static String getDBType(String dbName) {
        for (InnerDatabase innerDatabase : databases) {
            if (innerDatabase.getDbName().equals(dbName)) {
                return innerDatabase.getType();
            }
        }
        return null;
    }

    /**
     * 指定名称的底层库不存在
     */
    public static class InnerDBNotFoundException extends Exception {
        public InnerDBNotFoundException() {
        }

        public InnerDBNotFoundException(String message) {
            super(message);
        }
    }
}
