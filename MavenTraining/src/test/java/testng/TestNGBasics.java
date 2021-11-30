package testng;

import java.time.Duration;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGBasics {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();  
         driver = new ChromeDriver();
         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
        driver.get("https://freecrm.com/index.html");
	}
	
	
	
	@Test(priority=1)
	public void verifyPageTitleTest() {
		String title=driver.getTitle();
		System.out.println("The page title is:"+ title);
		Assert.assertEquals(title, "#1 Free CRM customer relationship management software cloud");
	}
	
	@Test(priority=2)
	public void verifyFreeCRMLogoTest() {
		boolean flog=driver.findElement(By.xpath("")).isDisplayed();
		Assert.assertTrue(flog);
	}
	
	@Test(priority=3) 
	public void verifyFreeCRMDropDownTest() throws InterruptedException { 
		Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@class='rd-navbar--has-dropdown rd-navbar-submenu']")).click();
	Thread.sleep(2000);
	}
	
	@Test(priority=4) 
	public void verifyFreeCRMIconTest() throws InterruptedException { 
		Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@alt='iTunes']")).click();
	Thread.sleep(2000);
	}
	
	@Test(priority=5) 
	public void verifyFreeCRMIcon2Test() throws InterruptedException { 
		Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@alt='Android']")).click();
	Thread.sleep(2000);
	}
	
	@Test(priority=6) 
	public void verifyFreeCRMLoginTest() throws InterruptedException { 
	driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharma1998lavkush@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//i[@class='users icon']")).click();
	Thread.sleep(9000);
	}
	
	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
