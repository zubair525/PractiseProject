package Amazon;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericLib.BaseClass;

public class CapturePrice extends BaseClass{
	
	
	@Test
	public void capturePriceOfIphone11() {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone11");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String text = driver.findElement(By.xpath("//span[text()='Apple iPhone 11 Pro, 64GB, Midnight Green - Fully Unlocked (Renewed)']"
				+ "/ancestor::div[@class='sg-col-4-of-12 sg-col-8-of-16 sg-col-16-of-24 sg-col-12-of-20 sg-col-24-of-32 "
				+ "sg-col sg-col-28-of-36 sg-col-20-of-28']/descendant::span[@class='a-price-whole']")).getText();
		
		System.out.println(text);
	}
}
