package cn.edu.bit.linc.zql.command;

import cn.edu.bit.linc.zql.connections.ZQLSession;
import cn.edu.bit.linc.zql.connections.connector.ConnectionPools;
import cn.edu.bit.linc.zql.databases.MetaDatabase;
import cn.edu.bit.linc.zql.exceptions.MetaDatabaseOperationsException;
import cn.edu.bit.linc.zql.exceptions.ZQLCommandExecutionError;
import cn.edu.bit.linc.zql.exceptions.ZQLConnectionException;
import cn.edu.bit.linc.zql.exceptions.ZQLSyntaxErrorException;
import cn.edu.bit.linc.zql.parser.uniformSQLLexer;
import cn.edu.bit.linc.zql.parser.uniformSQLParser;
import cn.edu.bit.linc.zql.parser.visitor.ASTNodeVisitResult;
import cn.edu.bit.linc.zql.parser.visitor.ZQLVisitor;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * SQL 命令类，用于执行 SQL 命令并保存执行结果
 */
public class SQLCommand {
    // TODO: 子类重载域

    /**
     * SQL 命令类型
     */
    public enum CommandType {
        CREATE_DATABASE_STATEMENT,
        CREATE_EVENT_STATEMENT,
        DROP_DATABASE_STATEMENT,
        // -- Update / Query 分割线 --

    }

    /**
     * 构造器
     *
     * @param sqlCommand 希望执行的 SQL 命令
     * @param session    用户会话
     */
    public SQLCommand(String sqlCommand, ZQLSession session) {
        this.sqlCommand = sqlCommand;
        this.session = session;
    }

    /**
     * 执行 SQL 命令
     */
    public boolean execute() {
        // TODO: 抛出异常给外部处理
        /* 检测语法错误 */
        InputStream is = new ByteArrayInputStream(sqlCommand.getBytes(StandardCharsets.UTF_8));
        ANTLRInputStream ais;
        try {
            ais = new ANTLRInputStream(is);
        } catch (IOException e) {
            ZQLSyntaxErrorException zqlSyntaxErrorException = new ZQLSyntaxErrorException();
            zqlSyntaxErrorException.initCause(e);
            logger.e("发生语法错误：" + sqlCommand, zqlSyntaxErrorException);
            return false;
        }

        /* 词法解析器与语法解析器 */
        uniformSQLLexer lexer = new uniformSQLLexer(ais);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        uniformSQLParser parser = new uniformSQLParser(tokens);

        /* 遍历语法树 */
        ParseTree tree = parser.root_statement();
        ZQLVisitor visitor = new ZQLVisitor();
        ASTNodeVisitResult visitResult = visitor.visit(tree);
        if (visitResult == null) {
            ZQLCommandExecutionError zqlConnectionException = new ZQLCommandExecutionError();
            logger.e("反向生成 SQL 命令失败", zqlConnectionException);
            return false;
        }

        /* 通过连接池连接底层库 */
        int dbId = visitResult.getDbId();
        ConnectionPools connectionPools = ConnectionPools.getInstance();
        Connection connection;
        Statement statement;
        try {
            connection = connectionPools.getConnection(dbId);
            statement = connection.createStatement();
        } catch (SQLException e) {
            ZQLConnectionException zqlConnectionException = new ZQLConnectionException();
            zqlConnectionException.initCause(e);
            logger.e("连接到底层库 " + dbId + " 失败", zqlConnectionException);
            return false;
        }

        /* 交付底层库执行 SQL 命令 */
        boolean isQuery;
        try {
            logger.d("在底层库 " + dbId + " 中执行指令 " + visitResult.getSqlCommandOrValue());
            isQuery = statement.execute(visitResult.getSqlCommandOrValue());
        } catch (SQLException e) {
            ZQLCommandExecutionError zqlCommandExecutionError = new ZQLCommandExecutionError();
            zqlCommandExecutionError.initCause(e);
            logger.e("底层库 " + dbId + " 执行 SQL 命令失败：" + sqlCommand, zqlCommandExecutionError);
            return false;
        }

        /* 获取结果 */
        if (isQuery) {
            try {
                this.resultSet = statement.getResultSet();
            } catch (SQLException e) {
                ZQLCommandExecutionError zqlCommandExecutionError = new ZQLCommandExecutionError();
                zqlCommandExecutionError.initCause(e);
                logger.e("从底层库 " + dbId + " 中获取 Result Set 失败：" + sqlCommand, zqlCommandExecutionError);
                return false;
            }
        } else {
            try {
                this.updateCount = statement.getUpdateCount();
            } catch (SQLException e) {
                ZQLCommandExecutionError zqlCommandExecutionError = new ZQLCommandExecutionError();
                zqlCommandExecutionError.initCause(e);
                logger.e("从底层库 " + dbId + " 中获取 Update Row 失败：" + sqlCommand, zqlCommandExecutionError);
                return false;
            }
        }

        // TODO:
        /* 更新元数据库 */
        if (visitResult.getCommandType() == CommandType.CREATE_DATABASE_STATEMENT && this.updateCount != -1) {
            try {
                metaDatabase.addNewDatabase(dbId, visitResult.getArgs()[1], session.getUserName());
            } catch (MetaDatabaseOperationsException e) {
                logger.e("更新元数据库失败", e);
                return false;
            }
        }

        return true;
    }

    /**
     * 返回 SQL 命令与执行结果（如果存在）的格式化字符串
     *
     * @return SQL 命令与执行结果（如果存在）的格式化字符串
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SQL Command: " + sqlCommand + "\n");
        if (resultSet != null) {
            // TODO: 格式化 ResultSet
        } else if (updateCount != -1) {
            stringBuilder.append("Updated " + updateCount + " rows");
        }

        return stringBuilder.toString();
    }

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final String sqlCommand;    // SQL 指令
    private final MetaDatabase metaDatabase = MetaDatabase.getInstance();
    private final ZQLSession session;   // 用户会话
    private ResultSet resultSet = null; // 执行结果，仅在执行结果返回 ResultSet 时候该值不为 null
    private int updateCount = -1;       // 更新行数，仅在执行结果返回数值时候该值不为 - 1
}
