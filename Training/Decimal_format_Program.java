package Training;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Decimal_format_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 1.34567;
		DecimalFormat df = new DecimalFormat("#.###"); /* We declare the format using the # patterns #.###. 
														This means we want num up to 3 decimal places.*/
		
		df.setRoundingMode(RoundingMode.CEILING); /* We also set the rounding mode to Ceiling,
													this causes the last given place to be rounded to 
													its next number.*/
		System.out.println(df.format(num));

	}

}
