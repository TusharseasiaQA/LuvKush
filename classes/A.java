package classes;

public class A {
	
	A()
	{
		System.out.println("This is constructor of class A");
	}

	void Amethod()
	{
		System.out.println("This is method of class A");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj_A=new A();
		B obj_B=new B();
		obj_B.Bmethod();


	}

}
