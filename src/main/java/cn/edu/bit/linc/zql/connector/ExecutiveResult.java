package cn.edu.bit.linc.zql.connector;

import dnl.utils.text.table.TextTable;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * SQL 命令执行结果
 */
public class ExecutiveResult {
    /**
     * 获取命令类型
     *
     * @return 命令类型
     */
    public String getCommandType() {
        return commandType;
    }

    /**
     * 获取命令影响的行数
     *
     * @return 命令影响的行数
     */
    public int getAffectedRows() {
        return affectedRows;
    }

    /**
     * 获取结果集，可能为空
     *
     * @return 结果集
     */
    public ResultSet getResultSet() {
        return resultSet;
    }

    /**
     * 打印结果
     */
    public void printResult() throws SQLException {
        /* QUERY 操作 */
        if (commandType.equals("query")) {
            System.out.println("QUERY OK!");
            /* 获取表头 */
            ResultSetMetaData rsmd;
            rsmd = resultSet.getMetaData();

            ArrayList<String> headerList = new ArrayList<String>();
            if (rsmd != null) {
                for (int i = 1; i <= rsmd.getColumnCount(); ++i) {
                    headerList.add(rsmd.getColumnName(i));
                }
            }
            String[] header = new String[headerList.size()];
            header = headerList.toArray(header);

            /* 获取表中数据并存放在二维数据中 */

            int i = 0;
            int numberOfRows = 0;
            String[][] data = null;
            if (resultSet != null) {
                resultSet.last();
                numberOfRows = resultSet.getRow();
                data = new String[numberOfRows][headerList.size()];
                resultSet.beforeFirst();

                while (resultSet.next()) {
                    for (int j = 1; j <= rsmd.getColumnCount(); ++j) {
                        String result = resultSet.getString(j);
                        data[i][j - 1] = result;
                    }
                }
                i++;
            }

            /* 打印表格 */
            // 生成 TextTable
            if (data != null) {
                TextTable textTable = new TextTable(header, data);
                textTable.setAddRowNumbering(true);
                textTable.printTable();
            }
            System.out.println("rows: " + numberOfRows);
        }
        /* UPDATE 操作 */
        else {
            System.out.println("UPDATE OK!");
            System.out.println("Affected rows: " + affectedRows);
        }
    }


    /**
     * 构造函数
     *
     * @param commandType  命令类型
     * @param affectedRows 影响行数
     * @param resultSet    结果集
     */
    public ExecutiveResult(String commandType, int affectedRows, ResultSet resultSet) {
        this.commandType = commandType;
        this.affectedRows = affectedRows;
        this.resultSet = resultSet;
    }

    private String commandType;     // 命令类型，update 还是 query
    private int affectedRows;       // 影响行数
    private ResultSet resultSet;    // 结果集
}
