package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DragDropDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Drivers\\geckodriver.exe" );
//		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		Actions act = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//section[@class='dhx_demo-container dhx_demo-container--tree']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='dhx_demo-container__row dhx_demo-container__row--tree']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='dhx_demo-container__col']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='dhx_demo-tree']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='treeSource']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//span[@class='dhx_tree-list-item__text']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='dhx_tree-list-item__icon fas fa-file']")));
		
		WebElement source=driver.findElement(By.xpath("//span[@class='dhx_tree-list-item__text']"));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='dhx_demo-tree']")));
		//driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='dhx_demo-tree-container dhx_widget--bordered']")));
		WebElement destination=driver.findElement(By.xpath("//div[@class='dhx_demo-tree-container dhx_widget--bordered']"));
		Thread.sleep(2000);
		act.dragAndDrop(source, destination).build().perform();
		
	}

}
