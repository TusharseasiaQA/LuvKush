package collection;
//LinkedHashSet
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestJavaCollection5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> furniture=new LinkedHashSet<String>();  
		furniture.add("chair");  
		furniture.add("bed");  
		furniture.add("table");  
		furniture.add("sofa");  
		furniture.add("sofa");  
		
		Iterator<String> itr=furniture.iterator(); 
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  

	}

}
