package WebPageControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTextBoxeLoginField {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement usernameTxt = driver.findElement(By.id("login_field"));
		if (usernameTxt.isDisplayed()) {
			if (usernameTxt.isEnabled()) {
				usernameTxt.sendKeys("Prasad");
				String EnteredText = usernameTxt.getAttribute("value");
				System.out.println(EnteredText);
				Thread.sleep(3000);
//				usernameTxt.clear();
				usernameTxt.sendKeys(" Babu");
//				driver.close();
			}

			else
				System.err.println("UserNameText box is not Enabled");
		}

		else
			System.err.println("UserNameText box is not displayed");
	}
}
