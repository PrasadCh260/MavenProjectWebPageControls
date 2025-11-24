package webDriveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChatXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chat.openai.com/auth/login");
		
		driver.findElement(By.xpath("//div[normalize-space()='Log in']")).click();
		
		
//		driver.findElement(By.xpath("//textarea[@id='prompt-textarea']")).sendKeys("Hi");
//		driver.findElement(By.xpath("//span[@data-state='delayed-open']//*[name()='svg']")).click();
//		
		
		
	

	}

}
