package tests;



import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.io.IOException;
import org.json.simple.parser.ParseException;
import data.JsonDataReader;
import io.qameta.allure.Description;
import pages.GooglePage;


public class SeleniumSearchTest extends TestBase{



	

	@Test 
	@Description("Search about Selenium WebDriver TC")
	public void SeleniumSearch() throws IOException, ParseException {
		JsonDataReader jsonReader = new JsonDataReader();
		jsonReader.JsonReader();
		googleNavigate();
		GooglePage google = new GooglePage(driver);
		google.entersearchtxt(jsonReader.searchCriteria);
		google.clicksearch();
		
		AssertJUnit.assertTrue(google.searchResult.getText().contains(jsonReader.expectedResult));
		

	}

}
