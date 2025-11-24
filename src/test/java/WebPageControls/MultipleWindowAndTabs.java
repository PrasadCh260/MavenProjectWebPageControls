package WebPageControls;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowAndTabs {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		
////		Single WIndow
//		
//	 String parentWindowHandle = driver.getWindowHandle();
//	 System.out.println("parent window handle - "+ parentWindowHandle + driver.getTitle());
//	 driver.findElement(By.id("newWindowBtn")).click();
//	 Set<String> windowHandles = driver.getWindowHandles();
//	 for(String windowHandle : windowHandles) {
//		 if(!windowHandle.equals(parentWindowHandle)) {
//			 driver.switchTo().window(windowHandle);
//			 driver.manage().window().maximize();
//			 driver.findElement(By.id("firstName")).sendKeys("prasad");
//			 Thread.sleep(3000);
//			 driver.close();
//			 Thread.sleep(3000); 
//		 }
//		 
//	 }
//	 driver.switchTo().window(parentWindowHandle);
//	 driver.findElement(By.id("name")).sendKeys("Babu");
//	 Thread.sleep(3000);
	 
	 
	// Single Tab
	 
	 
	 String parentWindowHandle = driver.getWindowHandle();
	 System.out.println("parent window handle - "+ parentWindowHandle + driver.getTitle());
	 driver.findElement(By.id("newTabBtn")).click();
	 Set<String> windowHandles = driver.getWindowHandles();
	 for(String windowHandle : windowHandles) {
		 if(!windowHandle.equals(parentWindowHandle)) {
			 driver.switchTo().window(windowHandle);
			 System.out.println(driver.findElement(By.id("output")).getText());
			 Thread.sleep(3000); 
			 driver.findElement(By.id("alertBox")).click();
			 Thread.sleep(3000); 
			 System.out.println(driver.switchTo().alert().getText());
			 Thread.sleep(3000); 
			 driver.switchTo().alert().accept();
			 Thread.sleep(3000); 
			 System.out.println(driver.findElement(By.id("output")).getText());
			 driver.close();
		
		 }
		 
	 }
	 driver.switchTo().window(parentWindowHandle);
	 driver.findElement(By.id("name")).sendKeys("Babu");
	 Thread.sleep(3000);
	 
	 driver.quit();
	 

	}
}






























