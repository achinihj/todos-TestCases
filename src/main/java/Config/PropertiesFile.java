package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {
	
static	Properties prop = new Properties();
	
	


	public static String getProperty(String setting) {
		
		try {
			InputStream input = new FileInputStream("src/main/java/Config/config.properties");
		prop.load(input);
		return prop.getProperty(setting);
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	
}

}
