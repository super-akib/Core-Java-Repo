package com.nit.string20_2_24;

import java.util.Scanner;

/*
 * Q2.WAP to for the below requirements
      i.enter two integers in form of string .
      ii.calculate and display the sum of the numbers.*/
public class StringNumberSum
{
    
    public static void main(String[] args)
    {
    	Scanner  sc = new Scanner(System.in);
    	System.out.print("Enter First number:");
    	String num1 = sc.next();
    	System.out.print("Enter second number:");
    	String num2 = sc.next();
    	
        //Auto un-boxing
    	int i1 = Integer.parseInt(num1);
    	int i2 = Integer.parseInt(num2);
    	System.out.println(i1+i2);
    	sc.close();
	}
}
