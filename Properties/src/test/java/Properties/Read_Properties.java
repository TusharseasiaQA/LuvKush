package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_Properties {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = null;
		
		//How to read the property file 
		//1) We have to create object of the properties class and this class is already available in java inside the util package
		
		Properties props=new Properties();
		
		//We have to create the object of one more class that is file input stream class
		
		FileInputStream ip=new FileInputStream("E:\\java installation\\Properties\\src\\test\\java\\Properties\\config.properties");
		
		//Using one method to load the FileInputStream class
		
		props.load(ip); // props.load() means load all the properties that are present inside the config.properties file
		
		//Need to acess the properties
		System.out.println(props.getProperty("browser"));
		
		//Creating one string variable
		String BrowserName=props.getProperty("browser");
		
		//giving condition 
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
			driver=new ChromeDriver();
			}
		else if(BrowserName.equals("firefox")) {
			
			driver=new FirefoxDriver();
		}
		else if(BrowserName.equals("IE")) {
			
			driver=new SafariDriver();
		}
		else if(BrowserName.equals("IE")) {
			
			driver=new InternetExplorerDriver();
		}
		else {
			System.out.println("no browser value is given");
		}
		driver.get(props.getProperty("url"));
		driver.findElement(By.name("txtUsername")).sendKeys(props.getProperty("username"));
		driver.findElement(By.name("txtPassword")).sendKeys(props.getProperty("password"));
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		}
	}


