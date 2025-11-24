package WebPageControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementProperties {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		
//		System.out.println(driver.findElement(By.name("commit")).getTagName());
		System.out.println(driver.findElement(By.name("commit")).getAttribute("type"));
		
//		WebElement userNameText = driver.findElement(By.id("login_field"));
//		userNameText.sendKeys("Prasad@gmail.com");
//		System.out.println(userNameText.getAttribute("value"));
		
//		System.out.println(driver.findElement(By.xpath("//label[normalize-space()='Username or email address']")).getText());
		
		System.out.println(driver.findElement(By.name("commit")).getCssValue("background-color"));
		
		driver.quit();

	}

}
