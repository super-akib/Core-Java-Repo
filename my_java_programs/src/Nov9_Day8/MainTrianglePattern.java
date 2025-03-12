package Nov9_Day8;

import java.util.Scanner;

public class MainTrianglePattern {

	public static void main(String[] args) {
		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		n = sc.nextInt();
		MainTrianglePatternLogic.patternCreater(n);
		sc.close();
		
	}

}
