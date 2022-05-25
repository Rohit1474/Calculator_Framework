package Com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() throws Exception {
		
	String path="C:\\Users\\User\\eclipse-workspace\\Calculator_Framework\\Config\\Config.properties";
	FileInputStream fis= new FileInputStream(path);
	 pro = new Properties();
	pro.load(fis);
	}
	public String getBaseUrl_Stage() {
		 return pro.getProperty("BaseUrl_Stage");
	}
}
