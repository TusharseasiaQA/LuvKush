// Create a package in eclipse
package captureScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Libarary.Utility;

// Import all classes and interface
 
public class FacebookScreenshot {
	WebDriver driver; //defined globally
	@Test
	public void chaptureScreenShot() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.cogmento.com/");
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='email' and @placeholder='E-mail address']")).sendKeys("sharma1998lavkush@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		Assert.assertEquals(driver.getTitle(), "Rediffmailmail");
	}
	
    @AfterTest
    public void aftertest(){
        driver.quit();
    }
	
}
 
 
 