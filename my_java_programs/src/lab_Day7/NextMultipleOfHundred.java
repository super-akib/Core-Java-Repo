package lab_Day7;

//import required classes or packages
import java.util.Scanner;
public class NextMultipleOfHundred {
 public static int multipleOfHndered(int num)
 {
     if(num<0)
     {
         return -1;
     }else
     {
         return ((num/100)+1)*100;
     }
 }
	public static void main(String[] args) {
	    int n,result;
		//create scanner object and ask user to input the number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		n = sc.nextInt();
	    result = multipleOfHndered(n);
		if(result==-1)
		{
		    System.out.println("The number is negative please enter positive number.");
		}else
		{
		    System.out.println("Next Multiple of given Number is:"+result);
		}
		sc.close();
	}
}

