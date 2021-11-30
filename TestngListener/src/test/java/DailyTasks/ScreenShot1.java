package DailyTasks;




import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShot1 {
    WebDriver driver;
    @Test
    public void Titletest() {
    	 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
         Assert.assertEquals(driver.getTitle(), "Rediffmailmail");
    }
    @Test
    public void remembermetest(){
        boolean actualstatus=driver.findElement(By.id("remember")).isSelected();
        Assert.assertEquals(actualstatus,true);

    }
    @BeforeTest
    public void beforetest(){
    	System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();

    }
    
  
    @AfterMethod
    public void aftermethod() throws Exception  {
    	TakesScreenshot src = (TakesScreenshot) driver;
		File sc = src.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(sc, new File("./Screenshot1s/capture2.png"));

		Thread.sleep(2000);
		driver.close();
        
        }
    }

