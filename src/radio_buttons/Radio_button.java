package radio_buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		
		driver.manage().window().maximize();
		
		
		//After locator
		//we store in WebElement variable
		//because its return type is WebElement
		WebElement radio2=driver.findElement(By.id("redeemFlights"));
		WebElement radio1=driver.findElement(By.id("bookFlights"));
		  
		
		radio2.click();   //we have called click method
		System.out.println( radio1.isSelected());    // this selected will return true or false based on selection
		System.out.println( radio2.isSelected());    // this selected will return true or false based on selection
		
		//How many radio button is displayed on a page
		System.out.println(driver.findElements(By.xpath("//*[@type='radio']")).size());  //we call the method size() to find the total number of radio button 
		
		
		//How many radio button is displayed on a page of particular section
		System.out.println(driver.findElements(By.xpath("//*[@name='book-flight-radio']")).size());  //we call the method size() to find the total number of radio button 
	

	}

}
