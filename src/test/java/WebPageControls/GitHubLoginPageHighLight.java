package WebPageControls;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubLoginPageHighLight {
			public static void main(String[] args) throws InterruptedException {
				WebDriver driver = new ChromeDriver();
				driver.get("https://github.com/login");
				Thread.sleep(3000);
				highlight(driver, driver.findElement(By.id("login_field")));
				Thread.sleep(3000);
				highlight(driver, driver.findElement(By.name("password")));
				Thread.sleep(3000);
				highlight(driver, driver.findElement(By.className("header-logo")));
				Thread.sleep(3000);
				highlight(driver, driver.findElement(By.linkText("Forgot password?")));
				Thread.sleep(3000);
				highlight(driver, driver.findElement(By.partialLinkText("Create an account")));
				Thread.sleep(3000);
				highlight(driver, driver.findElement(By.tagName("h1")));
				Thread.sleep(3000);
//			    highlight(driver, driver.findElement(By.xpath("h1")));
//			    Thread.sleep(3000);

				driver.quit();
			}

			private static void highlight(WebDriver driver, WebElement findElement) {
				JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
				jsExecutor.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red; background: yellow;');",
						findElement);
			}
		}



