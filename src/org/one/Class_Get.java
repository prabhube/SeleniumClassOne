package org.one;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Class_Get {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\SeleniumClassOne\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.get("https://www.amazon.in/");
		//driver.get("https://www.snapdeal.com/");
//		JavaScriptExecutor js=( )driver
//	TakesScreenshot shot= (TakesScreenshot)driver;
//	
//	File as = shot.getScreenshotAs(OutputType.FILE);
//	System.out.println(as);
//	Thread.sleep(2000);
//	FileUtils.copyFile(as,new File("D:\\prabhu\\file\\screen.png"));
//		

//		WebElement cssuser = driver.findElement(By.cssSelector("input#email"));
//		cssuser.sendKeys("nandhu");
//		WebElement csspass = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"));
//		csspass.sendKeys("12345");
//		WebElement forget = driver.findElement(By.linkText("Forgotten password?"));
//		forget.click();
//		WebElement partial = driver.findElement(By.partialLinkText("Forgotten"));
//		partial.click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File shot=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(shot,new File("path"));
	
		
	}
	
}
