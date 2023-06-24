package org.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorOne {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prem\\eclipse-workspace\\SeleniumClassOne\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cityunionbank.com/cub-export-oriented-services");
			//using tagname . -uesd for class locator and enter class attribute value
			// using tagname # -used for id locator and enter id attribute value 
		driver.findElement(By.cssSelector("input#name")).sendKeys("karthick");
			// using ^ -used for start with attribute value is used
			//using tagname[attribute name^= attribute value]
		driver.findElement(By.cssSelector("input[onkeyup^=numberOnly]")).sendKeys("9790256798");
			//using $ -using for end with attribute value is used
			//using tagname[attribute name$= attribute value]
		driver.findElement(By.cssSelector("input[name$=ail]")).sendKeys("pyth@gmail.com");
			//using * -using for middle value of attribute value is used
			//using tagname[attribute name*= attribute value]
		driver.findElement(By.cssSelector("input[name*=nco]")).sendKeys("600001");
	}
}
