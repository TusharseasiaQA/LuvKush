package selenium;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenShot3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();



		TakesScreenshot src = (TakesScreenshot) driver;
		File sc = src.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(sc, new File("./Screenshot3/capture2.png"));

		Thread.sleep(2000);


		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();


	
		TakesScreenshot src1 = (TakesScreenshot) driver;
		File sc1 = src1.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(sc1, new File("./Screenshot3/capture2.png"));

		Thread.sleep(2000);
		driver.close();

	}

}
