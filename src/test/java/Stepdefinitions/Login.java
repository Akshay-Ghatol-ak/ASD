package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Factory.DataFactory;
import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	private LoginPage Ak1;
	private HomePage Ak;
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page()
	{
		driver=DataFactory.getDriver();
         // MyAccount Click
	    Ak= new HomePage(driver);
		Ak.ClickMyAccount();
		Ak.ClickOnLoginButton();
	
		
		
	   
	}

	@When("the user enters valid {string} and {string} credentials")
	public void the_user_enters_valid_credentials(String email , String Password ) 
	{ 
	    Ak1 = new LoginPage(driver);
		//LoginPage Ak1= new LoginPage(driver);
		Ak1.EnterUserNameEmail(email);
		Ak1.EnterUserPassword(Password);
		
	}

	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
	    Ak1.LoginButtonAffterCredentials();
	}

	@And("the user should be redirected to the homepage")
	public void the_user_should_be_redirected_to_the_homepage() {
       AccountPage Ak2= new AccountPage(driver);
     Assert.assertTrue(Ak2.OpenAccountPageIsDispay());
	}

	@Then("a wellcome message should be displayed")
	public void a_wellcome_message_should_be_displayed() {
	  String Title= driver.getTitle();
	  System.out.println(Title);
	}

	@Given("Navigate to the login page")
	public void navigate_to_the_login_page() {
		driver=DataFactory.getDriver();
		 Ak= new HomePage(driver);
		Ak.ClickMyAccount();
		Ak.ClickOnLoginButton();
	
	}
	@When("The User enter the Invalid UserName {string} and Password {string}")
	public void the_user_enter_the_invalid_user_name_and_password(String email, String Password) {
		 Ak1 = new LoginPage(driver);
		Ak1.EnterUserNameEmail(email);
		Ak1.EnterUserPassword(Password);
		
	}

	@And("Click on login button")
	public void click_on_login_button() {
	    Ak1.LoginButtonAffterCredentials();
	   
	}

	@And("User sholud be display homepage")
	public void user_sholud_be_display_homepage() {
		
		 Ak= new HomePage(driver);
		 String ExpectResult= "Warning: No match for E-Mail Address and/or Password.";
	Assert.assertTrue(Ak.WarningMessageNotMatched().contains(ExpectResult));
		
		
	}

	@Then("A wellcome message should be not displayed")
	public void a_wellcome_message_should_be_not_displayed() {
		  String Title= driver.getTitle();
		  System.out.println(Title);
	}

}
