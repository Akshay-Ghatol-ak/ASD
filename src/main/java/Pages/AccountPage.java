package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class AccountPage {
WebDriver driver;
	
	// Construter 
	public AccountPage (WebDriver driver)
			{
		      this.driver=driver;
		      PageFactory.initElements(driver,this);
			}	

	@FindBy(xpath="//*[@id='content']")
	private WebElement MyAccountPage;
	
	public boolean OpenAccountPageIsDispay() {
	return	MyAccountPage.isDisplayed();
		
	}

}
