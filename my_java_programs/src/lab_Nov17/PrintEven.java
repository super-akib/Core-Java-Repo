package lab_Nov17;
import java.util.Scanner;
public class PrintEven {
 public static void isEven(int st, int end)
 {   
	 System.out.println("The Even Number "+st+":to:"+end);
	 for(int i=st;i<=end;i++)
	 {
		 if(i%2==0)
		 {
			 System.out.print(i+" ");
			 if(i%5==0)
				 System.out.println();
		 }
	 }
 }
 public static void main(String []args)
 {
	 Scanner sc = new Scanner(System.in);
	 int start ,end;
	 System.out.print("Enter Starting number:");
	 start = sc.nextInt();
	 System.out.print("Enter Ending point:");
	 end = sc.nextInt();
	 isEven(start,end);
	 sc.close();
 }
}
