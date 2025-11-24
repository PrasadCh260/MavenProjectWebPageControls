package WebPageControls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultipleSelection {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement ideElement = driver.findElement(By.id("ide"));
		Select ideDropDown = new Select(ideElement);
		List<WebElement> ideDropDownOpions = ideDropDown.getOptions();
		for (WebElement option : ideDropDownOpions ) {
			System.out.println(option.getText());
		}
		ideDropDown.selectByIndex(0);
		Thread.sleep(3000);
		ideDropDown.selectByValue("ij");
		Thread.sleep(3000);
		ideDropDown.selectByVisibleText("Visual Studio");
		Thread.sleep(3000);
		ideDropDown.deselectByValue("ij");
//		driver.close();

	}

}

		
