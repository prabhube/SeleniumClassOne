package org.one;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chromeoptions {
public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\SeleniumClassOne\\Driver\\chromedriver.exe");

	ChromeOptions options= new ChromeOptions();
//	options.addArguments("--incognito");
	options.addArguments("--start-maximized");	
	WebDriver driver= new ChromeDriver(options);
	
	driver.get("https://www.amazon.in/");
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("mens shoes");
	search.click();
	Thread.sleep(2000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(2000);
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		WebElement select = driver.findElement(By.xpath("//span[text()='₹1,499']"));
		
	
		jse.executeScript("arguments[0],scrollIntoView(true)", select);
		System.out.println("hai");
		
		TakesScreenshot s=(TakesScreenshot) driver;
		File shot=s.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(shot,new File("path"));
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incontigo");
		WebDriver drive=new ChromeDriver(option);
		 driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
}
}
