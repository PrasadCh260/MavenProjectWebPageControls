package WebPageControls;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAndScroolingPageDown {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Actions actions = new Actions(driver);

		driver.get("https://testautomationpractice.blogspot.com/");

//	//	Page will down till end
//	    js.executeScript("window.scrollBy(0, document.body.scrollHeight);");

//	//  Scroll down page by pixel	
//      js.executeScript("window.scroll(0, 900);");

//		Thread.sleep(10);

		WebElement slider = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[6]/h2"));

//	//	Scroll down page till the element is visible
		
		js.executeScript("arguments[0].scrollIntoView(true);", slider);

		WebElement sliderHandle = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[6]/div[1]/div/span"));

		System.out.println("sliderhandle location before moving -" + sliderHandle.getLocation());

		actions.dragAndDropBy(sliderHandle, 300, 0).build().perform();

//		try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

		System.out.println("sliderhandle location after moving -" + sliderHandle.getLocation());

		driver.quit();

	}

}
