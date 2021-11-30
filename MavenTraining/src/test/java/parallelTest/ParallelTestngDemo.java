package parallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestngDemo {
	
	WebDriver driver;
	
	@Test(threadPoolSize=3, invocationCount=3, timeOut=1000)
	public void Test1()  {
		System.out.println("I'm inside test 1 |"+Thread.currentThread().getId());
		
		
	}
	
	@Test() 
	public void Test2() throws Exception {
		System.out.println("I'm inside test 2 |"+Thread.currentThread().getId());
		
		
	}
	
	@Test
	public void Test3()  {
		System.out.println("I'm inside test 3 |"+Thread.currentThread().getId());
		
	}
	

}
