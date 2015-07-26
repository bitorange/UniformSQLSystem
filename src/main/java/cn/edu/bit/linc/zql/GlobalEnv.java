package cn.edu.bit.linc.zql;

import java.util.HashMap;

import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * 全局系统变量 <br />
 */
public class GlobalEnv {
    public static HashMap<String, String> configMap = new HashMap<String, String>();

    /**
     * 默认配置值
     */
    static {
        // TODO: 设置默认配置值
        configMap.put("conf.properties.path", "conf.properties");
    }

    public static void parseArgs(String args[]) {
        // 解析程序运行参数
        ArgumentParser parser = ArgumentParsers.newArgumentParser("console").defaultHelp(true).description("Spark SQL Console By LINC");
        parser.addArgument("-c", "--config")
                .setDefault("./conf.xml")
                .help("specify the system configuration file");

        Namespace ns = null;
        try {
            ns = parser.parseArgs(args);
        } catch (ArgumentParserException e) {
            parser.handleError(e);
            System.exit(1);
        }

        String configureFilePath = ns.getString("config");
        try {
            GlobalEnv.readConFile(configureFilePath);
        } catch (Exception e) {
            System.err.println("解析配置文件失败，失败原因：" + e.getMessage());
            System.exit(-1);
        }
    }

    /**
     * 读取配置文件
     *
     * @param filePath 配置文件路径
     * @throws ConfigurationException 读取 XML 配置文件失败
     */
    private static void readConFile(String filePath) throws ConfigurationException {
        XMLConfiguration config = new XMLConfiguration(filePath);
        NodeList list = config.getDocument().getElementsByTagName("entry");
        for (int i = 0; i < list.getLength(); i++) {
            Node node = list.item(i);
            String key = node.getAttributes().getNamedItem("key").getTextContent();
            String val = node.getTextContent();
            configMap.put(key, val);
        }
    }

    /**
     * 输出配置项
     */
    public static void printConf() {
        for (String key : configMap.keySet()) {
            System.out.println(key + ": " + configMap.get(key));
        }
    }
}
