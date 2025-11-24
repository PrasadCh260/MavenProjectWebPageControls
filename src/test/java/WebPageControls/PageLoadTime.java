package WebPageControls;

import java.time.Duration;
import java.time.Instant;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTime {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		Page load Time Outs
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		Instant startTime = Instant.now();
		System.out.println(startTime.toString());
		
		driver.get("https://www.hyrtutorials.com/");
		
		Instant endTime = Instant.now();
		System.out.println(endTime.toString());
		Duration duration = Duration.between(startTime, endTime);
		
		System.out.println("pageload Time:"+duration.getSeconds()+"Seconds");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	
	}

}
