package org.one;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlies {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\SeleniumClassOne\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement findElement = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		findElement.click();
		WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		search.sendKeys("iphone12");
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		WebElement select = driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (White, 64 GB)']"));
		select.click();
		String handle = driver.getWindowHandle();
		
		Set<String> a = driver.getWindowHandles();
		for(String b:a)
		{
			if(!handle.equals(b))
			{
				driver.switchTo().window(b);
				
			}
		}
		Thread.sleep(2000);
		WebElement buynow = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']"));
		buynow.click();
		Thread.sleep(2000);
		WebElement contie = driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']"));
		contie.sendKeys("9790288099");
		WebElement finale = driver.findElement(By.xpath("//button[@class='_2KpZ6l _20xBvF _3AWRsL']"));
		finale.click();
		Thread.sleep(2000);
		
		driver.switchTo().window(handle);
		WebElement mobiles = driver.findElement(By.xpath("(//a[text()='Mobiles & Accessories'])[1]"));
		System.out.println(mobiles.getText()); 
		
	}
}
