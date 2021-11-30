package collection;
//TreeSet
import java.util.Iterator;
import java.util.TreeSet;

public class TestJavaCollection6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> student=new TreeSet<String>();  
		student.add("Ravi");  
		student.add("Vijay");  
		student.add("Ravi");  
		student.add("Ajay");  
		 
		Iterator<String> itr=student.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}

}
