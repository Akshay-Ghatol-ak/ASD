package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DataFactory {
         static WebDriver driver=null;
	public static  void initializetheBrowser(String BrowserName)
	{
		  
		
		if(BrowserName.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(BrowserName.equals("Edge")) {
			driver=new EdgeDriver();
		}
		else if(BrowserName.equals("Firefox")) {
			driver=new FirefoxDriver();
		}
		else if (BrowserName.equals("Safari")) {
			driver= new SafariDriver();
			
			
		}
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
