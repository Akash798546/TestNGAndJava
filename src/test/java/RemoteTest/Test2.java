package RemoteTest;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Test2 {
	
@Test	
public  void test2() throws MalformedURLException
{
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--headless");
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");
	DesiredCapabilities dc=new DesiredCapabilities();
	 dc.setCapability("browserName", "chrome");
     dc.setCapability(ChromeOptions.CAPABILITY, options);
     URL gridUrl = new URL("http://localhost:4444/wd/hub");
     WebDriver driver = new RemoteWebDriver(gridUrl, dc);
     driver.get("https://www.instagram.com/");
     System.out.println("Title: " + driver.getTitle());

     // Cleanup
     driver.quit();
}

}
