package utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Attachment;

public class TestListener {
	@Attachment (value = "Page Screenshot", type= "image/png")
	public static byte[] saveScreenshot(WebDriver driver) {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	
	}
@Attachment (value = "{0}" , type = "text/plain")
public static String saveLogText(String message) {
	return message;
}
}
