package GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import PomClasses.LoginPage;

public class BaseClass {
	FileData data=new FileData();
	public WebDriver driver;
	
	@BeforeSuite
	public void BS() {
		System.out.println("Connect to DB");
	}
	@BeforeTest
	public void BT() throws Throwable {
		String browser = data.propertiesData("Browser");
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get(data.propertiesData("URL"));
	}
	@BeforeMethod
	public void BM() throws Throwable {
		LoginPage login=new LoginPage(driver);
		login.signIn();
	}
	@AfterMethod
	public void AM() {
		System.out.println("After Method");
	}
	@AfterTest
	public void AT() {
		driver.quit();
	}
	@AfterSuite
	public void AS() {
		System.out.println("Disconnect DB connection");
	}
}
