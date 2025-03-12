package com.oops.program_on_interface;
import java.util.Scanner;
public class MainAdvanceArithmetic
{

	public static void main(String[] args) 
	{   
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number :");
		int number = scan.nextInt();
		
		AdvanceArithmetic   advancearithmetic = new MyCalculator();
        
		int divisorSum = advancearithmetic.divisorSum(number);
        System.out.println(divisorSum);
        scan.close();
	}

}
