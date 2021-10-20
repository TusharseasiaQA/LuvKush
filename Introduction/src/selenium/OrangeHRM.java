package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		// Locating using relative xpath
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");

		// Locating using Absolute xpath
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input")).sendKeys("admin123");

		//Using start_with
		driver.findElement(By.xpath("//input[starts-with(@name,'Submit')]")).click();
		
		
		
		// Locating using relative xpath
		driver.findElement(By.xpath("//*[@id='menu_pim_viewMyDetails']")).click();
		driver.findElement(By.xpath("//input[@value='Edit']")).click();
		driver.findElement(By.xpath("//input[@name='personal[txtEmpFirstName]']")).clear();
		driver.findElement(By.xpath("//input[@name='personal[txtEmpFirstName]']")).sendKeys("Lavkush");
		driver.findElement(By.xpath("//input[@name='personal[txtEmpMiddleName]']")).clear();
		driver.findElement(By.xpath("//input[@name='personal[txtEmpLastName]']")).clear();
		driver.findElement(By.xpath("//input[@name='personal[txtEmpLastName]']")).sendKeys("Sharma");
		driver.findElement(By.xpath("//input[@name='personal[txtEmployeeId]']")).clear();
		//Using or 
		driver.findElement(By.xpath("//input[@name='personal[txtEmployeeId]' or @class='editable']")).sendKeys("001");
		
		//using contains with attribute
		driver.findElement(By.xpath("//input[contains(@id,'btnSave')]")).click();
		
		//driver.findElement(By.xpath("//*[@id='personal_txtEmpFirstName' or @value='Om']")).sendKeys("Lavkush");
		
		
		driver.close();

	}

}
