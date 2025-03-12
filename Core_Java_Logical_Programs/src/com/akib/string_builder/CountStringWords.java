package com.akib.string_builder;

import java.util.Scanner;
import java.util.StringTokenizer;
/* 
   WAP to count and display number of words in a String
   Input: java is good
   Output: No. of words is:3 
 */
public class CountStringWords 
{
     public static void main(String[] args) 
     {   
    	 Scanner scan = new Scanner(System.in);
    	 System.out.println("Enter string :");
    	 String str = scan.nextLine();
    	 //String str = "java is     good";
		StringTokenizer  token = new StringTokenizer(str);
		int count=0;
		while(token.hasMoreElements())
		{
			token.nextToken();
			count++;
		}
		System.out.println("No. of words is:"+count);
		scan.close();
	}
}
