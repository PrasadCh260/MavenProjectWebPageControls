package webDriveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edge {

	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			// driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			// driver.findElement(By.name("password")).sendKeys("admin123");
	 
	
	}

}
