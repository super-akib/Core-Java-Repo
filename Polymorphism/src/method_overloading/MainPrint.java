package method_overloading;

import java.util.Scanner;

public class MainPrint 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("Enter integer:");
	    int num1 = sc.nextInt();
	    System.out.print("Enter Long integer:");
	    long num2 = sc.nextLong();
	    System.out.print("Enter Float :");
	    float  num3 = sc.nextFloat();
	    System.out.print("Enter Double:");
	    double num4 = sc.nextDouble();
	    System.out.print("Enter charecter:");
	    char ch = sc.next().charAt(0);
	    System.out.print("Enter String:");
	    String str = sc.nextLine();
	    str = sc.nextLine();
	    
	    
	    PrintNumber p1 = new PrintNumber();
	    
	    System.out.println("------------------Method-Overloading----------------------");
	    p1.diffrentDataType(num1);
	    p1.diffrentDataType(num2);
	    p1.diffrentDataType(num3);
	    p1.diffrentDataType(num4);
	    p1.diffrentDataType(ch);
	    p1.diffrentDataType(str);
	    
        sc.close();
	}

}
