package tests;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.herokuapp;

public class waitTest extends TestBase{
	
	@Test 
	@Description("Wait for Loader to finish TC")
	public void waitText() {
		//logger = report.createTest("Wait Test");
		//logger.info("Wait Test");
		herokuappNavigate();
		herokuapp hero = new herokuapp(driver);
		hero.dynamicloadclick();
		hero.example2click();
		hero.start();
		//hero.waitToFinish();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.invisibilityOf(hero.ajaxloader));
		Assert.assertEquals(hero.finishmsg.getText(), "Hello World!");
		//logger.pass("Required Search Result appeared");
		//logger.fail("Required Search Result didn't appear");
	}

}
