package WebPageControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// how to handle links,Text boxes, Radio buttons, Check Boxes

public class BasicHTMLControls {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hindichbx")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("chinesechbx")).click();
		Thread.sleep(3000);
		WebElement spanishchbx = driver.findElement(By.id("spanishchbx"));
		spanishchbx.click();  //check
		Thread.sleep(3000);
		if(spanishchbx.isSelected())
			spanishchbx.click(); //uncheck
		driver.findElement(By.id("registerbtn")).click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
//		driver.findElement(By.id("clearbtn")).click();
	//	Thread.sleep(3000);
	//	driver.findElement(By.cssSelector("#clearFields"));
	//	Thread.sleep(3000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		driver.close();
	}		
	
}		
		
		
	