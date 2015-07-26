package cn.edu.bit.linc.zql.util;

import org.apache.log4j.Level;

/**
 * 日志工具类
 */
public class Logger {
    private static org.apache.log4j.Logger LOG;

    /**
     * 构造函数
     *
     * @param clazz 希望获得 Logger 对象的类
     */
    protected Logger(Class<?> clazz) {
        LOG = org.apache.log4j.Logger.getLogger(clazz);
    }

    /**
     * INFO 级别 Log
     *
     * @param msg 消息内容
     */
    public void i(String msg) {
        LOG.log(Logger.class.getCanonicalName(), Level.INFO, msg, null);
    }

    /**
     * DEBUG 级别 Log
     *
     * @param msg 消息内容
     */
    public void d(String msg) {
        LOG.log(Logger.class.getCanonicalName(), Level.DEBUG, msg, null);
    }

    /**
     * WARN 级别 Log
     *
     * @param msg 消息内容
     */
    public void w(String msg) {
        LOG.log(Logger.class.getCanonicalName(), Level.WARN, msg, null);
    }

    /**
     * ERROR 级别 Log
     *
     * @param msg 消息内容
     */
    public void e(String msg) {
        LOG.log(Logger.class.getCanonicalName(), Level.ERROR, msg, null);
    }

    /**
     * ERROR 级别异常
     *
     * @param msg 消息内容
     * @param e   异常
     */
    public void e(String msg, Exception e) {
        LOG.log(Logger.class.getCanonicalName(), Level.ERROR, msg, e);
    }

    /**
     * FATAL 级别 Log
     *
     * @param msg 消息内容
     */
    public void f(String msg) {
        LOG.log(Logger.class.getCanonicalName(), Level.FATAL, msg, null);
    }

    /**
     * FATAL 级别异常
     *
     * @param msg 消息内容
     * @param e   异常
     */
    public void f(String msg, Exception e) {
        LOG.log(Logger.class.getCanonicalName(), Level.FATAL, msg, e);
    }

    /**
     * 测试函数
     *
     * @param args 程序参数
     */
    public static void main(String args[]) {
        Logger log = LoggerFactory.getLogger(Logger.class);
        log.i("Hello World");
    }
}
