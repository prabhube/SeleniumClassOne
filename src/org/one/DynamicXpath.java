package org.one;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\SeleniumClassOne\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		WebElement select = driver.findElement(By.cssSelector("input.twotabsearchtextbox"));
//		WebElement select = driver.findElement(By.xpath("//input[@type='text']"));
		select.sendKeys("mens shirt");
		WebElement choose = driver.findElement(By.xpath("(//div[text()='mens shirt'])[2]"));
		choose.click();
		WebElement price_seclect = driver.findElement(By.xpath("(//span[text()='₹1,399'])[1]//parent::span//parent::div//preceding-sibling::span[@class='a-price']"));
		price_seclect.click();
		driver.findElement(By.xpath(""));
		System.out.println("hai");
	}
}
