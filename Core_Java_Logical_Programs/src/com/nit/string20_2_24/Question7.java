package com.nit.string20_2_24;

import java.util.Scanner;
/*
 WAP to get the set of characters simultaneously from starting index upto last index  of string excluding
 the character present in last index.
 */
public class Question7 
{ 
	public static void main(String[] args)
    {
		String str  = "naresh i Technologies";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Starting index value from where you want to extract:");
		int index = sc.nextInt();
		System.out.print("Enter Last index value from where you want to extract:");
		int lastIndex = sc.nextInt();
		
		String result = str.substring(index,lastIndex);
		System.out.println(result);
		
		sc.close();
    }
}
