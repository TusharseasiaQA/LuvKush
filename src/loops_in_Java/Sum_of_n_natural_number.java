package loops_in_Java;

public class Sum_of_n_natural_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;          //Here, the value of sum is 0 initially.
		int n=1000;
		for(int i=1; i<=n; i++) {		/*then, the for loop is iterated from i = 1 to 1000. In each iteration,
											 i is added to sum and its
											  value is increased by 1.*/
			sum +=i;  // sum=sum+i
		}
		System.out.println("Sum = " + sum);
	}

}
