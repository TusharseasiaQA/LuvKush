package polymorphism;
//Runtime Polymorphism

class Animal{  
	  void eat()
	  {
		  System.out.println("Animals Eat");
	  }  
	}  
	class herbivores extends Animal{  
	  void eat()
	  {
		  System.out.println("Herbivores Eat Plants");
	  } 
	  }
	
	class omnivores extends Animal{  
	  void eat()
	  {
		  System.out.println("Omnivores Eat Plants and meat");
	  } 
	  }
	
	class carnivores extends Animal{  
	  void eat()
	  {
		  System.out.println("Carnivores Eat meat");
	  } 
	  }
	
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Animal A = new Animal();
		    Animal h = new herbivores(); //upcasting  
		    Animal o = new omnivores(); //upcasting  
		    Animal c = new carnivores(); //upcasting  
		    A.eat();
		    h.eat();
		    o.eat();  
		    c.eat();

	}

}
