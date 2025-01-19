package Stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Factory.DataFactory;
import Pages.HomePage;
import Pages.RegisterAccountPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	WebDriver driver;
	// global dealer
	RegisterAccountPage Ak5;

	@Given("Navigate to the Registeration Page")
	public void navigate_to_the_registeration_page() throws InterruptedException {
		driver = DataFactory.getDriver();
		HomePage Ak4 = new HomePage(driver);
		Ak4.ClickMyAccount();
		Ak4.ClickRegisterButton();
		Thread.sleep(4550);

	}

	@When("Enter the all Mandatory fileds")
	public void enter_the_all_mandatory_fileds(DataTable dataTable) throws InterruptedException {
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		Ak5 = new RegisterAccountPage(driver);
		Ak5.EnterUserName(dataMap.get("First"));
		Ak5.EnterLastName(dataMap.get("Last"));
		Ak5.EnterEmailRegister(dataMap.get("Email"));
		Ak5.EnetrTelephoneNumber(dataMap.get("Telephone"));
		Ak5.EnetrThePassword(dataMap.get("Password"));
		Ak5.EnetrConFormedPassword(dataMap.get("PasswordConform"));
		Thread.sleep(450);
	}

	@And("User click on privacy policy")
	public void user_click_on_privacy_policy() throws InterruptedException {
		Ak5 = new RegisterAccountPage(driver);
		Ak5.ClickOnThePrivacyButton();
		Thread.sleep(1550);
	}

	@And("User click on continue button")
	public void user_click_on_continue_button() throws InterruptedException {
		Ak5 = new RegisterAccountPage(driver);
		Ak5.ClickOnTheContinueButton();
		Thread.sleep(1550);
	}

	@Then("User account successfuly Register")
	public void user_account_successfuly_register() throws InterruptedException {
		Ak5 = new RegisterAccountPage(driver);
		String Excpet = "Congratulations! Your new account has been successfully created!";
		Assert.assertEquals(Ak5.MessageShouldDisplay(), "Congratulations! Your new account has been successfully created!");
		Thread.sleep(1550);

	}

	@And("User click on privacy policy1")
	public void user_click_on_privacy_policy1() {
		Ak5 = new RegisterAccountPage(driver);
		Ak5.ClickOnThePrivacyButton();

	}

	@And("User click on continue button1")
	public void user_click_on_continue_button1() throws InterruptedException {
		Ak5 = new RegisterAccountPage(driver);
		Ak5.ClickOnTheContinueButton();
	}

	@Then("User should display")
	public void user_should_display() {
		// String Actual=driver.findElement(By.xpath("")).getText();
		// String Expect="";
		// Assert.assertEquals(Actual, Expect);

	}

}
