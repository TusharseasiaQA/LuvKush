package com.mytests;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.xml.datatype.Duration;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	
	@Parameters({"browser", "platform", "version"})
	@BeforeMethod
	public void setup(String browserName, String platformName, String versionName) throws MalformedURLException {
		System.out.println("browser name is:" +browserName);
		//String methodName = name.getName();
		
		//creating object for MutableCapabilities
		//MutableCapabilities sauceOpts = new MutableCapabilities();
			//sauceOpts.setCapability("name", methodName);
		//sauceOpts.setCapability("build", "Java-W3C-Examples");
//		sauceOpts.setCapability("seleniumVersion", "4.0.0");s
//		sauceOpts.setCapability("username", "oauth-sharma1998lavkush-41b2b");
//		sauceOpts.setCapability("accessKey", "de5bf9d1-dc15-4c2d-b787-d348c7d6543d");
	//	sauceOpts.setCapability("tags", "w3c-chrome-tests");
		
		//creating object for DesiredCapabilities
		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability("sauce:options", sauceOpts);
		cap.setCapability("Version", versionName);
		cap.setCapability("platformName", platformName);
		cap.setCapability("browserName", browserName);
//		if (browserName.equals("chrome")) {
////			WebDriverManager.chromedriver().setup();
//			cap.setCapability("browserName", "chrome");
//		} 
//		else if (browserName.equals("firefox")) {
////			WebDriverManager.firefoxdriver().setup();
//			cap.setCapability("browserName", "firefox");
//		}
		
		//https://oauth-sharma1998lavkush-41b2b:de5bf9d1-dc15-4c2d-b787-d348c7d6543d@ondemand.eu-central-1.saucelabs.com:443/wd/hub
		System.out.println(cap);
		driver = new RemoteWebDriver(new URL("https://oauth-sharma1998lavkush-41b2b:de5bf9d1-dc15-4c2d-b787-d348c7d6543d@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), cap);
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
		}
	
}
