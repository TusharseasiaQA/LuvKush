package java_Control_Statements;
import java.util.Scanner;
public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		if((num%2)==0) {
		System.out.println("Entered number is even");
		}
		else {
			System.out.println("Entered number is odd");
		}
	}

}
