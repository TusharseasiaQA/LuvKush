package HRM.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_Page_New {
	
	WebDriver driver;
	
	/*Now creating constructor, we know that constructor having the same name as class name
	This driver will come from page factory, What ever driver will come from page factory will initialize the local driver*/
	public Login_Page_New(WebDriver driver){
		this.driver=driver;
	}
	
	
	@FindBy(id="txtUsername") 
	//It will not check this webelment (username) each and every time on a webpage
	//It will simply check in cache memory and it will start processing
	@CacheLookup 
	WebElement username;
	
	
	
	//Standard approach use how class with FindBy annotation 
	//Using is an string variable, how is a class and id is a separate static variable and specify the exact value you want to use
	@FindBy(how=How.ID, using="txtPassword")
	//It will not check this webelment (password) each and every time on a webpage
	//It will simply check in cache memory and it will start processing
	//The performance will also high for long run
	@CacheLookup 
	WebElement password; 
	
	
	
	@FindBy(how=How.XPATH,using=".//*[@id='btnLogin']")
	//It will not check this webelment (submit_button) each and every time on a webpage
	//It will simply check in cache memory and it will start processing
	//The performance will also high for long run for long run
	@CacheLookup 
	WebElement submit_button;
	
	
	
	@FindBy(how=How.LINK_TEXT,using="Forgot your password?")
	//It will not check this webelment (Forget_password_link) each and every time on a webpage
	//It will simply check in cache memory and it will start processing
	//The performance will also high for long run
	@CacheLookup 
	WebElement Forget_password_link;
	
	
	
	public void login_HRM(String uid,String pass) {
		username.sendKeys(uid);
		password.sendKeys(pass);
		submit_button.click();
	}
	
	
}
