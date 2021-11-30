package links;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All_Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		
		 
		 //dynamic wait
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://freecrm.com/index.html");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@name='email and @placeholder='E-mail address']")).sendKeys("sharma1998lavkush@gmail.com");
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
			Thread.sleep(3000);
			driver.switchTo().frame("mainpanel");
		 //1. need to collect the all tags, and we will store in a list of webElement
		 List<WebElement> linklist=driver.findElements(By.tagName("a"));
		 linklist.addAll(driver.findElements(By.tagName("img")));
		 System.out.println("Size of full links and images -->"+linklist.size());
		 List<WebElement>activelinks=new ArrayList<WebElement>();
		 
		 //2. Iterate linklist using for loop: exclude all the links/images - doesnt  have any href attribute
		 for(int i=0; i<linklist.size(); i++) {
			 if(linklist.get(i).getAttribute("href")!=null) {
				 activelinks.add(linklist.get(i)); 
			 }
		 }
		 
		 //get the size of active links list
		 System.out.println("Size of active links and images -->"+activelinks.size());
		 
		 
		 
		 

		
		 }
	}


