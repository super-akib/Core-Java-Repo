package nov11_LabDay12;
import java.util.Scanner;
public class VoterElig {
 public static void main(String []args)
 {
	 String str;
	 int age;
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter your name:");
	 str = sc.nextLine();
	 System.out.print("Enter your  age:");
	 age = sc.nextInt();
	 int vote = (age>=18)?1:0;
	 switch(vote)
	 {
	   case 1:
		   System.out.println(str+" age is "+age);
		   System.out.println("You are Eligible for Vote.");
		   break;
	   default :
		   System.out.println(str+" age is "+age);
		   System.out.println("You are not Eligible for Vote.");
		   break;
	 }
	 sc.close();
 }
}
