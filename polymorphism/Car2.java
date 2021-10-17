package polymorphism;
//Method Overriding

class Vehicle{  
	  //defining a method  
	  void run()
	  {
		  System.out.println("Vehicle is moving");
	  }  
	}  
	//Creating a child class  
public class Car2 extends Vehicle{
	  //defining the same method as in the parent class  
	  void run()
	  {
		  System.out.println("car is running safely");
	  }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car2 obj = new Car2();//creating object  
		  obj.run();//calling method  

	}

}
