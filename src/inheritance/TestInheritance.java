package inheritance;

class Animal{
	void eat()
	{
		System.out.println("eating...");
	}
}

class Dog extends Animal{
	void bark()
	{
		System.out.println("Barking...");
	}
}
public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.bark();
		d.eat();

	}

}
