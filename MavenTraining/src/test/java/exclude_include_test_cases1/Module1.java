package exclude_include_test_cases1;
//TestNG @Test enable parameter
import org.testng.annotations.Test;

public class Module1 {
	
	  
	    @Test(enabled=false)     
	    public void test1()                                          // First test case  
	    {  
	        System.out.println("Hello javaTpoint!!");  
	    }  
	      
	    @Test  
	    public void test2()                                          // Second test case  
	    {  
	        System.out.println("JTP Travels");  
	    }

}
