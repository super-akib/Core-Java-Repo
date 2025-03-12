package nov20_lab;
import java.util.Scanner;
public class VerifyUserName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter User Name:");
		String str = sc.nextLine();
		switch(str)
		{
		 case "nareshit@naresh.com":System.out.println("Welecome reliance");break;
		 case "manjeera@naresh.com":System.out.println("Welecome reliance");break;
		 case "reliance@naresh.com":System.out.println("Welecome reliance");break;
		 case "ncare@naresh.com":System.out.println("Welecome reliance");break;
		 case "ramesh@naresh.com": System.out.println("Welecome reliance");break;
		 default : System.out.println("Invalid User Name..");
		}
       sc.close();
	}

}