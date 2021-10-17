package java_Control_Statements;

import java.util.Scanner;

public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num==0){
			System.out.println("num is zero");
		}
		else {
			if(num>0) {
				System.out.println("num is postive");
			}
			else {
				System.out.println("num is negative");
			}
		}
		

	}

}
