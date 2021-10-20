package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
//		driver.findElement(By.cssSelector("a[title='Already a user? Sign in']")).click();
//		driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("sharma1998lavkush@gmail.com");
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345");
//		driver.findElement(By.cssSelector("input[value='Sign in']")).click();
		
		driver.findElement(By.cssSelector("a[title='Create Rediffmail Account']")).click();
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Lavkush Sharma");
		Thread.sleep(3000);
		
		
		driver.findElement(By.cssSelector("input[name^='login']")).sendKeys("lavkush123sharma");
//		driver.findElement(By.cssSelector("input[name='login81ae417b']")).sendKeys("lavkush@123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='Check availability']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='password")).sendKeys("Lavkush@123_sharma");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name^='confirm_passwd']")).sendKeys("Lavkush@123_sharma");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("*[name^=altemail]")).sendKeys("sharmalavkush404@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div>input[id='mobno']")).sendKeys("1234567891");
		Thread.sleep(3000);
		//driver.quit();

		

	}

}
