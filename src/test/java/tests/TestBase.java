package tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.Helper;




//TestBase Class 
public class TestBase {

	//Strings chromepath,firefoxPath,IE gets the location of chrome driver to be used in the system property
	String chromepath= System.getProperty("user.dir")+ "/drivers/chromedriver.exe"; 
	String firefoxPath = System.getProperty("user.dir")+ "/drivers/geckodriver.exe"; 
	String IEPath = System.getProperty("user.dir")+ "/drivers/IEDriverServer.exe"; 
	//Driver to be used in the functions
	public static WebDriver driver;

	//Extent report



	//startDriver method that starts the driver before each TestCase maximize it and wait 
	@BeforeTest
	@Parameters({"browser"}) //for parameteraized test , browser retreived from suite.xml
	public void startDriver(@Optional String browserName){
		//If condition to work on different browsers according to suite.xml browser parameter value 
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", chromepath );
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", firefoxPath );
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.IEDriverServer.driver", IEPath );
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

	}

	//Extent Report Method to be done before suite


	//stopDriver method that stops the driver after each TestCase
	@AfterTest 
	public void stopDriver() {

		driver.quit();

	}

	//Navigate to Google (to be used in first Test)
	public void googleNavigate() {
		driver.navigate().to("https://www.google.com/ncr");

	}

	//Navigate to herokuapp (to be used in second & third Test)
	public void herokuappNavigate() {
		driver.navigate().to("https://the-internet.herokuapp.com/");

	}
	//Capture Screenshot on failure & save it in the screenshots folder

	@AfterMethod

	public void Failurescreenshot(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Test Case is Failed");
			System.out.println("Taking Screenshot....");
			Helper.captureScreenshot(driver, result.getName());


		}
	}



}
