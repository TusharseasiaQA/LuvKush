package Libarary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {
	public static void chaptureScreenShot(WebDriver driver, String ScreenshotName) {
		
		try {
			TakesScreenshot src = (TakesScreenshot) driver;
			File sc = src.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sc, new File("./Screenshots1/"+ScreenshotName+".png")); /*parameterizing the capture screenshot method, it prevent overriding*/
			System.out.println("Screenshot taken");
		}catch (Exception e) {
			System.out.println("Exception While taking the Screenshot"+e.getMessage());
		}
	}
}
