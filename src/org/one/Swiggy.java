package org.one;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

public class Swiggy {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\SeleniumClassOne\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.swiggy.com/");
	WebElement location = driver.findElement(By.xpath("//input[contains(@placeholder,'delivery')]"));
	location.sendKeys("egmore");
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	WebElement locationconfirm = driver.findElement(By.xpath("(//span[contains(text(),'Egmore')])[1]"));
	locationconfirm.click();
	
	WebElement search = driver.findElement(By.xpath("//span[contains(text(),'Search')]"));
	search.click();
	WebElement menu = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
	menu.sendKeys("chicken briyani");
	WebElement ordered = driver.findElement(By.xpath("(//button[contains(@data-testid,autosuggest-item)])[2]"));
	ordered.click();
	WebElement selectorder = driver.findElement(By.xpath("(//div[text()='ADD'])[1]"));
	selectorder.click();
	WebElement add = driver.findElement(By.xpath("(//div[contains(@class,'_1ds9T')])[1]"));
	add.click();
	WebElement continueclk = driver.findElement(By.xpath("//span[contains(text(),'Continue')]"));
	continueclk.click();
			WebElement aadditem = driver.findElement(By.xpath("//span[contains(@class,'_38xdN')]"));
			aadditem.click();
		
			Actions s=new Actions(driver);
			WebElement cart = driver.findElement(By.xpath("//a[contains(@class,'_1T-E4')]"));
			s.moveToElement(cart).perform();
}
}
