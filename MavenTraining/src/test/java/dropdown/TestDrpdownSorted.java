package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDrpdownSorted {
	    @Test
	    public void testcase1() {
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\91877\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");

				Select tools = new Select(driver.findElement(By.id("tools1")));
				List actualList=new ArrayList();
				List<WebElement> myTools=tools.getOptions();
				for(WebElement ele:myTools) 
				{
					String data=ele.getText();
					actualList.add(data);
				}
				
				List temp=new ArrayList();
				temp.addAll(actualList); //taken actual list and added in temp directly
				
				Collections.sort(temp, Collections.reverseOrder()); //it will sort in accending order
				
				Assert.assertTrue(actualList.equals(temp));
				
	    }
	}


