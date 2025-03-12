package com.akib.system_utilization;

import java.util.Scanner;

public class User01 
{
    public static void main(String[] args) throws Exception 
    {
    	Scanner sc = new Scanner(System.in);
    	
    	//Dynamic Object creation for Classes A,B,C
    	
		C c = (C) Class.forName("com.akib.system_utilization.C").newInstance();	
	    I1 a =(A)	Class.forName("com.akib.system_utilization.A").newInstance();
   	    I1 b = (B) Class.forName("com.akib.system_utilization.B").newInstance();
	    
   	    System.out.print("Enter value of a:");
   	    int num1 = sc.nextInt();
   	    System.out.print("Enter value of b:");
   	    int num2 = sc.nextInt();
   	    
   	    c.display(num1, num2, a);  
   	    c.display(num1, num2, b);
   	    
   	    sc.close();
	   
	}
}
