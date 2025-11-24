package WebPageControls;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSingleSelection {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement courseElement = driver.findElement(By.id("course"));
		Select courseNameDropDown = new Select(courseElement);
//		List<WebElement> courseNameDropDownOpions = courseNameDropDown.getOptions();
//		for (WebElement option : courseNameDropDownOpions ) {
//			System.out.println(option.getText());
//		}
		courseNameDropDown.selectByIndex(1);
		Thread.sleep(3000);
		courseNameDropDown.selectByValue("net");
		Thread.sleep(3000);
		courseNameDropDown.selectByVisibleText("Python");
		System.out.println(courseNameDropDown);
		

	}

}
