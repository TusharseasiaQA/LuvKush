package classes;

public class Car {
	String color;       // instance variable
	int price;
	int speed;
	
	static int tyre=4;			// static variable 
	
	Car()
	{
		System.out.println("This is my default constructor");
		System.out.println(color+ "" +price);
	}
	
	Car(String c, int p)
	{
		color=c;
		price=p;
		System.out.println("This is my parameterized constructor");
		System.out.println(color+ "" +price);
	}
	
	public void display(int m) {
		int model=m;				//Local instance
		System.out.println("model is" +model);
	}
	
	public static void main(String[] args) {
		
	}

}
