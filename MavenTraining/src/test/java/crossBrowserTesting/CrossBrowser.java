package crossBrowserTesting;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	WebDriver driver;
	@BeforeTest
	// Here this parameters we will take from testng.xml
	
	@Parameters("browser")
	public  void setup(String browser) throws Exception{
	 //Check if parameters passed from testng is 'firefox'
	if(browser.equalsIgnoreCase("firefox")){
		//create firefox instance
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Drivers\\geckodriver.exe" );
		driver=new FirefoxDriver();
		}
	
	//check if parameter passed as 'Chrome'
	else if(browser.equalsIgnoreCase("Chrome")){
		//Set the path of chrome driver exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91877\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		driver=new ChromeDriver();
		}
	
	else{
		 //If now browser passed throw exception
		throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
	@Test
	public void testparameterwithXML() throws InterruptedException {
		driver.get("https://freecrm.com/index.html");
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharma1998lavkush@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='users icon']")).click();
		Thread.sleep(3000);
	}
}


