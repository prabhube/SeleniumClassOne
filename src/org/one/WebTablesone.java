package org.one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesone {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\SeleniumClassOne\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		WebElement table = driver.findElement(By.tagName("table"));
		WebElement body = table.findElement(By.tagName("tbody"));
		List<WebElement> row = body.findElements(By.tagName("tr"));
		for(int i=0;i<row.size();i++)
		{
			WebElement rowe= row.get(i);
			List<WebElement> data = rowe.findElements(By.tagName("td"));
			for(int j=0;j<data.size();j++)
			{
				WebElement out = data.get(j);
				String text = out.getText();
				System.out.print(text);
				System.out.print("   || ");
			}
			System.out.println();
		}
	}
}
