package HRM.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Orange_HRM.Login_page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Verfy_HRM_Login {
	
	
	@Test
	public void verifyValidLogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Login_page login=new Login_page(driver); //This class will store all the locators and method of login page
		//passing parameter
		login.loginToHRM("Admin", "admin123");
		
		driver.quit();
	}
}
