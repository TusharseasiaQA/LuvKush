package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforcexpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//a[@class='dropdown-toggle disabled']")).click();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("lavkush58@gmail.com");
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
;
		
		

	}

}
//*[@id="login_menu_item"]/button/span[1]