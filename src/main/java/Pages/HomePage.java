package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	// Construter 
	public HomePage (WebDriver driver)
			{
		      this.driver=driver;
		      PageFactory.initElements(driver,this);
			}	

	
	
	
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement MyAccount;
	public void ClickMyAccount() {
		MyAccount.click();
	}
	
	
	@FindBy(xpath="(//*[text()='Login'])[1]")
	private WebElement LoginButton;
		public void ClickOnLoginButton() {
			LoginButton.click();
		}
			
			@FindBy(xpath="//*[text()='Register']")
			private WebElement RegisterButton;
				public void ClickRegisterButton() {
					RegisterButton.click();
			
			
			
			
	}
		@FindBy(xpath="//*[@class='alert alert-danger alert-dismissible']")
		private WebElement WarnningMessaDisplay;
			public String WarningMessageNotMatched() {
			return	WarnningMessaDisplay.getText();
		
		}
  	
}
