package WebPageControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformMouseActions {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        driver.get("https://demo.nopcommerce.com/");

        actions.moveToElement(driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")))
               .moveToElement(driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a")))
               .click()
               .build()
               .perform();
        
//        actions.doubleClick(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1"))).doubleClick().build().perform();
        
        actions.contextClick(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1"))).build().perform();
               
    }
}
