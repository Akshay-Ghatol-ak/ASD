package Hooks;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Factory.DataFactory;
import Utils.configReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class MyHooks {
WebDriver driver;
	
	@Before 
	public void openpage() {
		Properties prop = configReader.initializeProperties();
		DataFactory.initializetheBrowser(prop.getProperty("browser"));
		driver=DataFactory.getDriver();
		driver.navigate().to(prop.getProperty("Url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@After
	public void closed(Scenario Scenario) {
		String Scenarioname =Scenario.getName().replaceAll(" ", "_");
		if(Scenario.isFailed()) {
			 byte[] ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			 Scenario.attach(ScreenShot,"image/png", Scenarioname);
			
		}
		driver.close();
	}
	
	
}
