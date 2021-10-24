package selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DragDrop1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Drivers\\geckodriver.exe" );
//		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		WebElement source=driver.findElement(By.xpath("//span[text()='Lawrence Block']"));
		WebElement destination=driver.findElement(By.xpath("//ul[text()='Ajax in Practice']"));
		Thread.sleep(2000);
		act.clickAndHold(source)
		.pause(Duration.ofSeconds(2))
		.moveToElement(destination)
		.pause(Duration.ofSeconds(2))
		.release()
		.build()
		.perform();

	}

}
