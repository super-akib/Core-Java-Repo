package nit.array_21_02_24;

import java.util.Scanner;

/*
 WAP to accept a String  and display whether  it is palindrome or not
 */
public class Q28 
{    
	 public static void isPalindrome(String str)
	 {   
		 String rev ="";
		 		 
		 for(int i=str.length()-1;i>=0;i--)
		 {    
			 char ch = str.charAt(i);
			 rev += ch;
		 }
		 System.out.println("Orignal:"+str);
		 System.out.println("Reverse:"+rev);
		 if(str.equals(rev))
		 {
			 System.out.println(str+" : is Palindrome");
		 }
		 else
		 {
			 System.out.println(str+" :is not a Palindrome");
		 }
	 }
     public static void main(String args[])
     {
    	 Scanner scan = new Scanner(System.in);
    	 System.out.print("Enter a String :");
    	 String str = scan.next();
    	 isPalindrome(str);
    	 scan.close();
     }
}
