package org.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision_classone {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\SeleniumClassOne\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.youtube.com/");
		driver.get("https://www.amazon.in/");
		driver.get("https://www.snapdeal.com/");
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().to("https://indianbank.in/");
		driver.close();
		
		
	}
}
