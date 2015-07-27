package cn.edu.bit.linc.zql.parser.visitor;

import cn.edu.bit.linc.zql.ZQLEnv;
import cn.edu.bit.linc.zql.command.HiveCommandAdapter;
import cn.edu.bit.linc.zql.command.InnerSQLCommand;
import cn.edu.bit.linc.zql.command.MySQLCommandAdapter;
import cn.edu.bit.linc.zql.command.SQLCommandBuilder;
import cn.edu.bit.linc.zql.connections.ZQLSession;
import cn.edu.bit.linc.zql.databases.Database;
import cn.edu.bit.linc.zql.databases.InnerDatabase;
import cn.edu.bit.linc.zql.databases.InnerDatabases;
import cn.edu.bit.linc.zql.databases.MetaDatabase;
import cn.edu.bit.linc.zql.exceptions.MetaDatabaseOperationsException;
import cn.edu.bit.linc.zql.parser.uniformSQLBaseVisitor;
import cn.edu.bit.linc.zql.parser.uniformSQLParser;
import org.apache.commons.net.ntp.TimeStamp;

import java.util.ArrayList;
import java.util.Date;

/**
 * 抽象语法树访问器
 */
public class ZQLVisitor extends uniformSQLBaseVisitor<ASTNodeVisitResult> {
    /**
     * 命令生成器
     */
    public final static SQLCommandBuilder sqlCommandBuilder = new SQLCommandBuilder()
            .addAdapter(new MySQLCommandAdapter())
            .addAdapter(new HiveCommandAdapter());
    private final static InnerDatabases innerDatabase = InnerDatabases.getInstance();
    private final static ArrayList<InnerDatabase> innerDatabasesArrayList = innerDatabase.getInnerDatabaseArray();
    private final static MetaDatabase metaDatabase = MetaDatabase.getInstance();
    private final ZQLSession session;

    public ZQLVisitor(ZQLSession session) {
        this.session = session;
    }

    /**
     * 用户名节点
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitUser_name(uniformSQLParser.User_nameContext ctx) {
        String value = ctx.any_name().getText();
        ASTNodeVisitResult result = new ASTNodeVisitResult(value, null, null);
        return result;
    }

    /**
     * 获取密码字段
     *
     * @param ctx 节点上下文
     * @return 访问结果
     */
    @Override
    public ASTNodeVisitResult visitPassword(uniformSQLParser.PasswordContext ctx) {
        String value = ctx.any_name().getText();
        ASTNodeVisitResult result = new ASTNodeVisitResult(value, null, null);
        return result;
    }

    /**
     * 创建用户 Statement
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitCreate_event_statement(uniformSQLParser.Create_event_statementContext ctx) {
        /* 获取子节点数据 */
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();
        String userName = visit(ctx.user_name()).getValue();
        String passWord = visit(ctx.password()).getValue();

        /* 元数据库命令 */
        InnerSQLCommand metaDbCommand = sqlCommandBuilder.createUser(Database.DBType.MySQL, metaDatabase.getMetaDbName(), userName, passWord);
        commands.add(metaDbCommand);
        dbIds.add(0);

        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 授权用户
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitGrant_event_statement(uniformSQLParser.Grant_event_statementContext ctx) {
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 获取子节点数据 */
        String tbName = visit(ctx.table_name()).getValue();

        // 权限表
        ArrayList<String> privs = new ArrayList<String>();
        for (int i = 0; i < ctx.priv_type().size(); i++) {
            uniformSQLParser.Priv_typeContext context = ctx.priv_type().get(i);
            ASTNodeVisitResult visitPrivTypeNodeResult = visit(context);
            privs.add(visitPrivTypeNodeResult.getValue());
        }

        // 用户表
        ArrayList<String> specs = new ArrayList<String>();
        for (int i = 0; i < ctx.principal_specification().size(); ++i) {
            uniformSQLParser.Principal_specificationContext context = ctx.principal_specification().get(i);
            ASTNodeVisitResult visitPrincipalSpeNodeResult = visit(context);
            specs.add(visitPrincipalSpeNodeResult.getValue());
        }

        boolean withGrantOption = ctx.WITH() == null;

        /* 元数据库命令 */
        // TODO: 权限检查
        for (String spec : specs) {
            InnerSQLCommand metaDbCommand = sqlCommandBuilder.grant(Database.DBType.MySQL, metaDatabase.getMetaDbName(),
                    spec, session.getDatabase(), tbName
                    , privs.contains("SELECT") ? "Y" : "N"
                    , privs.contains("INSERT") ? "Y" : "N"
                    , privs.contains("UPDATE") ? "Y" : "N"
                    , privs.contains("DELETE") ? "Y" : "N"
                    , privs.contains("ALL") ? "Y" : "N"
            );
            commands.add(metaDbCommand);
            dbIds.add(0);

            InnerSQLCommand metaDbCommandUpdate = sqlCommandBuilder.updateGrant(Database.DBType.MySQL, metaDatabase.getMetaDbName()
                    , "Select_priv = '" + (privs.contains("SELECT") ? "Y" : "N") + "', " +
                            "Insert_priv = '" + (privs.contains("INSERT") ? "Y" : "N") + "', " +
                            "Update_priv = '" + (privs.contains("UPDATE") ? "Y" : "N") + "', " +
                            "Delete_priv = '" + (privs.contains("DELETE") ? "Y" : "N") + "', " +
                            "All_priv = '" + (privs.contains("ALL") ? "Y" : "N") + "'",
                    spec, session.getDatabase(), tbName
            );
            commands.add(metaDbCommandUpdate);
            dbIds.add(0);
        }

        // TODO: 考虑 WITH GRANT OPTION，修改 zql_users 表

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 撤销授权
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitRevoke_event_statement(uniformSQLParser.Revoke_event_statementContext ctx) {
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 获取子节点数据 */
        String tbName = visit(ctx.table_name()).getValue();

        // 权限表
        ArrayList<String> privs = new ArrayList<String>();
        for (int i = 0; i < ctx.priv_type().size(); i++) {
            uniformSQLParser.Priv_typeContext context = ctx.priv_type().get(i);
            ASTNodeVisitResult visitPrivTypeNodeResult = visit(context);
            privs.add(visitPrivTypeNodeResult.getValue());
        }

        // 用户表
        ArrayList<String> specs = new ArrayList<String>();
        for (int i = 0; i < ctx.principal_specification().size(); ++i) {
            uniformSQLParser.Principal_specificationContext context = ctx.principal_specification().get(i);
            ASTNodeVisitResult visitPrincipalSpeNodeResult = visit(context);
            specs.add(visitPrincipalSpeNodeResult.getValue());
        }

        /* 元数据库命令 */
        // TODO: 权限检查
        for (String spec : specs) {
            String setStr = "";
            for (int i = 0; i < privs.size(); ++i) {
                setStr += getGrantUpdateSet(privs.get(i), i, privs.size());
            }
            InnerSQLCommand metaDbCommandUpdate = sqlCommandBuilder.updateGrant(Database.DBType.MySQL, metaDatabase.getMetaDbName()
                    , setStr, spec, session.getDatabase(), tbName
            );
            commands.add(metaDbCommandUpdate);
            dbIds.add(0);
        }

        // TODO: 考虑 GRANT OPTION FOR，修改 zql_users 表
        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    private static String getGrantUpdateSet(String privStr, int n, int length) {
        String str = "";
        if (privStr.equals("SELECT")) {
            str += ("Select_priv = 'N'") + (n == length - 1 ? "" : ", ");
        }
        if (privStr.equals("INSERT")) {
            str += ("Insert_priv = 'N'") + (n == length - 1 ? "" : ", ");
        }
        if (privStr.equals("UPDATE")) {
            str += ("Update_priv = 'N'") + (n == length - 1 ? "" : ", ");
        }
        if (privStr.equals("DELETE")) {
            str += ("Delete_priv = 'N'") + (n == length - 1 ? "" : ", ");
        }
        if (privStr.equals("ALL")) {
            str += ("All_priv = 'N'") + (n == length - 1 ? "" : ", ");
        }
        return str;
    }

    /**
     * 查看授权
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitShow_event_statement(uniformSQLParser.Show_event_statementContext ctx) {
        uniformSQLParser.Show_specificationContext specificationContext = ctx.show_specification();
        if (specificationContext.GRANT() != null) {
            ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
            ArrayList<Integer> dbIds = new ArrayList<Integer>();

            /* 元数据库命令 */
            InnerSQLCommand metaDbCommand = sqlCommandBuilder.showGrant(Database.DBType.MySQL, metaDatabase.getMetaDbName());
            commands.add(metaDbCommand);
            dbIds.add(0);

            return new ASTNodeVisitResult(null, commands, dbIds);
        } else if (specificationContext.DATABASES() != null) {
            ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
            ArrayList<Integer> dbIds = new ArrayList<Integer>();

            /* 元数据库命令 */
            String likeStr = specificationContext.LIKE() == null ? "" : "WHERE Db LIKE '" + specificationContext.getChild(2).getText() + "'";
            InnerSQLCommand metaDbCommand = sqlCommandBuilder.showDatabases(Database.DBType.MySQL, metaDatabase.getMetaDbName(), likeStr);
            commands.add(metaDbCommand);
            dbIds.add(0);

            return new ASTNodeVisitResult(null, commands, dbIds);
        }

        return null;
    }

    /**
     * specification 你个头！！！！
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitShow_specification(uniformSQLParser.Show_specificationContext ctx) {
        String value = ctx.getText();
        ASTNodeVisitResult result = new ASTNodeVisitResult(value, null, null);
        return result;
    }

    /**
     * 获取表名
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitTable_name(uniformSQLParser.Table_nameContext ctx) {
        String value = ctx.getText();
        ASTNodeVisitResult result = new ASTNodeVisitResult(value, null, null);
        return result;
    }

    /**
     * 获取用户字段
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitPrincipal_name(uniformSQLParser.Principal_nameContext ctx) {
        String value = ctx.getText();
        ASTNodeVisitResult result = new ASTNodeVisitResult(value, null, null);
        return result;
    }

    /**
     * 获取权限字段
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitPriv_type(uniformSQLParser.Priv_typeContext ctx) {
        String value = ctx.getText();
        ASTNodeVisitResult result = new ASTNodeVisitResult(value, null, null);
        return result;
    }

    /**
     * 删除用户 Statement
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitDrop_event_statement(uniformSQLParser.Drop_event_statementContext ctx) {
        /* 获取子节点数据 */
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();
        String userName = visit(ctx.user_name()).getValue();

        /* 元数据库命令 */
        InnerSQLCommand metaDbCommand = sqlCommandBuilder.dropUser(Database.DBType.MySQL, metaDatabase.getMetaDbName(), userName);
        commands.add(metaDbCommand);
        dbIds.add(0);

        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 创建数据库 Statement
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitCreate_database_statement(uniformSQLParser.Create_database_statementContext ctx) {
        /* 获取子节点数据 */
        ASTNodeVisitResult visitSchemaNameNodeResult = visit(ctx.schema_name());
        String createDbName = visitSchemaNameNodeResult.getValue(); // 数据库名
        String checkExists = ctx.IF() != null ? "IF NOT EXISTS" : "";   // IF NOT EXISTS
        int dbId = Integer.valueOf(ZQLEnv.get("innerdb.dafault.innerdb") == null ? "1" : ZQLEnv.get("innerdb.dafault.innerdb"));    // 底层库

        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 底层库命令 */
        Database.DBType dbType = innerDatabasesArrayList.get(dbId - 1).getDbType();
        InnerSQLCommand innerDbCommand = sqlCommandBuilder.createDatabase(dbType, checkExists, createDbName);
        commands.add(innerDbCommand);
        dbIds.add(dbId);

        /* 元数据库命令 */
        String dbAlias = innerDatabasesArrayList.get(dbId - 1).getDbAlias();
        String user = session.getUserName();
        InnerSQLCommand metaDbCommand = sqlCommandBuilder.createDatabaseMetaDb(Database.DBType.MySQL, new String[]{metaDatabase.getMetaDbName(),
                createDbName, String.valueOf(dbId), dbAlias, user, new TimeStamp(new Date().getTime()).toString()});
        commands.add(metaDbCommand);
        dbIds.add(0);

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 删除指定数据库
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitDrop_database_statement(uniformSQLParser.Drop_database_statementContext ctx) {
        /* 获取子节点数据 */
        ASTNodeVisitResult visitSchemaNameNodeResult = visit(ctx.schema_name());
        String dropDbName = visitSchemaNameNodeResult.getValue(); // 数据库名
        String checkExists = ctx.IF() != null ? "IF EXISTS" : "";   // IF NOT EXISTS

        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 元数据库命令 - 直接执行 */
        // TODO: 如何让底层库间接使用元数据库命令执行的结果？
        // 获取数据库所在底层库编号
        int dbId;
        try {
            dbId = metaDatabase.getInnerDatabaseId(dropDbName);
        } catch (MetaDatabaseOperationsException e) {
            return null;
        }

        /* 底层库命令 */
        Database.DBType dbType = innerDatabasesArrayList.get(dbId - 1).getDbType();
        InnerSQLCommand innerDbCommand = sqlCommandBuilder.dropDatabase(dbType, checkExists, dropDbName);
        commands.add(innerDbCommand);
        dbIds.add(dbId);

        /* 元数据库命令 */
        InnerSQLCommand metaDbCommand = sqlCommandBuilder.dropDatabaseMetaDb(Database.DBType.MySQL, new String[]{metaDatabase.getMetaDbName(), dropDbName});
        commands.add(metaDbCommand);
        dbIds.add(0);

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }
}
