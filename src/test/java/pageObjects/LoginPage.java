package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;
public class LoginPage  extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	//elements
	@FindBy(xpath="//a[@class='elementor-icon']")WebElement licon;
	@FindBy(xpath="//input[@id='username-4352']")WebElement uname;
	@FindBy(xpath="//input[@id='user_password-4352']")WebElement pass;
	@FindBy(xpath="//input[@id='um-submit-btn']")WebElement lbtn;
	@FindBy(xpath="//a[normalize-space()='john scott']")WebElement title;
	//JavascriptExecutor js = (JavascriptExecutor) driver;
  
	//actions
	
	public void Clickonlogin_icon()
	{
		licon.click();
	}
	public void Setusername(String username)
	{
		
		uname.sendKeys(username);
	}
	public void Setpassword(String password)
	{

		pass.sendKeys(password);
		
		//js.executeScript("arguments[0].click();", pass);
	}
	public void Clickonlogibtn()
	{
		lbtn.click();
	}
	public String getPageTitle() {
		return title.getText();
	}
}
