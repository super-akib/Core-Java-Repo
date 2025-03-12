package nov15_Day12;
import java.util.Scanner;
public class MainGCDNumber {
 public static void main(String[] args) {
	 int num1,num2,num3,option;
	 Scanner op = new Scanner(System.in);
	 System.out.println("1.Two number GCD.");
	 System.out.println("2.Three number GCD.");
	 System.out.print("Selact one of the Option you want to:");
	 option = op.nextInt();
	 Scanner sc = new Scanner(System.in);

	 if(option== 1)
	 {   
		 System.out.print("Enter a 1st number:");
		 num1 = sc.nextInt();
		 System.out.print("Enter a 2nd number:");
		 num2 = sc.nextInt();
		 System.out.println("GCD of Two number is:"+FindGCDofNumbers.getGCDtwoNumber(num1, num2)); 
	 }
	 else if(option==2)
	 {   
		 System.out.print("Enter a 1st number:");
		 num1 = sc.nextInt();
		 System.out.print("Enter a 2nd number:");
		 num2 = sc.nextInt();
		 System.out.print("Enter a 3rd number:");
		 num3 = sc.nextInt();
		 System.out.println("GCD of Two number is:"+FindGCDofNumbers.getGCDThreeNumber(num1, num2,num3));
		 sc.close();
		 op.close();
	 }
	 else
		 System.out.println("PLEASE ENTER ONLY GIVEN OPTIONS...");
	}

}
