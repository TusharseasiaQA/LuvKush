package classes;

public class Student {
	int id;
	String name;
	
	Student()
	{
		System.out.println("This is my default constructor");
		System.out.println(id+""+name);
	}
	
	Student(int i, String n)
	{
		id=i;
		name=n;
		System.out.println("This is my parameterized constructor");
		System.out.println(id+""+name);
	}
	
	public void display(int i, String sn)
	{
		System.out.println(id+""+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu=new Student();
		Student stu1=new Student(1, "Shelish");
		stu.display(2, "Lavkush");	// method to be asked kal.
		stu.id=3 ;
		System.out.println(stu.id);

	}

}
