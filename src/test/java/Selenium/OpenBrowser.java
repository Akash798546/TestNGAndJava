package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenBrowser {

    WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setup(String browser) {
        System.out.println("Opening the Browser");

        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "D://Projects//testng-master//testng-master//Drivers//geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            // Uncomment the following lines if you want to use Chrome
            // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            // driver = new ChromeDriver();
        } else {
            throw new IllegalArgumentException("Browser not supported: " + browser);
        }

        driver.manage().window().maximize(); // Optional: maximize browser window
    }

    @Test
    @Parameters("url")
    public void launchsite(String url) throws InterruptedException {
        driver.get(url); // Use the URL parameter
        Thread.sleep(5000); // Consider replacing with WebDriverWait for better practice
    }

    @Test(dependsOnMethods = {"launchsite"})
    @Parameters("searchTerm")
    public void search(String searchTerm) {
        WebElement input = driver.findElement(By.name("q")); // Google search box has name="q"
        input.sendKeys(searchTerm); // Use the parameter
        input.sendKeys(Keys.ENTER);
    }

    @AfterTest
    public void closebrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
