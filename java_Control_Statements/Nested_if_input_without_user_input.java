package java_Control_Statements;

public class Nested_if_input_without_user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		System.out.println("Enter a number");
		if(x==0) {
			System.out.println("x is zero");
		}
		else {
			if(x>0) {
				System.out.println("x is positive");
			}
			else {
				System.out.println("x is -ve");
			}
		}

	}

}
