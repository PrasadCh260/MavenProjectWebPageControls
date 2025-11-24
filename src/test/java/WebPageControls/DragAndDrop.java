package WebPageControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        driver.get("https://testautomationpractice.blogspot.com/");
        
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        
        WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
        
        actions.dragAndDrop(drag, drop).perform();
        
        
        driver.quit();
        
        

	}

}
