package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.FileData;

public class LoginPage {
	FileData fis=new FileData();
	@FindBy(xpath = "//span[text()='Account & Lists']")
	private WebElement AccountsAndList;
	
	@FindBy(id = "ap_email")
	private WebElement userName;
	
	@FindBy(id = "continue")
	private WebElement Continue;
	
	@FindBy(id = "ap_password")
	private WebElement password;
	
	@FindBy(id = "signInSubmit")
	private WebElement signIn;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void signIn() throws Throwable {
		AccountsAndList.click();
		userName.sendKeys(fis.propertiesData("UserName"));
		Continue.click();
		password.sendKeys(fis.propertiesData("Password"));
		signIn.click();
		
	}
}

