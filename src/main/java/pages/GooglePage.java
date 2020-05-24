package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GooglePage extends PageBase {

	// Auto-generated constructor 
	public GooglePage(WebDriver driver) {
		super(driver);
	}


	@FindBy ( name  = "q")
	WebElement searchTxtBx ;

	@FindBy (name = "btnK")
	WebElement searchBtn ;	

	//element used in assertion is public to be used in the TestCase
	@FindBy (xpath = "/html/body/div[6]/div[2]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[5]/div/div[1]/a/h3")
	public WebElement searchResult;

	
	
	public void entersearchtxt(String SearchText) {
		//from Pagebase use setText method
		sendvalue(searchTxtBx, SearchText);
	}

	public void clicksearch() {
		//from Pagebase use setText method
		click(searchBtn);

	}
	
	
	
	
	


}

