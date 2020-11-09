package CalenderPop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericLib.CalenderLib;

public class CalenderPopTest {
	@Test
	public void calenderPop() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[text()='Flights']")).click();
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		/*
		 * driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		 * driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		 * driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		 * driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		 */
		
		/*
		 * driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		 * 
		 * driver.findElement(By.xpath("//div[@aria-label='Thu Apr 22 2021']")).click();
		 */
		CalenderLib cal=new CalenderLib();
		cal.calenderHandle(driver, "30", "Nov", "2020");
	}
}
