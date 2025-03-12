package nov20_lab;
import java.util.Scanner;
public class NumberInWords {
	public static void main(String[] args) {
	  int num,rev=0,temp,x;
	     //create Scanner object and read the number
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a number:");
	  num = sc.nextInt();
	  String str="";
	  temp = num;
	  while(num%10==0)
	  {
			  str +=" ZERO";
			  num/=10;
	  }
		//Reverse the number
	  while(temp!=0)
	  {
	      rev = rev*10+temp%10;
	     temp /=10;
	  }
	  int n = rev;
		// get last digit from reversed number for each iteration.
		System.out.print("Output:- ");
		while(n!=0)
		{   
			 x = n%10;
		    switch(x)
		   {
		       case 0: System.out.print(" ZERO");break;
		       case 1: System.out.print(" ONE");break;
		       case 2: System.out.print(" TWO");break;
		       case 3: System.out.print(" THREE");break;
		       case 4: System.out.print(" FOUR");break;
		       case 5: System.out.print(" FIVE");break;
		       case 6: System.out.print(" SIX");break;
		       case 7: System.out.print(" SEVEN");break;
		       case 8: System.out.print(" EIGHT");break;
		       case 9: System.out.print(" NINE");break;
		       default : System.out.print(" Not a number.");break;
		   }
		   n /=10;
		}
		System.out.print(str);
		sc.close();
		//send that number to switch block;
		//write cases from 0 to 9 and print corresponding digit in word
		
	}

}
