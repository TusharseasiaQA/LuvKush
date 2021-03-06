package testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileUsingRobotClass {

	@Test
	public void UploadFileUsingRobotClassTest() throws AWTException, InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://resume.naukri.com/resume-quality-score?fftid=101003");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='browse']")).click();
		
		Thread.sleep(2000);
		
		//Use of Robot class to uplaod file
		
		Robot robot=new Robot();  //Created object of robot class
		
		//Store the path of the file to be uploaded using StringSelection class object
		
		StringSelection filepath=new StringSelection("E:\\My document\\12th class PDF.pdf"); //passing the argument to the constructor of the string class
		
		//Copy above path to clipboard
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null); // So that our path available in clipboard
		
		//Now press CTRL
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);

		//Press V
        robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);

        //Release V
        robot.keyRelease(KeyEvent.VK_V);

        //Release CTRL
        robot.keyRelease(KeyEvent.VK_CONTROL);
		
        //Press ENTER
        robot.keyPress(KeyEvent.VK_ENTER);

        //Release ENTER
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        Thread.sleep(10000);
        
        System.out.println("File uploaded successfully by using Robot class");

        driver.close();
		
	}
}