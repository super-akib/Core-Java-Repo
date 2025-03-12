package method_overloading;

import java.util.Scanner;

public class MainOverload 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter integer vale:");
		int num = scan.nextInt();
		System.out.print("Enter a Character:");
		char ch = scan.next().charAt(0);
        
		Overloading ovr1 = new Overloading();
		System.out.println("---------------------(Method-Overloading)----------------------");
		ovr1.method1(num, ch);
		ovr1.method1(ch, num);
		scan.close();
	}

}
