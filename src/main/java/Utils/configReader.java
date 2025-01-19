package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configReader {
 
	
	
	public static Properties initializeProperties() {
		
		Properties prop= new Properties();
		File ProFile=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties");
		try {
			FileInputStream Fis= new FileInputStream(ProFile);
			prop.load(Fis);
		}
		catch(Throwable e ) {
			e.printStackTrace();
		}
		return prop;
		
	}
	
}
