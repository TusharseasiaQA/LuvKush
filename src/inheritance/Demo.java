package inheritance;
//Multiple Inheritance (not supported)

class Wishes  
{  
void message()  
{  
System.out.println("Best of Luck!!");  
}  
}  

class Birthday  
{  
void message()  
{  
System.out.println("Happy Birthday!!");  
}  
}  

public class Demo extends Wishes, Birthday{    //considering a scenario  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo obj=new Demo();    
		//can't decide which classes' message() method will be invoked  
		obj.message();   

	}

}
