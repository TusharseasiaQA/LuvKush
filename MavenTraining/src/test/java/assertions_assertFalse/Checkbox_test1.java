package assertions_assertFalse;

  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;  
public class Checkbox_test1 {  
  
public static void main(String[] args)   
{  
// TODO Auto-generated method stub  
	WebDriverManager.chromedriver().setup();  
WebDriver driver = new ChromeDriver();  
driver.navigate().to("https://www.spicejet.com/");  
Assert.assertFalse(true);  
System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());  
          
}}  
