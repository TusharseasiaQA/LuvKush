package polymorphism;

class Shapes {
	  public void area() 
	  {
	    System.out.println("The formula for area of ");
	  }
	}

class Triangle extends Shapes {
	  public void area() 
	  {
	    System.out.println("Triangle is ½ * base * height ");
	  }
	}

class Circle extends Shapes {
	  public void area() {
	    System.out.println("Circle is 3.14 * radius * radius ");
	  }
	}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Shapes myShape = new Shapes();  // Create a Shapes object
		    Shapes myTriangle = new Triangle();  // Create a Triangle object
		    Shapes myCircle = new Circle();  // Create a Circle object
		    myShape.area();
		    myTriangle.area();
		    myShape.area();
		    myCircle.area();

	}

}
