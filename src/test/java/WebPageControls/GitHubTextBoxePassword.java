package WebPageControls;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubTextBoxePassword {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().window().minimize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement PasswordTxt = driver.findElement(By.id("password"));
		if(PasswordTxt.isDisplayed()) {
			if(PasswordTxt.isEnabled()) {
				PasswordTxt.sendKeys("Prasad");
				String EnteredText=PasswordTxt.getAttribute("value");
				System.out.println(EnteredText);
				Thread.sleep(3000);
				PasswordTxt.clear();
				Thread.sleep(3000);
				driver.close();
			}
			else 
				System.out.println("PasswordTxt is not Enabled");
		}
		else
			System.err.println("PasswordTxt is not displayed");

	}

}
