package webDriveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChatGpt {
//	public class ChatGptHighlight {
	    public static void main(String[] args) {
	        // Set the path to your ChromeDriver
//	        System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        // Navigate to ChatGPT login page
	        driver.get("https://chat.openai.com/auth/login");

	        // Highlight elements
	        highlightElement(driver, By.id("email"));
	        highlightElement(driver, By.id("password"));
	        highlightElement(driver, By.xpath("//button[contains(text(),'Log in')]"));
	        highlightElement(driver, By.xpath("//a[contains(text(),'Sign up')]"));
	        // Add more elements as needed

	        // Close the browser
	        driver.quit();
	    }

	    private static void highlightElement(WebDriver driver, By locator) {
	        WebElement element = driver.findElement(locator);
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red; background: yellow;');", element);
	    }
	}