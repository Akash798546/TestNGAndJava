package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks  {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");

        // Find all links (anchor tags) on the webpage
        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total links found: " + links.size());

        // Iterate over each link and check if it's broken
        for (WebElement link : links) {
            String url = link.getAttribute("href");

            if (url != null && !url.isEmpty()) {
                try {
                    checkBrokenLink(url);
                } catch (IOException e) {
                    System.out.println("Error checking link: " + url);
                }
            } else {
                System.out.println("Link with no href attribute: " + link.getText());
            }
        }

        // Close the browser
        driver.quit();
    }

    // Method to check if the link is broken
    public static void checkBrokenLink(String url) throws IOException {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();

            int responseCode = connection.getResponseCode();

            if (responseCode >= 400) {
                System.out.println(url + " is a broken link. Response code: " + responseCode);
            } else {
                System.out.println(url + " is a valid link. Response code: " + responseCode);
            }

        } catch (Exception e) {
            System.out.println(url + " is a broken link.");
        }
    }
}
