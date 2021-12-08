package HRM.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.Browser_Factory;

public class Verify_valid_login {
	
	@Test
	public void checkvalidUser() {
		
		//It will return webdriver reference 
		//Having browser factory starting with url and it will return the driver
		WebDriver driver=Browser_Factory.startBrowser("chromedriver", "https://opensource-demo.orangehrmlive.com/");
		
		
		//Created page object using page factory
		//.class will return the bite code of Login_Page_New.class
		//It will return the page object of particular page
		Login_Page_New login_page=PageFactory.initElements(driver, Login_Page_New.class);
		
		//Call the method
		login_page.login_HRM("Admin", "admin123");
	}
	
}
