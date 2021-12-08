package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Factory {
	
	//Creating Global variable 
	static WebDriver driver;
	
	//Accepting browser name as parameter
	//Creating another parameter string url What ever the url the user will pass will get to the driver.get(url)
	//Creating static method
	public static WebDriver startBrowser(String browserName, String url) {
		
		if(browserName.equals("chromedriver")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(); 
			}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.edgedriver().setup();
			driver=new 	InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}
	
}
