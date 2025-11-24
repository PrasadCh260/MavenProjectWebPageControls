package WebPageControls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class DataPicker {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");

		driver.switchTo().frame(0);

		String year = "2020";
		String month = "March";
		String date = "14";

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		while (true) {
            WebElement monElement = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            WebElement yrElement = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
            String mon = monElement.getText();
            String yr = yrElement.getText();

            if (mon.equals(month) && yr.equals(year)) {
                break;
            } else {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
            }
        }

        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
        for (WebElement ele : dates) {
            if (ele.getText().equals(date)) {
                ele.click();
                break;
            }
        }

//        // You may want to add some delay here for demonstration purpose
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        driver.quit();
    }
}