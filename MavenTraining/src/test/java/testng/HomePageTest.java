package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();  
         driver = new ChromeDriver();
         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
        driver.get("https://ui.cogmento.com/");
        login("sharma1998lavkush@gmail.com", "Test@123");
        
	}
	
	
	
	private void login(String string, String string2) {
		// TODO Auto-generated method stub
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharma1998lavkush@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//div[@//a[contain(text(), 'Login')]")).click();
		
	}



	
	
	@Test(priority=3)
	public void clickOnDealsListTest() {
		WebElement deals=driver.findElement(By.xpath("//a[contain(text(), 'Deals')]"));
		deals.click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
