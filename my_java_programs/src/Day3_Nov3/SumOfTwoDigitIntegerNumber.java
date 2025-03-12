package Day3_Nov3;

public class SumOfTwoDigitIntegerNumber {

	public static void main(String[] args) {
		int n,sum;
		n = Integer.parseInt(args[0]);
		sum = (n/10)+(n%10);
		System.out.println("User provided two-digit Integer is:"+n);
		System.out.println("First digit is:"+(n/10));
		System.out.println("Last digit is:"+(n%10));
		System.out.println("Sum of digits:"+sum);
		

	}

}
