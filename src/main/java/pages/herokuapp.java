package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class herokuapp extends PageBase {

	// Auto-generated constructor 
	public herokuapp(WebDriver driver) {
		super(driver);
	}
	//Image details
	public String imgName = "Selenium.png";
	String imgPath = System.getProperty("user.dir")+"/uploads/"+imgName;

//Locators
	//**Upload locators**//
	@FindBy (linkText = "File Upload")
	WebElement uploadfile;
	
	@FindBy(id="file-upload")
	WebElement Choosefile;

	@FindBy (id = "file-submit")
	WebElement uploadbtn;

	@FindBy (id = "uploaded-files")
	public WebElement uploadedmsg;
	//**Dynamic load locators**//
	@FindBy (linkText = "Dynamic Loading")
	WebElement dynamicload;
	
	@FindBy (linkText = "Example 2: Element rendered after the fact")
	WebElement example2;
	
	@FindBy(xpath = "//*[@id=\"start\"]/button")
	WebElement startbtn;
	
	@FindBy (id="finish")
	public WebElement finishmsg;
	
	@FindBy (xpath="//*[@id=\"loading\"]/img")
	public WebElement ajaxloader;
	
	
//***Upload functions***//
	//Click on upload link , click function created in basepage
	public void clickuploadlink() {
		click(uploadfile);
	}
	//select file function , sendvalue created in basepage
	public void selectfile() {
		sendvalue(Choosefile,imgPath);
		//Choosefile.sendKeys(imgPath);
	}
	//Click on upload button , click function created in basepage
	public void clickuploadfile() {
		click(uploadbtn);
	}
	
//***DynamicLoad functions***//
	//Click on dynamicload link , click function created in basepage
		public void dynamicloadclick() {
			click(dynamicload);
		}
		
	//Click on Example 2 link , click function created in basepage
		public void example2click() {
			click(example2);
		}
	
	//Click on Start button , click function created in basepage
		public void start() {
			click(startbtn);
		}
	

}
