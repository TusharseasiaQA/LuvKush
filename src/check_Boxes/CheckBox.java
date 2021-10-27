package check_Boxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		/* In line number 21,22,23 & 24 these line will basically scroll the page and bring the radio button in view
		and we can see the actions of check box*/
		WebElement radio=driver.findElement(By.id("doi0"));	//Now we have stored in a WebElement variable:
		Actions ac=new Actions(driver);	//Now we create the object of the Actions class:
		ac.moveToElement(radio);
		ac.perform();
		
		//To select the check box we will use click method:
		driver.findElement(By.name("interest_market_c")).click();
		
		Thread.sleep(2000);
		
		//To de-select the check box we will use same click method:
		driver.findElement(By.name("interest_market_c")).click();
		
		//Now to find total number of check boxes in a page
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
