package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccountPage {
WebDriver driver;

	
	public RegisterAccountPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-firstname")
	private WebElement FirstName;
	public void EnterUserName(String First) {
		FirstName.sendKeys(First);
	}
	
	@FindBy(id="input-lastname")
	private WebElement LastName;
	public void EnterLastName(String Last) {
		LastName.sendKeys(Last);
	}
	
	@FindBy(id="input-email")
	private WebElement Email;
	public void EnterEmailRegister(String emial) {
		Email.sendKeys(emial);
	}
	@FindBy(id="input-telephone")
	private WebElement Telephone;
	public void  EnetrTelephoneNumber(String telephone) {
		Telephone.sendKeys(telephone);
	}
	@FindBy(id="input-password")
	private WebElement Password;
	public void  EnetrThePassword(String Password1) {
		Password.sendKeys(Password1);
	}
	
	@FindBy(id="input-confirm")
	private WebElement ConFormedPassword;
	public void  EnetrConFormedPassword(String ConPassword) {
		ConFormedPassword.sendKeys(ConPassword);
	}
	
	@FindBy(xpath="//*[@Name='agree']")
	private WebElement ClickOnPrivacyButton;
	public void ClickOnThePrivacyButton () {
		ClickOnPrivacyButton.click();
		
}
	
	
	@FindBy(xpath="//*[@class='btn btn-primary']")
	private WebElement ClickOnContinueButton;
	public void ClickOnTheContinueButton () throws InterruptedException {
		ClickOnContinueButton.click();
		Thread.sleep(2000);
}
	@FindBy(xpath="//*[@class='btn btn-primary']")
	private WebElement MessageShouldDisplay;
	public String MessageShouldDisplay () {
	return	MessageShouldDisplay.getText();
	}
	
}
