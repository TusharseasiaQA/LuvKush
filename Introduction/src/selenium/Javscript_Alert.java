package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Javscript_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 driver.manage().window().maximize();
			
//			driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
//			Thread.sleep(3000);
//			driver.switchTo().alert().accept();
			
			//Webdriver interface--extends--SearchContext interface-switch()
			
			
//			driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
//			Thread.sleep(4000);
//			driver.switchTo().alert().accept();
//			driver.switchTo().alert().dismiss();
//			
//			
//			//Alert interface--public abstract methos--accept,dismiss
//			
			driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
			Thread.sleep(4000);
			driver.switchTo().alert().sendKeys("Hello everyone");
			
			driver.switchTo().alert().accept();
			//driver.switchTo().alert().dismiss();
			Thread.sleep(4000);
			
			//driver.quit();

	}

}
