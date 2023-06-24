package org.one;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathrelative {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prem\\eclipse-workspace\\SeleniumClassOne\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='location']")).sendKeys("egmore");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[contains(text(),'Egmore Metro Parking, Egmore, Chennai, Tamil Nadu, India')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
}
}
