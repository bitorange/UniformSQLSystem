package cn.edu.bit.linc.zql.util;

/**
 * Logger 工厂，返回 Logger 实例
 */
public class LoggerFactory {
    public static Logger getLogger(Class<?> clazz) {
        return new Logger(clazz);
    }
}
