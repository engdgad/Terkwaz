package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class PageBase {

	//Create driver that works with elements
	protected WebDriver driver;

	//Create class constructor with webdriver interface as parameter to work with pages
	public PageBase(WebDriver driver) {
	//PageFactory method helps in working with POM
		PageFactory.initElements(driver, this);
	}

	// Method that clicks on web element
	protected static void click (WebElement button) {
		button.click();

	}

	//Method that type text in web element
	protected static void sendvalue(WebElement element , String txt) {
		element.sendKeys(txt);
	}
	
	
	
	


	
}


