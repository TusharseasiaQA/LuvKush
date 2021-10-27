package locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		
		
		//relative xpath
//		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
//		
		/*Absolute Xpath
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input")).sendKeys("admin123");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")).click();*/
		
		/* or & and
		
		driver.findElement(By.xpath("//input[@name='txtUsername' or @id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword' or @id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit' or @name='Submit']")).click();*/
		
		
		/*Contains with attribute
		
		driver.findElement(By.xpath("//input[contains(@id,'txtUsername')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@id,'txtPassword')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[contains(@name,'Submit')]")).click();*/
		
		/*Start_with
		
		driver.findElement(By.xpath("//input[starts-with(@id,'txtUsername')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[starts-with(@id,'txtPassword')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[starts-with(@name,'Submit')]")).click();*/
		
		/*contains with text method
		driver.findElement(By.xpath("//a[contains(text(),'Haben Sie ihr Passwort vergessen?')]")).click();*/
		
		driver.findElement(By.xpath("//a[text()='Haben Sie ihr Passwort vergessen?']")).click();
		
		driver.close();
		
		
		
	}

}
