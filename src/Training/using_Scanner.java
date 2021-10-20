package Training;
import java.util.Scanner;
public class using_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		
		System.out.println("Enter Second number");
		num2 = sc.nextInt();
		sc.close();
		sum = num1 + num2;
		System.out.println(sum);
			

	}

}
