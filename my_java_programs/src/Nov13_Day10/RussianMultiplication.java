package Nov13_Day10;
import java.util.Scanner;
public class RussianMultiplication {
   public static int multiplication(int num1,int num2)
   {
	  int n1=num1,n2= num2,sum=0;
	  while(n1!=0)
	  {
		  if(n1%2!=0)
			  sum +=n2;
			  n1 /= 2;
			  n2 *= 2;		  
	  }
	  return sum;
   }
   public static void main(String []args)
   {
	   Scanner sc = new Scanner(System.in);
	   int n1 ,n2,result;
	   System.out.print("Enter first number:");
	   n1 = sc.nextInt();
	   System.out.print("Enter second number:");
	   n2 = sc.nextInt();
	   result = multiplication(n1,n2); 
	   System.out.println("The Russian Multiplication of two number is:"+result);
	   sc.close();
   }
}
