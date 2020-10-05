package utils;

import java.io.FileReader;
import java.util.Properties;

public class Utilities {

	// This function returns values from config.properties file
	public static String getConfigValue(String arg) {
		String value = "";
		try {
			Properties prop = new Properties();
			FileReader file = new FileReader(System.getProperty("user.dir") + "\\config.properties");
			prop.load(file);
			value = prop.getProperty(arg);
		} catch (Exception e) {
			System.out.println("unable to read config file");

		}
		return value;
	}
}
