package nit.array_21_02_24;

import java.util.Scanner;

//print each letter input new separate line 
public class Q19 
{
   public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter String:");
	 String str = sc.nextLine();
	 for(int i=0;i<str.length();i+=1)
	 {												
		 System.out.println(str.charAt(i));
	 }
	 sc.close();
   }
}

