package collection;
// ArrayList
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestJavaCollection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		list.add("geeta");  
		list.add("meena");  
		list.add("seema"); 
		list.add("kavita"); 
		list.remove("kavita"); 
		for(String arr:list)
		{
			System.out.println(arr);
		}
	/*	ArrayList<String> fruits=new ArrayList<String>();  
		fruits.add("Orange");
		fruits.add("Banana");  

		fruits.add("Mango");  
		fruits.add("Apple");  
		fruits.add("Pine-apple");  
		fruits.add("Cherry"); 
		//fruits.remove("Cherry");
		fruits.remove(3);
		
		System.out.println("list before update the value" + fruits);


		Collections.sort(fruits);
		System.out.println("list after update the value" + fruits);

		fruits.set(1, "blackberry");
		System.out.println("list after update the value");

		for(String arr:fruits)
		{
			System.out.println(arr);
		}
		
		System.out.println("size of arraylist is " + fruits.size());

		String str= fruits.get(2);
		System.out.println(str);*/


	
		
		//Traversing list through Iterator  
//		Iterator itr=list.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  

	}

}

