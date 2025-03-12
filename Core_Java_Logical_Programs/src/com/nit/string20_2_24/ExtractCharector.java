package com.nit.string20_2_24;
//Q6
import java.util.Scanner;

public class ExtractCharector 
{
    public static void main(String[] args)
    {
		String str  = "naresh i Technologies";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter index value from where you want to extract:");
		int index = sc.nextInt();
		
	   String result = str.substring(index);
	   System.out.println(result);
	   sc.close();
	}
}
