package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;




public class OptionalParameters {
	WebDriver driver;
	@Parameters("browsername")
	@BeforeTest
	public void Intializebrowser(String browsername) {
		driver =new ChromeDriver();
		switch(browsername){
		case "chrome" : 
			driver =new ChromeDriver();
			break;
		case "edge" : 
			driver =new EdgeDriver();
			break;
		case "firefox" : 
			driver =new FirefoxDriver();
			break;
		default:System.out.println("no browser is matching");
		break;
		}}}
		
	
