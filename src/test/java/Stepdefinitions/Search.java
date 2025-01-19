package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Factory.DataFactory;
import Pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	WebDriver driver;
	SearchPage Ak6;
	@Given("open the URl")
	public void open_the_u_rl() {
	driver=DataFactory.getDriver();
	
	}

	@When("Search the Product Iteam {string}")
	public void search_the_product_iteam(String prodcut) {
		 Ak6= new SearchPage(driver);
		Ak6.ProductSearch(prodcut);
	    
	}

	@When("Click on search button")
	public void click_on_search_button() {
		 Ak6= new SearchPage(driver);
	    Ak6.ClickOnSearch();
	}

	@Then("User should display the product")
	public void user_should_display_the_product() {
		 Ak6= new SearchPage(driver);
    Assert.assertEquals( Ak6.ProductIsDispaly(),"Search - HP");
	}



}
