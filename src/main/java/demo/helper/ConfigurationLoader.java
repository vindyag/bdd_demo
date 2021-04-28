package demo.helper;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationLoader {

    public static Integer getUpperLimit() throws IOException {

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties properties = new Properties();
        try(InputStream resourceStream = loader.getResourceAsStream("config.properties")) {
            properties.load(resourceStream);
        }
        Object upperLimit = properties.get("upper.limit");
        if (upperLimit != null) {
            return Integer.valueOf(String.valueOf(upperLimit));
        }
        return 0;
    }
}
