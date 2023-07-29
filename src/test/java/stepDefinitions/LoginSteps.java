package stepDefinitions;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import pageObjects.LoginPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class LoginSteps {

	WebDriver driver;
	LoginPage lp;
	Logger logger;
	
	
	@Before
	public void setup()
	{
		logger=LogManager.getLogger(this.getClass());
	}
	@After
	public void teardown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
		driver.quit();
	}
	@Given("User Launch browser")
	public void user_launch_browser() {
	    
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}

	@Given("opens URL {string}")
	public void opens_url(String url) throws InterruptedException {
	    driver.get(url);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	}

	@When("User navigate to Login page")
	public void user_navigate_to_login_page() {
		lp=new LoginPage(driver);

	    lp.Clickonlogin_icon();
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
	  
		lp.Setusername(username);
		
	    lp.Setpassword(password);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	    lp.Clickonlogibtn();
	}

	@Then("User navigate to Home page")
	public void user_navigate_to_home_page() {
	  lp.getPageTitle();
	   
	}
}
