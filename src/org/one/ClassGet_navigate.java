package org.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassGet_navigate {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\SeleniumClassOne\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().to("https://www.instagram.com/");
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://indianbank.in/");
		driver.close();
	}
}
