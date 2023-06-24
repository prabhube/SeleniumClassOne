package org.one;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\SeleniumClassOne\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.get("https://www.swiggy.com/");
	driver.manage().window().maximize();
	WebElement select = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div[2]/div/div/input"));
	select.sendKeys("egmore");
	WebElement chose = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div[2]/div/div[2]/button"));
	chose.click();
	WebElement search = driver.findElement(By.xpath("/html/body/div/div/header/div/div/ul/li[5]/div/a/span[2]"));
	search.click();
	WebElement searchenter = driver.findElement(By.xpath(""));
	searchenter.sendKeys("");
	
	
	

}
}
