package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement sc=driver.findElement(By.xpath("//div[contains(text(),\"Fashion's Top Deals\")]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", sc);
		
		Thread.sleep(5000);
		List<WebElement> ele=driver.findElements(By.xpath("//div[starts-with(@data-tkid, 'M_7539a5b0')]"));
		for(WebElement str:ele)
		{
			String s=str.getText();
			System.out.println(s);
			
		}
		
		driver.quit();
	}

}
