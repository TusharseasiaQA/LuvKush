# LuvKush
package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "E:\\Selenium Drivers\\geckodriver.exe" );
		//WebDriver driver=new FirefoxDriver();
		
	
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
		WebDriver driver1=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\msedgedriver.exe" );
		WebDriver driver2=new Microsoft WebDrive();
		
		
		
		
		 driver2.get("http://google.com"); //Hit url on the browser  
		 //driver.navigate().to("https://www.hotstar.com/in"); //re-direct hotstar page.
		
		 //System.out.println(driver.getCurrentUrl()); //validate, if you are landed on current url
		  
		 //System.out.println(driver.getPageSource()); //print page source
		 
		//driver.get("https://www.hotstar.com/in");
		//System.out.println(driver.getTitle()); // validate if your page title is correct
		 //driver.navigate().back(); //navigate for backward 
		 //driver.navigate().forward(); //navigate for forward
		 //driver.close(); //It closes second browser
		 //driver.quit();  // I closes all the browser opened by the selenium script

		
	}

}
   
