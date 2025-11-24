package CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssAttributeSelectors {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		Thread.sleep(3000);
		System.out.println(driver.findElements(By.cssSelector("input[placeholder]")).size());
		System.out.println(driver.findElements(By.cssSelector("input[placeholder='First Name']")).size());
		System.out.println(driver.findElements(By.cssSelector("input[placeholder~='question']")).size());
		System.out.println(driver.findElements(By.cssSelector("input[placeholder*='que']")).size());
		System.out.println(driver.findElements(By.cssSelector("p[class|='my']")).size());
		System.out.println(driver.findElements(By.cssSelector("p[class^='my']")).size());
		System.out.println(driver.findElements(By.cssSelector("p[class$='lass']")).size());

		driver.quit();
	}
}