package collection;
//HashSet
import java.util.HashSet;

public class TestJavaCollection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  

		for(String s:set)
		{
			System.out.println(s);
		} 

	}

}
