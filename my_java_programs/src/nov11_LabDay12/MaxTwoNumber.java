package nov11_LabDay12;
import java.util.Scanner;
public class MaxTwoNumber {
   public static void main(String args[])
   {
	   int num1,num2,option;
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter 1st Number:");
	   num1 = sc.nextInt();
	   System.out.print("Enter 2nd Number:");
	   num2 = sc.nextInt();
	   option = (num1==num2)?1:(num1>num2)?2:3;
	   switch(option)
	   {
	     case 1:  System.out.println("Both are Equal.");
	              break;
	     case 2 : 
	    	      System.out.println(+num1+" is Maximum.");
	    	      break;
	     default :
	    	      System.out.println(num2+" is Maximum.");
	    	      break;
	   } 
	   sc.close();
   }
}
