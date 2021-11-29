package Demo1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class MyTest {
  @Test
  public void MyTest1() {
	  int a=90;
	  int b=100;	
	  Assert.assertEquals(a, b);
	  System.out.println("=====Test Done=====");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("=====Starting the Test=====");
  }

  @AfterMethod
  public void afterClass(ITestResult result) throws EmailException {
	  if(result.getStatus()==ITestResult.FAILURE) {
		  SendEmail.sendemail();
		  System.out.println("Test failed and email send");
	  }
	  
  }

}
