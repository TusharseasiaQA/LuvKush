package locators;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CSSpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.cssSelector("input[id ='txtUsername']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name ='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input[value = 'LOGIN']")).click();
		
		driver.findElement(By.cssSelector("a[id ='menu_pim_viewMyDetails']")).click();
		
		driver.findElement(By.cssSelector("input[value = 'Edit']")).click();
		
		driver.findElement(By.cssSelector("input[value ='Paul']")).clear();
		driver.findElement(By.cssSelector("input[value ='Collings']")).clear();
		
		driver.findElement(By.cssSelector("input[name ='personal[txtEmpFirstName]']")).sendKeys("Lavkush");
		driver.findElement(By.cssSelector("input[name ='personal[txtEmpLastName]']")).sendKeys("Sharma");
		
		driver.findElement(By.cssSelector("input[value = 'Save']")).click();*/
		
		/*driver.findElement(By.cssSelector("#txtUsername")).sendKeys("admin");
		driver.findElement(By.cssSelector("*[id ='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".button")).click();*/
		
		/*driver.findElement(By.cssSelector("a[id^= 'menu']")).click();
		driver.findElement(By.cssSelector("a[id^= 'menu_pim']")).click();
		driver.findElement(By.cssSelector("a[id^= 'menu_leave']")).click();*/
		
		/*driver.findElement(By.cssSelector("a[id$= 'viewAdminModule']")).click();
		driver.findElement(By.cssSelector("a[id$= 'viewPimModule']")).click();
		driver.findElement(By.cssSelector("a[id$= 'viewLeaveModule']")).click();*/
		
		/*driver.findElement(By.cssSelector("div input[id = 'txtUsername']")).sendKeys("admin");
		driver.findElement(By.cssSelector("div input[id = 'txtPassword']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("div input[id = 'btnLogin']")).click();*/
		
		/*driver.findElement(By.cssSelector("div>input[id = 'txtUsername']")).sendKeys("admin");
		driver.findElement(By.cssSelector("div>input[id = 'txtPassword']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("div>input[id = 'btnLogin']")).click();*/
		
		/*driver.findElement(By.cssSelector("input[id*='txtUser']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id*='txtPass']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input[id*='btnLog']")).click();*/


	}

}
