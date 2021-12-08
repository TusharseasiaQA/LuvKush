package com.mytests;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserStackBaseTest {

WebDriver driver;

public static final String USERNAME = "lavkushsharma_T2eO0u";
public static final String AUTOMATE_KEY = "MdozuMwqdXxQwTgMmx3S";
public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	
	@Parameters({"browser", "browser_version", "os", "os_version"})
	@BeforeMethod
	public void setup(String browserName, String browser_version, String os, String os_version,  Method name) throws MalformedURLException {
		System.out.println("browser name is : " + browserName);
		String methodName = name.getName();
		 DesiredCapabilities caps = new DesiredCapabilities();

	        caps.setCapability("os", os);
	        caps.setCapability("os_version", os_version);
	        caps.setCapability("browser", "Chrome");
	        caps.setCapability("browser_version", browser_version);
	        caps.setCapability("name", methodName);
	        caps.setCapability("build", "Build #1");
	        caps.setCapability("project", "Sample sandbox project");
	        
	        if (browserName.equals("Chrome")) {
				WebDriverManager.chromedriver().setup();
				caps.setCapability("browser", "Chrome");
			} else if (browserName.equals("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				caps.setCapability("browser", "Firefox");
			}
			try {
				driver = new RemoteWebDriver(new URL(URL), caps);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}

		
		
		System.out.println(caps);
		driver = new RemoteWebDriver(new URL(URL), caps);
		
	}
}


