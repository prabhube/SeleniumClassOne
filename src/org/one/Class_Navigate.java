package org.one;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class_Navigate {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\SeleniumClassOne\\Driver\\chromedriver.exe");
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
//		driver.navigate().to("https://www.instagram.com/");
//		driver.navigate().to("https://indianbank.in/");
//		driver.close();
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	}
}
