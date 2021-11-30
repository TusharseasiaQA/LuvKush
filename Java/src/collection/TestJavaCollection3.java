package collection;
// Vector
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class TestJavaCollection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> car=new Vector<String>();
		
		car.add("BMW");  
		car.add("Maruti");  
		car.add("Hyundai");  
		car.add("Toyata"); 
		
		Iterator<String> itr=car.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  

	}

 }
}
