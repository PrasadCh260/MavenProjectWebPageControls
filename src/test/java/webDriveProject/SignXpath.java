package webDriveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignXpath {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		driver.findElement(By.id("login_field")).sendKeys("singara.ch460@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Prasad");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[@role='alert']")).getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='px-2']//button[@aria-label='Dismiss this message']//*[name()='svg']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
