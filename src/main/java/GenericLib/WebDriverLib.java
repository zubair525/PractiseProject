package GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverLib {
	
	public void moveToElement(WebDriver driver, WebElement target) {
		Actions act=new Actions(driver);
		act.moveToElement(target);
	}
}
