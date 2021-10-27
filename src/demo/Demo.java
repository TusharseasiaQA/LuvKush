package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Drivers\\geckodriver.exe" );
//		WebDriver driver=new FirefoxDriver();
		
//		System.setProperty("webdriver.edge.driver","E:\\Selenium Drivers\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		
		//driver.get("https://www.facebook.com");
//		WebElement usern=driver.findElement(By.id("email"));
//		usern.sendKeys("Lavkush");
//
//		WebElement pwd=driver.findElement(By.name("pass"));
//		pwd.sendKeys("test");
			
			
		//	System.out.println(driver.getPageSource());
			//System.out.println("URL:"+driver.getPageSource());
			//System.out.println("Title:"+driver.getTitle());
			
			
		
		  driver.findElement(By.name("q")).sendKeys("hyr tutorials");
		  driver.findElement(By.name("btnK")).submit();
		  
		  
		  driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB");
		  driver.findElement(By.name("firstname")).sendKeys("Lavkush");
		  driver.navigate().refresh(); Thread.sleep(2000); driver.navigate().back();
		  Thread.sleep(2000); driver.navigate().forward();
		 
			//String firstwindow=driver.getWindowHandle();
			//Thread.sleep(3000);
		//	driver.findElement(By.linkText("Already have an account?")).click();
			
			/*
			 * Set<String> windows = driver.getWindowHandles(); Iterator<String> itr =
			 * windows.iterator(); while(itr.hasNext()) { String window=itr.next();
			 * driver.switchTo().window(window);
			 * if(driver.getTitle().equals("Log in to Facebook1")){ driver.close(); } }
			 */
			// Thread.sleep(3000);
			// driver.switchTo().window(firstwindow);
		
		//	 driver.findElement(By.name("email")).sendKeys("Lavkush");
			 
		
		
	 
		//driver2.findElement(By.linkText("forgotten password")).click();
		//driver2.findElement(By.partialLinkText("forgotten")).click();
		
//		String currentURL=driver.getPageSource();
		//System.out.println(currentURL);
		
		//String title=driver.getTitle();
		//System.out.println(title);
		driver.close();

	}

}
