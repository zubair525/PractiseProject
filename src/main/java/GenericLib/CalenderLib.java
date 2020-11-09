package GenericLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalenderLib {
	public void calenderHandle(WebDriver driver, String day, String month, String year) {
		int count=1;
		while(count<=12) {
			try {
				driver.findElement(By.xpath("//div[contains(@aria-label,'"+month+" "+day+" "+year+"')]")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				count++;
			}
		}
		if(count==12) {
			System.out.println("You have entered the invalid date");
		}
		else {
			System.out.println("The date is selected successfully");
		}
	}
}
