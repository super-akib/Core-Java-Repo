package com.nit.string20_2_24;

import java.util.Scanner;

/*   WAP to replace a character by another  character to replace a String by another 
     String at all its occurrence in the given format
     Input:computar world
     Output: computer world
 */
public class Question10 
{
	public static String replaceCharacter(String s1,char oldCharacter,char newCharacter)
	{
		String result="";
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			if(ch==oldCharacter)
			{
				result += newCharacter;
			}
			else
			{
				result+=ch;
			}
		}
	   return result;	
	}
   public static void main(String[] args)
   {   
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter string:");
	   String s1= sc.nextLine();
	   System.out.print("Original:"+s1);
	   
	   System.out.print("\nEnter which character to be change:");
	   char oldCharacter = sc.nextLine().charAt(0);
	   System.out.print("\nEnter to what you want to change:");
	   char newCharacter = sc.nextLine().charAt(0);
	   
	   System.out.println(Question10.replaceCharacter(s1, oldCharacter, newCharacter));
	   sc.close();
   }
}
