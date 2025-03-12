package nov11_LabDay12;
import java.util.Scanner;
public class VerifyTriangeTypeUsingSwitch {
  public static void main(String []args)
  {
	  int s1,s2,s3;
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter side-1:");
	  s1 = sc.nextInt();
	  System.out.print("Enter side-2:");
	  s2 = sc.nextInt();
	  System.out.print("Enter side-3:");
	  s3 = sc.nextInt();
	  int res = (s1==s2 && s2==s3)?1:(s1==s2||s2==s3||s1==s3)?2:3;
	   switch(res)
	   {
	     case  1: System.out.println("Triangle is Equilateral traingle.");
	              break;
	     case  2: System.out.println("Triangle is Isosceles traingle.");
                  break; 
	     case  3: System.out.println("Triangle is Scalene traingle."); 
	              break;
	   }
	   sc.close();
  }
}
