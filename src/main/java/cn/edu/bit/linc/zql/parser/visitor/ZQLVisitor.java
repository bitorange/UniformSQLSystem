package cn.edu.bit.linc.zql.parser.visitor;

import cn.edu.bit.linc.zql.ZQLEnv;
import cn.edu.bit.linc.zql.command.*;
import cn.edu.bit.linc.zql.connections.ZQLSession;
import cn.edu.bit.linc.zql.databases.Database;
import cn.edu.bit.linc.zql.databases.InnerDatabase;
import cn.edu.bit.linc.zql.databases.InnerDatabases;
import cn.edu.bit.linc.zql.databases.MetaDatabase;
import cn.edu.bit.linc.zql.exceptions.MetaDatabaseOperationsException;
import cn.edu.bit.linc.zql.exceptions.ZQLCommandExecutionError;
import cn.edu.bit.linc.zql.parser.uniformSQLBaseVisitor;
import cn.edu.bit.linc.zql.parser.uniformSQLParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.mortbay.log.Log;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

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
        return new ASTNodeVisitResult(value, null, null);
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
        return new ASTNodeVisitResult(value, null, null);
    }


    /**
     * 创建用户 Statement
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitCreate_user_statement(uniformSQLParser.Create_user_statementContext ctx) {
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 获取子节点数据 */
        String userName = visit(ctx.user_name()).getValue();
        String passWord = visit(ctx.password()).getValue();

         /* 元数据库命令 */
        InnerSQLCommand metaDbCommand = sqlCommandBuilder.createUser(Database.DBType.MySQL, metaDatabase.getMetaDbName(), userName, passWord);
        commands.add(metaDbCommand);
        dbIds.add(0);

        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 授权 statement
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitGrant_privilege_statement(uniformSQLParser.Grant_privilege_statementContext ctx) {
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();
        if (session.getDatabase() == null) {
            session.setErrorMessage("未指定数据库，使用命令 `use db_name` 指定数据库");
            return null;
        }

        /* 获取子节点数据 */
        String tbName = visit(ctx.table_name()).getValue();

        // 权限表
        ArrayList<String> privilegesArray = new ArrayList<String>();
        for (int i = 0; i < ctx.priv_type().size(); i++) {
            uniformSQLParser.Priv_typeContext context = ctx.priv_type().get(i);
            ASTNodeVisitResult visitPrivTypeNodeResult = visit(context);
            privilegesArray.add(visitPrivTypeNodeResult.getValue());
        }

        if (privilegesArray.contains("ALL")) {
            privilegesArray.add("SELECT");
            privilegesArray.add("INSERT");
            privilegesArray.add("DELETE");
            privilegesArray.add("UPDATE");
            privilegesArray.add("ALL");
        }

        // 用户表
        ArrayList<String> specs = new ArrayList<String>();
        for (int i = 0; i < ctx.principal_specification().size(); ++i) {
            uniformSQLParser.Principal_specificationContext context = ctx.principal_specification().get(i);
            ASTNodeVisitResult visitPrincipalSpeNodeResult = visit(context);
            specs.add(visitPrincipalSpeNodeResult.getValue());
        }

        boolean withGrantOption = (ctx.WITH() != null);

        /* 检查是否拥有权限 */
        Map<String, String> privilegesMap;
        try {
            privilegesMap = metaDatabase.getPrivilegesOfASpecifiedUserAndTable(session.getDatabase(),
                    tbName, session.getUserName());
        } catch (MetaDatabaseOperationsException e) {
            session.setErrorMessage("从元数据库获取用户 " + session.getUserName() + " 失败，失败原因 " + e.getMessage());
            return null;
        }

        if (!session.getUserName().equals("root") && privilegesMap == null) {
            session.setErrorMessage("元数据库中找不到用户 " + session.getUserName() + " 对于数据库表 " + session.getDatabase()
                    + "." + tbName + " 的权限");
            return null;
        }

        // 检查用户是否有足够权限
        if (!session.getUserName().equals("root") && privilegesMap.get("GRANT_OPTION").equals("N")) {
            session.setErrorMessage("用户 " + session.getUserName() + " 在数据表 " + session.getDatabase()
                    + "." + tbName + " 中没有 GRANT 权限");
            return null;
        }

        if (!(session.getUserName().equals("root") || privilegesMap.get("ALL").equals("Y") ||
                (!(privilegesArray.contains("SELECT") && !privilegesMap.get("SELECT").equals("Y")) &&
                        !(privilegesArray.contains("INSERT") && !privilegesMap.get("INSERT").equals("Y")) &&
                        !(privilegesArray.contains("UPDATE") && !privilegesMap.get("UPDATE").equals("Y")) &&
                        !(privilegesArray.contains("DELETE") && !privilegesMap.get("DELETE").equals("Y"))))) {
            session.setErrorMessage("用户 " + session.getUserName() + " 在数据表 " + session.getDatabase() + "." +
                    tbName + " 中没有足够的权限");
            return null;
        }

        /* 元数据库命令 */
        // TODO: databaseName.tableName 的情况
        // TODO: *.* 的情况
        for (String spec : specs) {
            InnerSQLCommand metaDbCommand = sqlCommandBuilder.grant(Database.DBType.MySQL, metaDatabase.getMetaDbName(),
                    spec, session.getDatabase(), tbName
                    , privilegesArray.contains("SELECT") ? "Y" : "N"  // SELECT Privilege
                    , privilegesArray.contains("INSERT") ? "Y" : "N"  // INSERT Privilege
                    , privilegesArray.contains("UPDATE") ? "Y" : "N"  // UPDATE Privilege
                    , privilegesArray.contains("DELETE") ? "Y" : "N"  // DELETE Privilege
                    , privilegesArray.contains("ALL") ? "Y" : "N"     // All Privilege
                    , withGrantOption ? "Y" : "N"           // WITH GRANT OPTION
            );
            commands.add(metaDbCommand);
            dbIds.add(0);

            String updateFields = makePrivilegeFieldsSetStr(privilegesArray, withGrantOption, true);
            InnerSQLCommand metaDbCommandUpdate = sqlCommandBuilder.updateGrant(Database.DBType.MySQL, metaDatabase.getMetaDbName(),
                    updateFields, spec, session.getDatabase(), tbName
            );
            commands.add(metaDbCommandUpdate);
            dbIds.add(0);
        }

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 根据用户命令构建 zql_tables_priv 表 Update 操作 Set 部分字符串
     *
     * @param privs       用户命令中的权限设置
     * @param grantOption WITH GRANT OPTION / GRANT OPTION FOR
     * @param isGrant     GRANT 还是 REVOKE 语句，<code>true</code> 为 GRANT，<code>false</code> 为 REVOKE
     * @return zql_tables_p iv 表 Update 操作 Set 部分
     */
    private static String makePrivilegeFieldsSetStr(ArrayList<String> privs, boolean grantOption, boolean isGrant) {
        String yesOrNo = "Y";
        if (!isGrant) yesOrNo = "N";
        String updateFieldsStr = "";
        boolean hasPre = false;
        if (privs.contains("SELECT")) {
            updateFieldsStr += "SELECT_PRIV = '" + yesOrNo + "'";
            hasPre = true;
        }
        if (privs.contains("INSERT")) {
            if (hasPre) updateFieldsStr += ", ";
            updateFieldsStr += "INSERT_PRIV = '" + yesOrNo + "'";
            hasPre = true;
        }
        if (privs.contains("UPDATE")) {
            if (hasPre) updateFieldsStr += ", ";
            updateFieldsStr += "UPDATE_PRIV = '" + yesOrNo + "'";
            hasPre = true;
        }
        if (privs.contains("DELETE")) {
            if (hasPre) updateFieldsStr += ", ";
            updateFieldsStr += "DELETE_PRIV = '" + yesOrNo + "'";
            hasPre = true;
        }
        if (privs.contains("ALL")) {
            if (hasPre) updateFieldsStr += ", ";
            updateFieldsStr += "ALL_PRIV = '" + yesOrNo + "'";
            hasPre = true;
        }
        if (grantOption) {
            if (hasPre) updateFieldsStr += ", ";
            updateFieldsStr += "GRANT_OPTION = '" + yesOrNo + "'";
        }
        return updateFieldsStr;
    }

    /**
     * 撤销授权 Statement
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitRevoke_privilege_statement(uniformSQLParser.Revoke_privilege_statementContext ctx) {
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 获取子节点数据 */
        String tbName = visit(ctx.table_name()).getValue();

        // 权限表
        ArrayList<String> privilegesArray = new ArrayList<String>();
        for (int i = 0; i < ctx.priv_type().size(); i++) {
            uniformSQLParser.Priv_typeContext context = ctx.priv_type().get(i);
            ASTNodeVisitResult visitPrivTypeNodeResult = visit(context);
            privilegesArray.add(visitPrivTypeNodeResult.getValue());
        }

        if (privilegesArray.contains("ALL")) {
            privilegesArray.add("SELECT");
            privilegesArray.add("INSERT");
            privilegesArray.add("DELETE");
            privilegesArray.add("UPDATE");
            privilegesArray.add("ALL");
        }

        // 用户表
        ArrayList<String> specs = new ArrayList<String>();
        for (int i = 0; i < ctx.principal_specification().size(); ++i) {
            uniformSQLParser.Principal_specificationContext context = ctx.principal_specification().get(i);
            ASTNodeVisitResult visitPrincipalSpeNodeResult = visit(context);
            specs.add(visitPrincipalSpeNodeResult.getValue());
        }

        boolean withGrantOption = (ctx.OPTION() != null);   // GRANT OPTION FOR

        /* 检查是否拥有权限 */
        Map<String, String> privilegesMap;
        try {
            privilegesMap = metaDatabase.getPrivilegesOfASpecifiedUserAndTable(session.getDatabase(),
                    tbName, session.getUserName());
        } catch (MetaDatabaseOperationsException e) {
            session.setErrorMessage("从元数据库获取用户 " + session.getUserName() + " 失败，失败原因 " + e.getMessage());
            return null;
        }

        if (!session.getUserName().equals("root") && privilegesMap == null) {
            session.setErrorMessage("元数据库中找不到用户 " + session.getUserName() + " 对于数据库表 " + session.getDatabase()
                    + "." + tbName + " 的权限");
            return null;
        }

        // 检查用户是否有足够权限
        if (!session.getUserName().equals("root") && privilegesMap.get("GRANT_OPTION").equals("N")) {
            session.setErrorMessage("用户 " + session.getUserName() + " 在数据表 " + session.getDatabase()
                    + "." + tbName + " 中没有 GRANT 权限");
            return null;
        }

        if (!(session.getUserName().equals("root") || privilegesMap.get("ALL").equals("Y") ||
                (!(privilegesArray.contains("SELECT") && !privilegesMap.get("SELECT").equals("Y")) &&
                        !(privilegesArray.contains("INSERT") && !privilegesMap.get("INSERT").equals("Y")) &&
                        !(privilegesArray.contains("UPDATE") && !privilegesMap.get("UPDATE").equals("Y")) &&
                        !(privilegesArray.contains("DELETE") && !privilegesMap.get("DELETE").equals("Y"))))) {
            session.setErrorMessage("用户 " + session.getUserName() + " 在数据表 " + session.getDatabase() + "." +
                    tbName + " 中没有足够的权限");
            return null;
        }

        /* 元数据库命令 */
        for (String spec : specs) {
            String updateFields = makePrivilegeFieldsSetStr(privilegesArray, withGrantOption, false);
            InnerSQLCommand metaDbCommandUpdate = sqlCommandBuilder.updateGrant(Database.DBType.MySQL, metaDatabase.getMetaDbName()
                    , updateFields, spec, session.getDatabase(), tbName
            );
            commands.add(metaDbCommandUpdate);
            dbIds.add(0);
        }

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * SHOW STATEMENT
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitShow_event_statement(uniformSQLParser.Show_event_statementContext ctx) {
        uniformSQLParser.Show_specificationContext specificationContext = ctx.show_specification();
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();
        if (specificationContext.GRANT() != null) {
            /* 查看授权 */
            /* 元数据库命令 */
            InnerSQLCommand metaDbCommand = sqlCommandBuilder.showGrant(Database.DBType.MySQL, metaDatabase.getMetaDbName());
            commands.add(metaDbCommand);
            dbIds.add(0);
        } else if (specificationContext.DATABASES() != null) {
            /* 查看数据库 */
            /* 元数据库命令 */
            String likeStr = specificationContext.LIKE() == null ? "" : "WHERE Db LIKE '" + specificationContext.getChild(2).getText() + "'";
            InnerSQLCommand metaDbCommand = sqlCommandBuilder.showDatabases(Database.DBType.MySQL, metaDatabase.getMetaDbName(), likeStr);
            commands.add(metaDbCommand);
            dbIds.add(0);
        } else if (specificationContext.TABLES() != null) {
            /* 查看数据表 */
            /* 获取子节点数据 */
            String inDatabase = (specificationContext.IN() != null) ? "Db = '" + (visit(specificationContext.database_name()).getValue()) + "'" : "true";
            String like = "true";   // TODO: 补上！

            /* 元数据库命令 */
            InnerSQLCommand metaDbCommand = sqlCommandBuilder.showTables(Database.DBType.MySQL, metaDatabase.getMetaDbName(), inDatabase, like);
            commands.add(metaDbCommand);
            dbIds.add(0);
        } else if (specificationContext.SERVER() != null) {
            /* 查看数据库别名 */
            InnerSQLCommand metaDbCommand = sqlCommandBuilder.showServerAliases(Database.DBType.MySQL, metaDatabase.getMetaDbName());
            commands.add(metaDbCommand);
            dbIds.add(0);
        }

        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 删除用户 Statement
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitDrop_user_statement(uniformSQLParser.Drop_user_statementContext ctx) {
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
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 底层库 */
        if (ZQLEnv.get("innerdb.dafault.innerdb") == null) {
            session.setErrorMessage("没有指定底层库");
            return null;
        }
        int dbId = Integer.valueOf(ZQLEnv.get("innerdb.dafault.innerdb"));    // 默认底层库

        /* 获取子节点数据 */
        ASTNodeVisitResult visitSchemaNameNodeResult = visit(ctx.schema_name());
        String createDbName = visitSchemaNameNodeResult.getValue();     // 数据库名
        String checkExists = ctx.IF() != null ? "IF NOT EXISTS" : "";   // IF NOT EXISTS

        /* 底层库命令 */
        Database.DBType dbType = innerDatabasesArrayList.get(dbId - 1).getDbType();
        InnerSQLCommand innerDbCommand = sqlCommandBuilder.createDatabase(dbType, checkExists, createDbName);
        commands.add(innerDbCommand);
        dbIds.add(dbId);

        /* 元数据库命令 */
        String dbAlias = innerDatabasesArrayList.get(dbId - 1).getDbAlias();
        String user = session.getUserName();
        InnerSQLCommand metaDbCommand = sqlCommandBuilder.createDatabaseMetaDb(Database.DBType.MySQL, metaDatabase.getMetaDbName(),
                createDbName, String.valueOf(dbId), dbAlias, user, new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()));
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
        ASTNodeVisitResult visitSchemaNameNodeResult;
        visitSchemaNameNodeResult = visit(ctx.schema_name());
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
            session.setErrorMessage(e.getMessage());
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

    /**
     * USE DATABASE
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitUse_event_statement(uniformSQLParser.Use_event_statementContext ctx) {
        // TODO: 检测数据库是否存在
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 获取子节点数据 */
        ASTNodeVisitResult visitDatabaseNameNodeResult = visit(ctx.database_name());
        String dbName = visitDatabaseNameNodeResult.getValue();

        /* 更新 Session */
        session.setDatabase(dbName);

        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 创建表格
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitCreate_table_statement1(uniformSQLParser.Create_table_statement1Context ctx) {
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 获取子节点数据 */
        String temporary = ctx.TEMPORARY() == null ? "" : "TEMPORARY";
        String external = "";
        String checkExists = ctx.IF() == null ? "" : "IF NOT EXISTS";
        String tableName = visit(ctx.table_name()).getValue();
        String databaseName = (ctx.database_name() != null ? visit(ctx.database_name()).getValue() :
                (session.getDatabase() != null ? session.getDatabase() : null));
        if (databaseName == null) {
            session.setErrorMessage("未指定数据库");
            return null;
        }

        // 获取数据库所在的底层库
        int dbId;
        try {
            dbId = metaDatabase.getInnerDatabaseId(databaseName);
        } catch (MetaDatabaseOperationsException e) {
            session.setDatabase("获取数据库所在底层库失败，错误原因：" + e.getMessage());
            return null;
        }

        String columns = "";
        for (ParseTree tree : ctx.create_definition()) {
            String columnName = visit(tree.getChild(0)).getValue();
            ASTNodeVisitResult visitColumnDefinitionNodeResult = visit(tree.getChild(1));
            int index = visitColumnDefinitionNodeResult.getValue().indexOf(" ");
            String columnCommend = (index != -1 ? "COMMENT " + visitColumnDefinitionNodeResult.getValue().split(" ")[1]
                    : "");
            String columnType = visitColumnDefinitionNodeResult.getValue().split(" ")[0];
            if (!CommandAdapter.TYPE_MAP.containsKey(columnType.toUpperCase())) {
                session.setErrorMessage("找不到类型 " + columnType);
                return null;
            }
            columns += columnName + " " + CommandAdapter.TYPE_MAP.get(columnType) + " " + columnCommend + ", ";
        }
        columns = columns.substring(0, columns.length() - 2);

        /* 底层库命令 */
        Database.DBType dbType = innerDatabasesArrayList.get(dbId - 1).getDbType();
        InnerSQLCommand innerDbCommand = sqlCommandBuilder.createTable(dbType, temporary, external, checkExists, databaseName, tableName,
                columns, "", "");
        commands.add(innerDbCommand);
        dbIds.add(dbId);

        /* 元数据库命令 */
        InnerSQLCommand metaDbCommand = sqlCommandBuilder.createTableMateDb(Database.DBType.MySQL, metaDatabase.getMetaDbName(),
                databaseName, tableName, session.getUserName(),
                new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()));
        commands.add(metaDbCommand);
        dbIds.add(0);

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 获取字段定义
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitColumn_definition(uniformSQLParser.Column_definitionContext ctx) {
        String columnType = visit(ctx.column_data_type_header()).getValue();
        String comment = "";
        if (ctx.COMMENT() != null) {
            comment = ctx.getChild(2).getText();
        }
        String value = columnType + (comment.equals("") ? "" : (" " + comment));
        return new ASTNodeVisitResult(value, null, null);
    }

    /**
     * 获取字段类型
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitColumn_data_type_header(uniformSQLParser.Column_data_type_headerContext ctx) {
        String value = ctx.getText();
        return new ASTNodeVisitResult(value, null, null);
    }

    /**
     * 获取列名
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitColumn_name(uniformSQLParser.Column_nameContext ctx) {
        String value = ctx.any_name().getText();
        return new ASTNodeVisitResult(value, null, null);
    }

    /**
     * 删除数据表
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitDrop_table_statement(uniformSQLParser.Drop_table_statementContext ctx) {
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();
        if (session.getDatabase() == null) {
            session.setErrorMessage("未指定数据库，使用命令 `use db_name` 指定数据库");
            return null;
        }

        /* 获取子节点数据 */
        ASTNodeVisitResult visitTableNameNodeResult = visit(ctx.table_name());
        String dropTableName = visitTableNameNodeResult.getValue();
        String checkExists = ctx.IF() == null ? "" : "IF EXISTS";

        /* 获取数据库所在底层库 */
        int dbId;
        try {
            dbId = metaDatabase.getInnerDatabaseId(session.getDatabase());
        } catch (MetaDatabaseOperationsException e) {
            session.setDatabase("获取数据库所在底层库失败，错误原因：" + e.getMessage());
            return null;
        }

        /* 底层库命令 */
        Database.DBType dbType = innerDatabasesArrayList.get(dbId - 1).getDbType();
        InnerSQLCommand innerDbCommand = sqlCommandBuilder.dropTable(dbType, checkExists, session.getDatabase() + "." + dropTableName);
        commands.add(innerDbCommand);
        dbIds.add(dbId);

        /* 元数据库命令 */
        InnerSQLCommand metaDbCommand = sqlCommandBuilder.dropTableMetaDb(dbType, metaDatabase.getMetaDbName(), dropTableName, session.getDatabase());
        commands.add(metaDbCommand);
        dbIds.add(0);

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 修改数据表
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitAlter_table_statement(uniformSQLParser.Alter_table_statementContext ctx) {
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();
        if (session.getDatabase() == null) {
            session.setErrorMessage("未指定数据库");
            return null;
        }

        /* 确定数据库所在底层库以及底层库类型 */
        int dbId;
        try {
            dbId = metaDatabase.getInnerDatabaseId(session.getDatabase());
        } catch (MetaDatabaseOperationsException e) {
            session.setDatabase("获取数据库所在底层库失败，错误原因：" + e.getMessage());
            return null;
        }
        Database.DBType dbType = innerDatabasesArrayList.get(dbId - 1).getDbType();


        /* 获取子节点数据 */
        ASTNodeVisitResult visitTableNameNodeResult = visit(ctx.table_name());
        String tableName = visitTableNameNodeResult.getValue();
        List<uniformSQLParser.Alter_table_specificationContext> alter_table_specificationContext = ctx.alter_table_specification();
        if (alter_table_specificationContext.get(0).children.get(0).getText().equals("RENAME")) {
            /* 修改表名 */
            String newTableName = alter_table_specificationContext.get(0).children.get(2).getText();
            Log.debug("修改数据表 " + tableName + " 为 " + newTableName);

            /* 底层库命令 */
            InnerSQLCommand innerDbCommand = sqlCommandBuilder.alterTableName(dbType, session.getDatabase() + "." + tableName, session.getDatabase() + "." + newTableName);
            commands.add(innerDbCommand);
            dbIds.add(dbId);

            /* 元数据库命令 */
            InnerSQLCommand metaDbSQLCommand = sqlCommandBuilder.alterTableNameMetaDb(Database.DBType.MySQL, metaDatabase.getMetaDbName(),
                    newTableName, tableName, session.getDatabase());
            commands.add(metaDbSQLCommand);
            dbIds.add(dbId);
        } else if (alter_table_specificationContext.get(0).children.get(0).getText().equals("CHANGE")) {
            /* 修改列名 */
            String oldColumnName, newColumnName;
            if (alter_table_specificationContext.get(0).children.get(1).getText().equals("COLUMN")) {
                oldColumnName = alter_table_specificationContext.get(0).children.get(2).getText();
                newColumnName = alter_table_specificationContext.get(0).children.get(3).getText();
            } else {
                oldColumnName = alter_table_specificationContext.get(0).children.get(1).getText();
                newColumnName = alter_table_specificationContext.get(0).children.get(2).getText();
            }

            /* 获取列类型 */
            String columnType;
            try {
                columnType = innerDatabase.getColumnType(dbId, session.getDatabase(), tableName, oldColumnName);
            } catch (ZQLCommandExecutionError throwables) {
                session.setErrorMessage(throwables.getMessage());
                return null;
            }

            /* 底层库命令 */
            InnerSQLCommand innerDbCommand = sqlCommandBuilder.alterColumnName(dbType, session.getDatabase() + "." + tableName, oldColumnName, newColumnName, columnType);
            commands.add(innerDbCommand);
            dbIds.add(dbId);
        }

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
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
        return new ASTNodeVisitResult(value, null, null);
    }

    /**
     * 获取表名
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitTable_name(uniformSQLParser.Table_nameContext ctx) {
        String value = ctx.any_name().getText();
        return new ASTNodeVisitResult(value, null, null);
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
        return new ASTNodeVisitResult(value, null, null);
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
        return new ASTNodeVisitResult(value, null, null);
    }

    /**
     * 返回模式名
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitSchema_name(uniformSQLParser.Schema_nameContext ctx) {
        String value = ctx.any_name().getText();
        return new ASTNodeVisitResult(value, null, null);
    }

    /**
     * 数据库名
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitDatabase_name(uniformSQLParser.Database_nameContext ctx) {
        String value = ctx.any_name().getText();
        return new ASTNodeVisitResult(value, null, null);
    }

    /**
     * SELECT Statement
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitSelect_expression(uniformSQLParser.Select_expressionContext ctx) {
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 获取子节点数据 */
        String allOrDistinct = (ctx.ALL() != null ? "ALL" : (ctx.DISTINCT() != null ? "DISTINCT" : ""));

        /* 确定数据库所在底层库以及底层库类型 */
        int dbId;
        try {
            dbId = metaDatabase.getInnerDatabaseId(session.getDatabase());
        } catch (MetaDatabaseOperationsException e) {
            session.setDatabase("获取数据库所在底层库失败，错误原因：" + e.getMessage());
            return null;
        }
        Database.DBType dbType = innerDatabasesArrayList.get(dbId - 1).getDbType();

        // SELECT ITEMS
        // TODO: 应该进一步分析
        String selectList = "";
        for (ParseTree selectItemNode : ctx.select_list().children) {
            ASTNodeVisitResult visitResult = visit(selectItemNode);
            String selectItem = visitResult.getValue();
            selectList += selectItem + ", ";
        }
        selectList = selectList.substring(0, selectList.length());

        // FROM TABLES
        String fromTables = "";
        for (ParseTree fromTableNode : ctx.table_references().children) {
            ASTNodeVisitResult visitResult = visit(fromTableNode);
            String fromTable = visitResult.getValue();
            fromTables += fromTable + ",";
        }
        fromTables = fromTables.substring(0, fromTables.length());

        // WHERE CONDITIONS
        String whereConditions = "";

        // GROUP BY
        String groupBy = "";

        // ORDER BY
        String orderBy = "";

        // LIMIT
        String limit = "";


        /* 底层库命令 */
        InnerSQLCommand innerDBcommands = sqlCommandBuilder.select(dbType, allOrDistinct, selectList,
                fromTables, whereConditions, groupBy, orderBy, limit);
        commands.add(innerDBcommands);
        dbIds.add(dbId);

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 获取 Displayed Column 数据
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitDisplayed_column(uniformSQLParser.Displayed_columnContext ctx) {
        String value = ctx.column_spec().column_name().any_name().keyword().getText();
        return new ASTNodeVisitResult(value, null, null);
    }

    /**
     * 获取 Table Reference 数据
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitTable_reference(uniformSQLParser.Table_referenceContext ctx) {
        String value = ctx.table_factor1().table_factor2().table_factor3().get(0).table_atom().get(0).table_spec().table_name().any_name().keyword().getText();
        return new ASTNodeVisitResult(value, null, null);
    }
}