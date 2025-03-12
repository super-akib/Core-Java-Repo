package nit.logic.array_programs;

import java.util.Scanner;

/* WAP to input a number and display its reverse*/
public class InputNumberReverse 
{  
	public static int revNumber(int num)
	{
		int rev = 0;
		do
		{
            int rem = num%10;
			rev = (rev*10)+rem;
			num /= 10;
		}
		while(num!=0);
		
		return rev;
	}
    public static void main(String[] args)
    {
		 Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter input to reverse:");
		 int inputNumber = sc.nextInt();
		 int reverse = revNumber(inputNumber);
		 int difference = reverse - inputNumber;
		 
		 System.out.println(inputNumber+" : it reverse is :"+reverse);
		 System.out.println(difference);
		 
		 
		 sc.close();
		 
	}
}
