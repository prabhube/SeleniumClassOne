package org.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\SeleniumClassOne\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement username = driver.findElement(By.cssSelector("input#email"));
	username.sendKeys("automationtest");
	WebElement pass = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"));
	pass.sendKeys("12345");
	WebElement submit = driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy"));
	submit.click();
}
}
