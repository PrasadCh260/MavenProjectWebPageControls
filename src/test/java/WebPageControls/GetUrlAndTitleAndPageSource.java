package WebPageControls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlAndTitleAndPageSource {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
//		Url
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl -"+currentUrl);
		
//		Title
		
		String title = driver.getTitle();
		System.out.println("Title -"+title);
		
//		Page Source
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		
		driver.quit();
		

	}

}
