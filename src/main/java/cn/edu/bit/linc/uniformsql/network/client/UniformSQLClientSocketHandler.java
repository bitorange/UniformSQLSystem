package cn.edu.bit.linc.uniformsql.network.client;

import cn.edu.bit.linc.uniformsql.jdbc.RowData;
import cn.edu.bit.linc.uniformsql.network.packets.*;
import cn.edu.bit.linc.uniformsql.network.packets.type.IntegerType;
import cn.edu.bit.linc.uniformsql.network.packets.type.LengthCodeBinaryType;
import cn.edu.bit.linc.uniformsql.network.packets.type.LengthCodeStringType;
import cn.edu.bit.linc.uniformsql.network.packets.type.StringType;
import cn.edu.bit.linc.uniformsql.network.utils.CHAP;
import cn.edu.bit.linc.uniformsql.network.utils.Log;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;
import cn.edu.bit.linc.zql.util.StringUtil;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

/**
 * 统一 SQL 系统 Client Socket Handler，用于接收和发送请求
 */
public class UniformSQLClientSocketHandler implements ClientSocketHandler {
    private static final Logger logger = LoggerFactory.getLogger(UniformSQLClientSocketHandler.class);

    private final Socket clientSocket;
    private InputStream in;
    private OutputStream out;

    private List<RowData> results;

    /**
     * 构造函数
     *
     * @param clientSocket 客户端 Socket 连接
     */
    public UniformSQLClientSocketHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    /**
     * handle Socket 连接
     *
     * @throws IOException 读取 InputStream 或者 OutputStream 失败
     */

    public void handleSocket() throws IOException {
        logger.i("Connected to server " + clientSocket.getInetAddress() + ":" + clientSocket.getPort());

        in = clientSocket.getInputStream();
        out = clientSocket.getOutputStream();

        // TODO: 接收握手包
        Packet packer = readPacket(in);
        byte[] handShakePacketBytes = packer.getPacketBody();
        HandShakePacket handShakePacket = new HandShakePacket(handShakePacketBytes.length);
        handShakePacket.setData(handShakePacketBytes);
        logger.i("Received hand shake packet from server " + clientSocket.getInetAddress());
        logger.i("handShakePacket : " + handShakePacket);
        System.out.println("Protocol Version    : " + IntegerType.getIntegerValue(handShakePacket.getProtocolVersion()));
        System.out.println("Server Version      : " + StringType.getString(handShakePacket.getServerVersion()));
        System.out.println("Thread ID           : " + IntegerType.getIntegerValue(handShakePacket.getThreadID()));
        System.out.println("Scramble Part One   : " + Arrays.toString(handShakePacket.getScramblePartOne()));
        System.out.println("Server Capabilities : " + IntegerType.getIntegerValue(handShakePacket.getServerCapabilities()));
        System.out.println("Character Set       : " + IntegerType.getIntegerValue(handShakePacket.getCharacterSet()));
        System.out.println("Server Status       : " + IntegerType.getIntegerValue(handShakePacket.getServerStatus()));
        System.out.println("Scramble Part Two   : " + Arrays.toString(handShakePacket.getScramblePartTwo()));
        System.out.println();

        // TODO: 构造和发送验证包
        Packet credentialsPacket = null;
        try {
            credentialsPacket = buildCredentialsPacket();
            byte[] data = new byte[credentialsPacket.getSize()];
            credentialsPacket.getData(data);
            out.write(data);
            logger.i("Send credentials packet to server " + clientSocket.getInetAddress());
            logger.i("credentialsPacket : " + credentialsPacket + "\r\n");
        } catch (Exception e) {
            // TODO: 正确处理异常
            //logger.i("必要字段 var_len 尚未确定", ex);
            return;
        }

        // TODO: 接收验证结果包
        packer = readPacket(in);
        byte[] SuccessPacketBytes = packer.getPacketBody();
        SuccessPacket successPacket = new SuccessPacket(SuccessPacketBytes.length);
        successPacket.setData(SuccessPacketBytes);
        logger.i("Received success packet from server " + clientSocket.getInetAddress());
        logger.i("successPacket : " + successPacket);
        System.out.println("Packet Identifier : " + IntegerType.getIntegerValue(successPacket.getPacketIdentifier()));
        System.out.print("Changed Rows      : ");
        byte[] bytes = LengthCodeBinaryType.getBytes(successPacket.getChangedRows());
        for(byte b : bytes) {
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.print("Index ID          : ");
        bytes = LengthCodeBinaryType.getBytes(successPacket.getIndexID());
        for(byte b : bytes) {
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.println("Server Status     : " + IntegerType.getIntegerValue(successPacket.getServerStatus()));
        System.out.println("Warning Number    : " + IntegerType.getIntegerValue(successPacket.getWarningNumber()));
        System.out.println("Server Message    : " + LengthCodeStringType.getString(successPacket.getServerMessage()));
        System.out.println();


        /* 测试命令 */

        // 发送命令

        /*
        String userOne = "User_" + StringUtil.RandomStringGenerator.generateRandomString
                (5, StringUtil.RandomStringGenerator.Mode.ALPHA);           // 用户一
        String userTwo = "User_" + StringUtil.RandomStringGenerator.generateRandomString
                (5, StringUtil.RandomStringGenerator.Mode.ALPHA);           // 用户二
        String userThree = "User_" + StringUtil.RandomStringGenerator.generateRandomString
                (5, StringUtil.RandomStringGenerator.Mode.ALPHA);           // 用户三
        sendCommand(1, "CREATE USER " + userOne + " IDENTIFIED BY '123456'");
        // TODO: 检测用户是否存在
        sendCommand(1, "DROP USER " + userOne);                       // 删除用户一
        getResult();
        sendCommand(1, "CREATE USER " + userOne + " IDENTIFIED BY '123456'");   // 创建普通用户一
        getResult();
        sendCommand(1, "CREATE USER " + userTwo + " IDENTIFIED BY '123456'");   // 创建普通用户二
        getResult();
        sendCommand(1, "CREATE USER " + userThree + " IDENTIFIED BY '123456'");   // 创建普通用户二
        getResult();

        // 创建、使用数据库、数据表
        sendCommand(1, "CREATE DATABASE IF NOT EXISTS db_1");  // 创建数据库
        getResult();
        sendCommand(1, "CREATE DATABASE IF NOT EXISTS db_2");  // 创建数据库
        getResult();
        sendCommand(1, "CREATE DATABASE IF NOT EXISTS db_3");  // 创建数据库
        getResult();
        // TODO: line 1:159 mismatched input '<EOF>' expecting COMMENT
        // TODO: 对 DataType(INT) 的支持
        sendCommand(1, "CREATE TABLE IF NOT EXISTS db_1.tb_1 (C1 TINYINT, C2 SMALLINT, C3 INT, C4 BigInt," +
                " C5 FLOAT, C7 DOUBLE, C8 DECIMAL, C10 TIMESTAMP, c11 date, C12 Boolean, " +
                "C13 BINARY) COMMENT 'Table 1 Comment'");        // 创建数据表一
        getResult();
        sendCommand(1, "USE db_1");        // 使用数据库一
        getResult();
        sendCommand(1, "CREATE TABLE IF NOT EXISTS tb_2 (C1 TINYINT, C2 SMALLINT, C3 INT, C4 BigInt," +
                " C5 FLOAT, C7 DOUBLE, C8 DECIMAL, C10 TIMESTAMP, c11 date, C12 Boolean, " +
                "C13 BINARY) COMMENT 'Table 2 Comment'");        // 创建数据表二 / 不带数据库名
        getResult();
        sendCommand(1, "CREATE TABLE IF NOT EXISTS tb_3 (C1 TINYINT, C2 SMALLINT, C3 INT, C4 BigInt," +
                " C5 FLOAT, C7 DOUBLE, C8 DECIMAL, C10 TIMESTAMP, c11 date, C12 Boolean, " +
                "C13 BINARY) COMMENT 'Table 3 Comment'");        // 创建数据表三 / 不带数据库名
        getResult();

        // 删除数据库、数据表
        sendCommand(1, "DROP DATABASE IF EXISTS db_2");    // 删除数据库2
        getResult();
        sendCommand(1, "DROP TABLE IF EXISTS tb_3");       // 删除数据表3
        getResult();

        // 修改数据表
        sendCommand(1, "ALTER TABLE tb_2 RENAME TO tb_N"); // 修改数据表名
        getResult();
        sendCommand(1, "ALTER TABLE tb_N CHANGE COLUMN C2 C2_NEW");    // 修改列名
        getResult();
        sendCommand(1, "ALTER TABLE tb_N CHANGE C3 C3_NEW");    // 修改列名
        getResult();


        // 查看数据库、数据表、数据列
        // TODO: line 1:14 mismatched input '<EOF>' expecting LIKE
        sendCommand(1, "SHOW DATABASES");  // 查看数据库
        getResult();
        sendCommand(1, "SHOW SCHEMAS LIKE 'db\\_%'");     // 带条件查看数据库
        getResult();
        sendCommand(1, "SHOW TABLES");     // 查看数据表
        getResult();
        sendCommand(1, "SHOW TABLES in db_1 'tb%'");   // 查看特定数据库中符合指定条件的数据表
        getResult();
        sendCommand(1, "SHOW COLUMNS FROM tb_1");
        getResult();
        sendCommand(1, "SHOW COLUMNS FROM tb_1 FROM db_1");
        getResult();

        // 授权、撤销、查看授权
        sendCommand(1, "GRANT SELECT, UPDATE ON tb_1 TO " + userOne + " WITH GRANT OPTION");    // 授权
        getResult();
        sendCommand(1, "GRANT INSERT, UPDATE ON tb_1 TO " + userOne);      // 授权累加
        getResult();
        sendCommand(1, "GRANT ALL ON tb_N TO " + userTwo);                         // GRANT ALL
        getResult();
        sendCommand(1, "GRANT ALL ON tb_N TO " + userThree + " WITH GRANT OPTION");       // GRANT ALL / WITH GRANT OPTION
        getResult();
        sendCommand(1, "SHOW GRANT ON ALL");                                  // 查看所有人授权
        getResult();
        sendCommand(1, "SHOW GRANT " + userOne + " ON ALL");                    // 查看单人授权 / ALL
        getResult();
        sendCommand(1, "SHOW GRANT " + userTwo + " ON TABLE tb_1");             // 查看单人 / 单表
        getResult();
        sendCommand(1, "REVOKE ALL ON tb_1 FROM " + userOne);                   // 取消授权 / ALL
        getResult();
        sendCommand(1, "REVOKE SELECT ON tb_N FROM " + userTwo);                // 取消授权
        getResult();
        // TODO: 错误语句仍能正常执行
        // sendCommand("REVOKE GRANT OPTION FOR ON tb_1 FROM " + userThree);    // 取消授权 / GRANT OPTION FOR
        sendCommand(1, "REVOKE GRANT OPTION FOR SELECT ON tb_N FROM " + userThree);    // 取消授权 / GRANT OPTION FOR
        getResult();

        // 其他
        sendCommand(1, "SHOW SERVER ALIASES");     // 查询底层库别名
        getResult();
        sendCommand(1, "SET TABLE tb_4 TO db_mysql.db_1");     // 将现有表位置设置到元数据库内
        getResult();
        sendCommand(1, "SERVER ALIAS db_mysql CREATE DATABASE IF NOT EXISTS db_2");  // 指定底层库运行
        getResult();
        sendCommand(1, "SHOW DATABASES");          // 显示数据库
        getResult();
        sendCommand(1, "SHOW TABLES");             // 显示数据表
        getResult();

//        // 接收结果
//        packer = readPacket(in);
//        byte[] ResultBytes = packer.getPacketBody();
//        SuccessPacket resultPacket = new SuccessPacket(ResultBytes.length);
//        resultPacket.setData(ResultBytes);
//        logger.i("Received result packet from server " + clientSocket.getInetAddress());
//        logger.i("resultPacket : " + resultPacket);
//        System.out.println("Packet Identifier : " + IntegerType.getIntegerValue(resultPacket.getPacketIdentifier()));
//        System.out.print("Changed Rows      : ");
//        bytes = LengthCodeBinaryType.getBytes(resultPacket.getChangedRows());
//        for(byte b : bytes) {
//            System.out.print(b + " ");
//        }
//        System.out.println();
//        System.out.print("Index ID          : ");
//        bytes = LengthCodeBinaryType.getBytes(resultPacket.getIndexID());
//        for(byte b : bytes) {
//            System.out.print(b + " ");
//        }
//        System.out.println();
//        System.out.println("Server Status     : " + IntegerType.getIntegerValue(resultPacket.getServerStatus()));
//        System.out.println("Warning Number    : " + IntegerType.getIntegerValue(resultPacket.getWarningNumber()));
//        System.out.println("Server Message    : " + LengthCodeStringType.getString(resultPacket.getServerMessage()));
//        System.out.println();

        sendCommand(0, null);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 关闭连接（测试）
        closeQuietly(in);
        closeQuietly(out);
        */
    }

    /**
     * 断开连接
     *
     */
    public void disconnect() {
        sendCommand(0, null);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        closeQuietly(in);
        closeQuietly(out);
    }

    /**
     * 向远程服务器发送命令
     *
     * @param commandType 命令类型
     * @param command     命令字符串
     */
    public void sendCommand(int commandType, String command) {
        Packet commandPacket = null;
        try {
            IntegerType commandCode = IntegerType.getIntegerType(commandType, CommandPacket.LENGTH_COMMAND_CODE);
            LengthCodeStringType _command = null;
            if(commandType != CommandPacket.COM_QUIT)
                _command = LengthCodeStringType.getLengthCodeString(command);

            int len = commandCode.getSize();
            if(commandType != CommandPacket.COM_QUIT)
                len += _command.getSize();
            CommandPacket commandPacketBody = new CommandPacket(len);
            commandPacketBody.setCommandCode(commandCode);
            if(commandType != CommandPacket.COM_QUIT)
                commandPacketBody.setCommand(_command);
            byte[] body = new byte[commandPacketBody.getSize()];
            commandPacketBody.getData(body);

            /* 构建包头 */
            PacketHeader packetHeader = new PacketHeader(4);
            packetHeader.setPacketLength(commandPacketBody.getSize());
            packetHeader.setPacketID((byte) 0);     // TODO: 包序列号

            /* 构建数据包 */
            commandPacket = new Packet(packetHeader.getSize() + body.length);
            commandPacket.setPacketHeader(packetHeader);
            commandPacket.setPacketBody(body);

            byte[] data = new byte[commandPacket.getSize()];
            commandPacket.getData(data);
            out.write(data);
            logger.i("Send command packet to server " + clientSocket.getInetAddress());
            logger.i("commandPacket : " + commandPacket + "\r\n");
            logger.i("command : " + LengthCodeStringType.getString(commandPacketBody.getCommand()));
        } catch (Exception e) {
            // TODO: 正确处理异常
            //logger.i("必要字段 var_len 尚未确定", ex);
            return;
        }

    }

    /**
     * 等待获取远程服务器的返回结果
     *
     */
    public void getResult() throws IOException{
        Packet packer = readPacket(in);
        byte[] ResultBytes = packer.getPacketBody();

        for(int i = 0; i < ResultBytes.length; ++i)
            System.out.print(ResultBytes[i] +" ");

        if(ResultBytes[0] == 0){

            SuccessPacket resultPacket = new SuccessPacket(ResultBytes.length);
            resultPacket.setData(ResultBytes);
            logger.i("Received success packet from server " + clientSocket.getInetAddress());
            logger.i("successPacket : " + resultPacket);
            System.out.println("Packet Identifier : " + IntegerType.getIntegerValue(resultPacket.getPacketIdentifier()));
            System.out.print("Changed Rows      : ");
            byte[] bytes = LengthCodeBinaryType.getBytes(resultPacket.getChangedRows());
            for (byte b : bytes) {
                System.out.print(b + " ");
            }
            System.out.println();
            System.out.print("Index ID          : ");
            bytes = LengthCodeBinaryType.getBytes(resultPacket.getIndexID());
            for (byte b : bytes) {
                System.out.print(b + " ");
            }
            System.out.println();
            System.out.println("Server Status     : " + IntegerType.getIntegerValue(resultPacket.getServerStatus()));
            System.out.println("Warning Number    : " + IntegerType.getIntegerValue(resultPacket.getWarningNumber()));
            System.out.println("Server Message    : " + LengthCodeStringType.getString(resultPacket.getServerMessage()));
            System.out.println();
        }
        else if(ResultBytes[0] == -1){
            ErrorPacket errorPacket = new ErrorPacket(ResultBytes.length);
            errorPacket.setData(ResultBytes);
            System.out.println(errorPacket);
            System.out.println("Packet Identifier : " + IntegerType.getIntegerValue(errorPacket.getPacketIdentifier()));
            System.out.println("Error Code        : " + IntegerType.getIntegerValue(errorPacket.getErrorCode()));
            System.out.println("Server Status     : " + IntegerType.getIntegerValue(errorPacket.getServerStatus()));
            System.out.println("Error Message     : " + LengthCodeStringType.getString(errorPacket.getErrorMessage()));

        }
        else if(ResultBytes[0] == 254){
            EOFPacket eofPacket = new EOFPacket(ResultBytes.length);
            eofPacket.setData(ResultBytes);

            System.out.println(eofPacket);
            System.out.println("Packet Identifier      : " + IntegerType.getIntegerValue(eofPacket.getPacketIdentifier()));
            System.out.println("Warning Number         : " + IntegerType.getIntegerValue(eofPacket.getWarningNumber()));
            System.out.println("Server Status Bit Mask : " + IntegerType.getIntegerValue(eofPacket.getServerStatusBitMask()));

        }
        else {
            int fieldNumber = 0;
            ResultSetPacket resultSetPacket = new ResultSetPacket(ResultBytes.length);
            resultSetPacket.getResultSetPacketFromByte(ResultBytes);
            logger.i("Received resultSetPacket from server " + clientSocket.getInetAddress());
            //logger.i("resultSetPacket : " + resultSetPacket);

            ResultHeadPacket resultHeadPacket = resultSetPacket.getResultHeadPacket();
            /*System.out.println("resultHeadPacket : " + resultHeadPacket);
            System.out.print("Field Number      : ");
            byte[] bytes = LengthCodeBinaryType.getBytes(resultHeadPacket.getFieldNumber());
            for(byte b : bytes) {
                System.out.print(b + " ");
            }
            System.out.println();
            System.out.print("Extra Message     : ");
            bytes = LengthCodeBinaryType.getBytes(resultHeadPacket.getExtraMessage());
            for(byte b : bytes) {
                System.out.print(b + " ");
            }
            System.out.println();*/

            FieldPacket[] fieldPacketArrayGet = resultSetPacket.getFieldPacketArray();
            fieldNumber = fieldPacketArrayGet.length;
            System.out.println("Field Name");
            String[] fieldNames = new String[fieldNumber];
            int cnt = 0;
            for(FieldPacket fieldPacketGet : fieldPacketArrayGet) {
//                System.out.println("fieldPacket : " + fieldPacketGet);
//                System.out.println("Data Field          : " + LengthCodeStringType.getString(fieldPacketGet.getDataField()));
//                System.out.println("Database Name       : " + LengthCodeStringType.getString(fieldPacketGet.getDatabaseName()));
//                System.out.println("Table Alias Name    : " + LengthCodeStringType.getString(fieldPacketGet.getTableAliasName()));
//                System.out.println("Table Name          : " + LengthCodeStringType.getString(fieldPacketGet.getTableName()));
//                System.out.println("Field Alias Name    : " + LengthCodeStringType.getString(fieldPacketGet.getFieldAliasName()));
//                System.out.println("Field Name          : " + LengthCodeStringType.getString(fieldPacketGet.getFieldName()));
//                System.out.println("Fill Number         : " + IntegerType.getIntegerValue(fieldPacketGet.getFillNumber()));
//                System.out.println("Character Set       : " + IntegerType.getIntegerValue(fieldPacketGet.getCharacterSet()));
//                System.out.println("Field Length        : " + IntegerType.getIntegerValue(fieldPacketGet.getFieldLength()));
//                System.out.println("Field Type Code     : " + IntegerType.getIntegerValue(fieldPacketGet.getFieldTypeCode()));
//                System.out.println("Field Flag Bit Mask : " + IntegerType.getIntegerValue(fieldPacketGet.getFieldFlagBitMask()));
//                System.out.println("Decimal Point Pre   : " + IntegerType.getIntegerValue(fieldPacketGet.getDecimalPointPrecision()));
//                System.out.println("Reserved Field      : " + IntegerType.getIntegerValue(fieldPacketGet.getReservedField()));
//                System.out.println("Default Value       : " + LengthCodeStringType.getString(fieldPacketGet.getDefaultValue()));

                System.out.print(LengthCodeStringType.getString(fieldPacketGet.getFieldName()) + "   ");
                fieldNames[cnt++] = LengthCodeStringType.getString(fieldPacketGet.getFieldName());
            }
            System.out.println();

            EOFPacket eofPacket1Get = resultSetPacket.getEOFPacket1();
            /*System.out.println("EOFPacket1 : " + eofPacket1Get);
            System.out.println("Packet Identifier      : " + IntegerType.getIntegerValue(eofPacket1Get.getPacketIdentifier()));
            System.out.println("Warning Number         : " + IntegerType.getIntegerValue(eofPacket1Get.getWarningNumber()));
            System.out.println("Server Status Bit Mask : " + IntegerType.getIntegerValue(eofPacket1Get.getServerStatusBitMask()));*/

            RowDataPacket[] rowDataPacketArrayGet = resultSetPacket.getRowDataPacketArray(fieldNumber);
            System.out.println("Row Data");
            results = new ArrayList<RowData>();
            for(RowDataPacket rowDataPacketGet : rowDataPacketArrayGet) {
                //System.out.println("rowDataPacket : " + rowDataPacketGet);
                LengthCodeStringType[] rowDataArrayRes = rowDataPacketGet.getRowData(fieldNumber);
                RowData row = new RowData();
                int pos = 0;
                for(LengthCodeStringType rowData : rowDataArrayRes) {
                    System.out.print(LengthCodeStringType.getString(rowData) + " ");
                    row.add(fieldNames[pos++], LengthCodeStringType.getString(rowData));
                }
                System.out.println();
                results.add(row);
            }

            EOFPacket eofPacket2Get = resultSetPacket.getEOFPacket2();
            /*System.out.println("EOFPacket2 : " + eofPacket2Get);
            System.out.println("Packet Identifier      : " + IntegerType.getIntegerValue(eofPacket2Get.getPacketIdentifier()));
            System.out.println("Warning Number         : " + IntegerType.getIntegerValue(eofPacket2Get.getWarningNumber()));
            System.out.println("Server Status Bit Mask : " + IntegerType.getIntegerValue(eofPacket2Get.getServerStatusBitMask()));*/
            System.out.println();
            System.out.println();
        }

    }


    /**
     * 向远程服务器发送sql命令并返回结果
     * @param sql
     * @return
     */
    public List<RowData> execute(String sql){
        results = null;
        sendCommand(1, sql);
        try {
            getResult();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(results == null)
            results = new ArrayList<RowData>();
        return results;
    }

    /**
     * 从流中读取一个数据报文
     *
     * @param in 输入流
     * @return 读取得到的数据报文
     */
    public static Packet readPacket(InputStream in) throws IOException {
        /* 读取消息头 */
        byte[] packetHeaderBytes = new byte[4];
        in.read(packetHeaderBytes);
        PacketHeader packetHeader = new PacketHeader(4);
        packetHeader.setData(packetHeaderBytes);

        /* 读取消息体 */
        byte[] packetBodyBytes = new byte[packetHeader.getPacketLength()];
        in.read(packetBodyBytes);
        Packet packet = new Packet(4 + packetBodyBytes.length);
        packet.setPacketHeader(packetHeader);
        packet.setPacketBody(packetBodyBytes);

        return packet;
    }

    /**
     * 关闭流
     *
     * @param closeable 需要关闭的流
     */
    private void closeQuietly(Closeable closeable) {
        if (closeable != null) try {
            closeable.close();
        } catch (IOException e) {
            // TODO: do something
            Log.error("Close stream failed", e);
        } finally { /* we tried! */ }
    }

    /**
     * 构造验证报文
     *
     * @return 验证报文
     */
    private Packet buildCredentialsPacket() {
        IntegerType capabilities = IntegerType.getIntegerType(5, CredentialsPacket.LENGTH_CLIENT_CAPABILITIES);
        IntegerType maxPacketLength = IntegerType.getIntegerType(10, CredentialsPacket.LENGTH_MAX_PACKET_LENGTH);
        IntegerType characterSet = IntegerType.getIntegerType(1, CredentialsPacket.LENGTH_CHARACTER_SET);
        StringType userName = StringType.getStringType("ihainan");
        String password = "12345";
        String scramble = "12345678901234567890";
        String tokenStr = CHAP.calcToken(password, scramble);
        LengthCodeStringType token = LengthCodeStringType.getLengthCodeString(tokenStr);
        StringType dbName = StringType.getStringType("db_test");
        CredentialsPacket.CredentialInformation credentialInformation = new CredentialsPacket.CredentialInformation(userName, token, dbName);

        CredentialsPacket credentialsPacket = new CredentialsPacket(32 + userName.getSize() + token.getSize() + dbName.getSize());
        credentialsPacket.setClientCapabilities(capabilities);
        credentialsPacket.setMaxPacketLength(maxPacketLength);
        credentialsPacket.setCharacterSet(characterSet);
        credentialsPacket.setCredentialInformation(credentialInformation);
        byte[] body = new byte[credentialsPacket.getSize()];
        credentialsPacket.getData(body);

        /* 构建包头 */
        PacketHeader packetHeader = new PacketHeader(4);
        packetHeader.setPacketLength(credentialsPacket.getSize());
        packetHeader.setPacketID((byte) 0);     // TODO: 包序列号

        /* 构建数据包 */
        Packet packet = new Packet(packetHeader.getSize() + body.length);
        packet.setPacketHeader(packetHeader);
        packet.setPacketBody(body);

        return packet;
    }
}
