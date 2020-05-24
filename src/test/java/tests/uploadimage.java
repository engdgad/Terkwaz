package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.herokuapp;

public class uploadimage extends TestBase{
	
	@Test 
	@Description("Upload Image TC")
	public void upload() {

		
		herokuappNavigate();
		herokuapp hero = new herokuapp(driver);
		hero.clickuploadlink();
		hero.selectfile();
		hero.clickuploadfile();
		Assert.assertEquals(hero.uploadedmsg.getText(), hero.imgName);

		
		
		
		

}}

