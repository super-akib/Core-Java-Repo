package lab_Day7;
import java.util.Scanner;
public class FibonacciSeries {
 public static String fibonacsiSeries(int num)
 {   int n1=0,n2=1,n3=1;
	 String str ="";
	//while(count<num)
	 for(int i=1;i<=num;i++)
	{   
		n1 = n2;
		n2 = n3;
		n3 = n1+n2;
		//count+=1;
		str += n3+" ";
	}
	 return str;
 }
 public static void main(String args[])
 {
	int n ;
	Scanner fb = new Scanner(System.in);
	System.out.print("Enter a number:");
	n = fb.nextInt();
	System.out.println(fibonacsiSeries(n));
	fb.close();
 }
}
