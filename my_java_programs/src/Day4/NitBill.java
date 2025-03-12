package Day4;

import java.util.Scanner;
public class NitBill {
	public static void main(String args[]) {
		
		// Create a Scanner object to read user input
		Scanner sc = new Scanner(System.in);
		float NTbill,dp=0,damt,amtpay;
		// Prompt the user to enter the amount of Net Bill
		System.out.print("Enter Net Bill: ");
		NTbill = sc.nextFloat();
		
		// Find discount percentage based on conditions
		if(NTbill<5000)
		{   
		   dp=5;
		   
		}else if(NTbill>=5000 && NTbill<10000)
		
		{
		    dp=10;
		}else if(NTbill>=10000)
		
		{
		    dp=15;
		}
		//Calculate Discount amount
		damt = NTbill*dp/100;
		//Calculate Amount Payable
		amtpay = NTbill-damt;
		//Display results
		System.out.println("Discount Percentage:"+dp);
		System.out.println("Discount Amount:"+damt);
		System.out.println("Amount Payable:"+amtpay);
		
		//close Scanner object
		sc.close();
	}
}

