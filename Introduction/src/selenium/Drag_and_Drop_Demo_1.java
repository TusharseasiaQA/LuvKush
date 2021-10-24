package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Drag_and_Drop_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
				WebDriver driver=new ChromeDriver();
		        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		        driver.manage().window().maximize();
		        Actions act= new Actions(driver);
		        WebElement src= driver.findElement(By.id("box1"));
		        WebElement dest= driver.findElement(By.id("box101"));
		        act.clickAndHold(src).moveToElement(dest).release(dest).build().perform();
		        driver.quit();

	}

}
