package testng;

import java.time.Duration;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Saucedemo {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();  
         driver = new ChromeDriver();
         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         driver.navigate().to("https://www.saucedemo.com/");
	}
	
	@Test(priority=1)
	public void launch() throws InterruptedException
	{
		WebElement userName = driver.findElement(By.id("login_credentials"));
        String usnm = userName.getText();
        String usnm1 = StringUtils.substringBetween(usnm, "are:", "locked_out_user");
        
        WebElement pw = driver.findElement(By.className("login_password"));
        String pswd = pw.getAttribute("innerHTML");
        String password = pswd.replace(driver.findElement(By.cssSelector(".login_password h4")).getAttribute("outerHTML"),"");
        
        System.out.println("Logging in with username - "+usnm1+"password - "+password);
        driver.findElement(By.id("user-name")).sendKeys(usnm1);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        
        Thread.sleep(2000);
        
        System.out.println("Logging out");
        WebElement sideBar = driver.findElement(By.id("react-burger-menu-btn"));
        sideBar.click();
       Thread.sleep(3000);
        WebElement logoutBtn = driver.findElement(By.id("logout_sidebar_link"));
        logoutBtn.click();
        Thread.sleep(3000);
        
        //Now converting username into upper case
        String usnm3 = StringUtils.substringBetween(usnm, "standard_user", "problem_user");
        String usnm4 = StringUtils.upperCase(usnm3); //converting username in upper case
        Thread.sleep(3000);
        System.out.println("Now logging in with invalid username - "+usnm4+"valid password - "+password);
        Thread.sleep(3000);
        driver.findElement(By.id("user-name")).sendKeys(usnm4);
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(3000);
        driver.findElement(By.id("login-button")).click();
       
        Thread.sleep(3000);
        System.out.println("verifying the assertion....");
        String expectedresult = "Epic sadface: Username and password do not match any user in this service";
        String actualresult = driver.findElement(By.cssSelector(".error-message-container h3")).getText();
        Assert.assertEquals(actualresult,expectedresult);
        System.out.println("Assertion passed, Expected result '"+expectedresult+"' is equal to the actual result. '"+actualresult+"' ");
	}
	
	@Test(priority=3)
	public void termination()
	{
		driver.close();
	}

}

