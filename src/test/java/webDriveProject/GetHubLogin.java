package webDriveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHubLogin {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Create an account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("naidu.ch098@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-optimizely-event='click.signup_continue.email']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Spb@3279");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-optimizely-event='click.signup_continue.password']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login")).sendKeys("chittemsetty12");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-continue-to='opt-in-container']")).click();
		Thread.sleep(3000);
		
		
		
		
		

	}

}
