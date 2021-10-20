package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "E:\\Selenium Drivers\\geckodriver.exe" );
		//WebDriver driver=new FirefoxDriver();
		
	
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
		
		
		WebDriver driver1=new ChromeDriver();
	
		//ChromeDriver driver1=new ChromeDriver();
		
		
		
		
		
		//driver1.get("http://google.com"); //Hit url on the browser  
		 
		 // Dimension newdimension=new Dimension(300, 600);
		//  driver1.manage().window().setSize(newdimension);
		 

//		 driver1.navigate().to("https://www.hotstar.com/in"); //re-direct hotstar page.
//		driver1.manage().window().maximize();
//		 driver1.manage().window().fullscreen();
		 
//		 driver1.findElement(By.linkText("Gmail")).click();
//		 driver1.findElement(By.linkText("Sign in")).click();
//		 driver1.findElement(By.id("identifierId")).sendKeys("sharma98lavkush@gmail.com");
//		 driver1.findElement(By.id("identifierNext")).click();
		 //System.out.println(driver.getCurrentUrl()); //validate, if you are landed on current url
		  
		 //System.out.println(driver.getPageSource()); //print page source
		 
		//System.out.println(driver.getTitle()); // validate if your page title is correct
		 //driver.navigate().back(); //navigate for backward 
		// driver1.navigate().forward(); //navigate for forward
		// driver1.navigate().refresh();
		 //driver1.navigate().to("https://www.facebook.com/");
		 //driver.close(); //It closes second browser
		 //driver.quit();  
		
		//driver1.get("http://omayo.blogspot.com/");
//		driver1.findElement(By.linkText("Open a popup window")).click();
//		driver1.close(); 	//It closes current tabs in browser with help of selenium script
//		//driver1.quit(); 	//// I closes all the tabs opened in browser with help of selenium script
		 
		 
		 driver1.get("http://www.tutorialsninja.com/demo/");
		 driver1.manage().window().maximize();
		 Thread.sleep(2000);
		 Dimension newdimension=new Dimension(300, 600);
		 driver1.manage().window().setSize(newdimension);
		 
		 System.out.println(driver1.manage().window().getSize());
//		Dimension dimension = driver1.findElement(By.name("search")).getSize();
//		System.out.println("Height of search box field is: "+dimension.height);
//		System.out.println("Width of search box field is: "+dimension.width);
//		 
//		 driver1.manage().window().getPosition().getX();
//		 driver1.manage().window().getPosition().getY();
//		 System.out.println("Window position X coordinates Is: "+driver1.manage().window().getPosition().getX());
//		 System.out.println("Window position Y coordinates Is: "+driver1.manage().window().getPosition().getY());
		 
		 //driver1.manage().window().setPosition(new Point(50,200));
		
	}

}
   