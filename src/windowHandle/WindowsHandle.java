package windowHandle;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) /*throws InterruptedException*/ {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		//Thread.sleep(4000);
		
	
		Set<String>wb = driver.getWindowHandles();   /*Set is an interface according to the hierarchy of collection framework it store the unique 
														address of a window n the form of string, It does not allow duplicate data*/
		
		Iterator<String>it = wb.iterator();                       //Iterator is an interface//
		String pid = it.next();
		String cid = it.next();
		driver.switchTo().window(cid);
		//Thread.sleep(3000);
		
		String gt = driver.findElement(By.cssSelector(".im-para.red")).getText();
		System.out.println(gt);
		String emailid = gt.split("at")[1].trim().split(" ")[0];
		System.out.println(emailid);
		
		driver.switchTo().window(pid);
		
		driver.findElement(By.id("username")).sendKeys(emailid);
		//Thread.sleep(3000);

	}

}
