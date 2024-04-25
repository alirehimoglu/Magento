package magento.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String readFromConfig(String key) {

        Properties properties = new Properties();

        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("C:\\Users\\alfir\\MagentoTeam\\config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String value = properties.getProperty(key);
        return value;

    }

    public static String readFromConfigWithFileName(String fileName, String key) {

        Properties properties = new Properties();

        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String value = properties.getProperty(key);
        return value;


    }

/*    public class ConfigReader2 {

        private static Properties properties = new Properties();

        static {
            try {
                FileInputStream file = new FileInputStream("src/test/resources/config.properties");
                properties.load(file);
                file.close();
            } catch (IOException e) {
                System.out.println("Properties file not found");
            }
        }
    }*/
}
