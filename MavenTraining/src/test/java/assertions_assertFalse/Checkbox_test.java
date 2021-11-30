package assertions_assertFalse;

// When the condition is false


import org.openqa.selenium.By;  

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;  
public class Checkbox_test {  
  
    public static void main(String[] args) {  
    // TODO Auto-generated method stub  
    	WebDriverManager.chromedriver().setup();  
        WebDriver driver = new ChromeDriver();  
        driver.navigate().to("https://www.spicejet.com/");  
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());  
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());  
          
    }  
  
}  
