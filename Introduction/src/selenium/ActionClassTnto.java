package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionClassTnto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		  Actions act = new Actions(driver);
	        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	        driver.findElement(By.xpath("//input[@name='Submit' and @class='button']")).click();

	         WebElement a= driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
	        WebElement b= driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
	        WebElement c= driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
	        act.moveToElement(a).moveToElement(b).click(c).build().perform();
//		

	}

}
