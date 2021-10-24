package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import java.io.File;
//import FileUtils.*;

public class ScreenShotHandle {
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();


		// TakesScreenshot ScrShot =(TakesScreenshot) driver;
		//  File SrcFile = ScrShot.getScreenshotAs(OutputType.FILE);
		//  FileUtils.copyFile(SrcFile, new File("D:\\selenium_material\\Screenshot\\screenshot2.png"));


		TakesScreenshot src = (TakesScreenshot) driver;
		File sc = src.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(sc, new File("./Screenshot2/capture2.png"));

		Thread.sleep(2000);
//		driver.close();System.setProperty("webdriver.gecko.driver", "D:\\selenium_material\\geckodriver-2\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();


		// TakesScreenshot ScrShot =(TakesScreenshot) driver;
		//  File SrcFile = ScrShot.getScreenshotAs(OutputType.FILE);
		//  FileUtils.copyFile(SrcFile, new File("D:\\selenium_material\\Screenshot\\screenshot2.png"));


		TakesScreenshot src1 = (TakesScreenshot) driver;
		File sc1 = src1.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(sc1, new File("./Screenshot2/capture2.png"));

		Thread.sleep(2000);
		driver.close();

		 
	}

}
