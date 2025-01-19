package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;

public SearchPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
	
@FindBy(xpath="//*[@class='form-control input-lg']")
private WebElement SearchButton;
public void ProductSearch(String prodcut) {
	SearchButton.sendKeys(prodcut);
}

@FindBy(xpath="//*[@class='btn btn-default btn-lg']")
private WebElement ClickOnSearchButton;
public void ClickOnSearch() {
	ClickOnSearchButton.click();
}
@FindBy(xpath="//h1[text()='Search - HP']")
private WebElement productDisplay;
public String ProductIsDispaly() {
	return productDisplay.getText();
}


}
