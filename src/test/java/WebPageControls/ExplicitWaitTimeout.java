package WebPageControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTimeout {

	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

//        driver.findElement(By.id("btn1")).click();

		WebElement button1 = driver.findElement(By.id("btn1"));
		button1.click();
		WebElement button1AfterClick = driver.findElement(By.id("btn1"));
		boolean isEnabledAfterClick = button1AfterClick.isEnabled();
		System.out.println("Is button Enabled after click: " + isEnabledAfterClick);
		
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("txt1")));

		driver.findElement(By.id("txt1")).sendKeys("prasd");

		driver.findElement(By.id("btn2")).click();

		driver.findElement(By.id("txt2")).sendKeys("babu");

		driver.quit();

	}

}
