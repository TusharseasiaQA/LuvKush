
/**
 * 
 */
package Orange_HRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
/**
 * @Lavkush
 *
 *This class will store all the locators and method of login page
 */
public class Login_page {
	WebDriver driver;
	By username=By.id("txtUsername"); //By is a separate class and we have a static method called id and it will return by class only so stored in a By class only
	By password=By.xpath(".//*[@id='txtPassword']");
	By loginButton=By.name("Submit");
	
	//Now creating constructor and parameterize the constructor
	public Login_page(WebDriver driver){
		this.driver=driver; //here we initialize the webdriver
	}
	
	//creating a method loginToHRM() this method will accept two argument called username and password
	public void loginToHRM(String userid, String paas) { 
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(paas);
		driver.findElement(loginButton).click();
	}
	
	public void typeUserName(String uid) {
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typePassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void typeLogin() {
		driver.findElement(loginButton).click();
	}
}


