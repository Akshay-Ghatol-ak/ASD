package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	 
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	      PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="input-email")
	   private WebElement UserNameEmail;
	   public void EnterUserNameEmail(String email) {
		   UserNameEmail.sendKeys(email);
	   }
	   
	   @FindBy(id="input-password")
	   private WebElement UserPassword;
	   public void EnterUserPassword(String Password)
	   {
	 	  UserPassword.sendKeys(Password);
	   }	
	 	
	   @FindBy(xpath="(//*[@class='btn btn-primary'])[2]")
	   private WebElement LoginButtonTwo;
	   public void LoginButtonAffterCredentials() {
	 	  LoginButtonTwo.click();
	   }

}
