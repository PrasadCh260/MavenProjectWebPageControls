package CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSelectors {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		System.out.println(driver.findElement(By.cssSelector("button")).getAttribute("id"));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Prasad");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#lastName")).sendKeys("Ch");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".gender")).sendKeys("male");
		Thread.sleep(3000);
		System.out.println(driver.findElements(By.cssSelector("*")).size());
		
		driver.close();

	}

}
