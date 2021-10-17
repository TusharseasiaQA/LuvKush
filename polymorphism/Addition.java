package polymorphism;
// Compile- Time Polymorphism

public class Addition {
	void sum(int a, int b) 
	{
		int c = a+b; 
		System.out.println("Sum of two numbers:"+c);
	}
	
	void sum(int a, int b, int e) 
	{
		int c = a+b+e; 
		System.out.println("Sum of three numbers:"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{ 
			Addition obj = new Addition(); 
			obj.sum ( 30,90); 
			obj.sum(45, 80, 22); 
			} 

	}

}
