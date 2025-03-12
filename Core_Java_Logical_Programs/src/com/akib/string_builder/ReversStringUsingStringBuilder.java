package com.akib.string_builder;

import java.util.Scanner;

public class ReversStringUsingStringBuilder
{    
	 public static String reversString(String str)
	 {
		
		 StringBuilder stringBuilder = new StringBuilder();
		 
		 for(int i=str.length()-1; i>=0;i--)
		 {
			 stringBuilder.append(str.charAt(i));
		 }
		 return stringBuilder.toString();
	 }
     public static void main(String args[])
     {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("Enter a String:");
    	 String str = sc.nextLine();
    	 System.out.println("Input:"+str);
		 System.out.println("Output:"+reversString(str));
    	 sc.close();
     }
}
