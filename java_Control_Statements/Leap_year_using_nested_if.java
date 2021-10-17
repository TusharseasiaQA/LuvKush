package java_Control_Statements;
import java.util.Scanner;
public class Leap_year_using_nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;    // holds year
		
		//Create a scanner object for keyboard input
		Scanner sc=new Scanner(System.in);
		
		// Get the year
		System.out.println("Enter a year");
		year=sc.nextInt();
		
		//Determine whether a leap year is leap year.
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("A leap year");
				}
				else {
					System.out.println("Not a leap year");
				}
			}else {
				System.out.println("A leap year");
			}
		}
		else {
			System.out.println("Not a leap year");
		}
	}

}
