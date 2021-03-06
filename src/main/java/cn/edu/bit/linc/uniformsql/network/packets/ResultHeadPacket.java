package cn.edu.bit.linc.uniformsql.network.packets;

import cn.edu.bit.linc.uniformsql.network.packets.type.LengthCodeBinaryType;

/**
 * 结果集头部报文
 */
public class ResultHeadPacket extends BasePacket {

    /**
     * 域数量的偏移量
     */
    public final static int OFFSET_FIELD_NUMBER = 0;

    /**
     * 域数量的长度
     */
    private int fieldLen = -1;

    /**
     * 额外信息的偏移量 - 域数量的长度
     */
    public final static int OFFSET_EXTRA_MESSAGE_MINUS_FIELD_LENGTH = 0;

    /**
     * 额外信息的长度
     */
    private int extraLen = -1;

    /**
     * 创建指定大小的结果集头部报文
     *
     * @param size 指定大小（字节为单位）
     */
    public ResultHeadPacket(int size) {
        super(size);
    }

    /**
     * 设置 _data_ 数组
     *
     * @param data 指定 byte 数组
     */
    @Override
    public void setData(byte[] data) {
        super.setData(data);
    }

    /**
     * 设置域数量字段
     *
     * @param fieldNumber 域数量
     */
    public void setFieldNumber(LengthCodeBinaryType fieldNumber) {
        byte[] bytes = new byte[fieldNumber.getSize()];
        fieldLen = fieldNumber.getSize();
        fieldNumber.getData(bytes);
        System.arraycopy(bytes, 0, _data_, OFFSET_FIELD_NUMBER, bytes.length);
    }

    /**
     * 获取域数量字段
     *
     * @return 域数量
     */
    public LengthCodeBinaryType getFieldNumber() {
        byte[] tmp = new byte[_data_.length - OFFSET_FIELD_NUMBER];
        System.arraycopy(_data_, OFFSET_FIELD_NUMBER, tmp, 0, tmp.length);
        fieldLen = LengthCodeBinaryType.getLength(tmp);

        byte[] data = new byte[fieldLen];
        System.arraycopy(_data_, OFFSET_FIELD_NUMBER, data, 0, data.length);
        return LengthCodeBinaryType.getLengthCodeBinaryTypeUsingData(data);
    }

    /**
     * 设置额外信息字段
     *
     * @param extraMessage 额外信息
     */
    public void setExtraMessage(LengthCodeBinaryType extraMessage) {
        byte[] bytes = new byte[extraMessage.getSize()];
        extraLen = extraMessage.getSize();
        extraMessage.getData(bytes);
        System.arraycopy(bytes, 0, _data_, fieldLen + OFFSET_EXTRA_MESSAGE_MINUS_FIELD_LENGTH, bytes.length);
    }

    /**
     * 获取额外信息字段
     *
     * @return 额外信息
     */
    public LengthCodeBinaryType getExtraMessage() {
        byte[] tmp = new byte[_data_.length - fieldLen - OFFSET_EXTRA_MESSAGE_MINUS_FIELD_LENGTH];
        System.arraycopy(_data_, fieldLen + OFFSET_EXTRA_MESSAGE_MINUS_FIELD_LENGTH, tmp, 0, tmp.length);
        extraLen = LengthCodeBinaryType.getLength(tmp);

        byte[] data = new byte[extraLen];
        System.arraycopy(_data_, fieldLen + OFFSET_EXTRA_MESSAGE_MINUS_FIELD_LENGTH, data, 0, data.length);
        return LengthCodeBinaryType.getLengthCodeBinaryTypeUsingData(data);
    }

    /**
     * 获取在完整data数组头部的结果头包
     *
     * @param __data 完整数组
     * @return 结果头包的长度
     */
    public int getResultHeadPacketFromByte(byte[] __data, int offset) {

        byte[] _data = new byte[__data.length - offset];
        System.arraycopy(__data, offset, _data, 0, __data.length - offset);

        setData(_data);
        getFieldNumber();
        getExtraMessage();

        int newLen = fieldLen + OFFSET_EXTRA_MESSAGE_MINUS_FIELD_LENGTH + extraLen;
        byte[] newData = new byte[newLen];
        System.arraycopy(_data_, 0, newData, 0, newLen);
        setData(newData);

        return newLen;
    }

    /**
     * 通过参数构建结果头报文
     *
     * @param _fieldNumber
     * @param _extraMessage
     * @return
     */
    public static ResultHeadPacket getResultHeadPacket(byte[] _fieldNumber, byte[] _extraMessage) {
        LengthCodeBinaryType fieldNumber = LengthCodeBinaryType.getLengthCodeBinaryType(_fieldNumber);
        LengthCodeBinaryType extraMessage = LengthCodeBinaryType.getLengthCodeBinaryType(_extraMessage);

        ResultHeadPacket resultHeadPacket = new ResultHeadPacket(fieldNumber.getSize() + extraMessage.getSize());
        resultHeadPacket.setFieldNumber(fieldNumber);
        resultHeadPacket.setExtraMessage(extraMessage);

        return resultHeadPacket;
    }

    /**
     * 测试函数
     *
     * @param args 程序参数
     */
    public static void main(String[] args) {

        LengthCodeBinaryType fieldNumber = LengthCodeBinaryType.getLengthCodeBinaryType(new byte[]{1, 2, 3, 4, 5, 6, 7, 8});
        LengthCodeBinaryType extraMessage = LengthCodeBinaryType.getLengthCodeBinaryType(new byte[]{4, 3, 2, 1});

        ResultHeadPacket resultHeadPacket = new ResultHeadPacket(fieldNumber.getSize() + extraMessage.getSize());
        resultHeadPacket.setFieldNumber(fieldNumber);
        resultHeadPacket.setExtraMessage(extraMessage);

        //ResultHeadPacket resultHeadPacket = ResultHeadPacket.getResultHeadPacket(new byte[] {1, 3, 4}, new byte[] {3, 2, 1});

        System.out.println(resultHeadPacket);
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
        System.out.println();

        /* 通过byte[]构建 */
        ResultHeadPacket resultHeadPacketCopy = new ResultHeadPacket(resultHeadPacket.getSize()+2);
        byte[] data = new byte[resultHeadPacket.getSize()];
        resultHeadPacket.getData(data);
        byte[] newdata = new byte[data.length+2];
        for(int i = 0; i < data.length; ++i)
            newdata[i] = data[i];
        newdata[newdata.length-1] = 1;
        newdata[newdata.length-2] = 2;
        resultHeadPacketCopy.getResultHeadPacketFromByte(newdata, 0);
        System.out.println();

        System.out.println(resultHeadPacketCopy);
        System.out.print("Field Number      : ");
        bytes = LengthCodeBinaryType.getBytes(resultHeadPacketCopy.getFieldNumber());
        for(byte b : bytes) {
            System.out.print(b + " ");
        }
        System.out.println();

        System.out.print("Extra Message     : ");
        bytes = LengthCodeBinaryType.getBytes(resultHeadPacketCopy.getExtraMessage());
        for(byte b : bytes) {
            System.out.print(b + " ");
        }
        System.out.println();

    }
    /* Output:
    [8, 1, 2, 3, 4, 5, 6, 7, 8, 4, 4, 3, 2, 1]
    Field Number      : 1 2 3 4 5 6 7 8
    Extra Message     : 4 3 2 1

    [8, 1, 2, 3, 4, 5, 6, 7, 8, 4, 4, 3, 2, 1]
    Field Number      : 1 2 3 4 5 6 7 8
    Extra Message     : 4 3 2 1
     */

}
