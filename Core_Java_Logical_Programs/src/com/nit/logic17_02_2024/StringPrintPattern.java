package com.nit.logic17_02_2024;

import java.util.Scanner;

public class StringPrintPattern
{
   public static void main(String[] args)
   {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter text :");
	    String str = scan.nextLine();
	    
	    for(int i=0; i<str.length();i++)
	    {   
	    	int index =0;
	    	for(int j=0;j<=i;j++,index++)
	    	{   
	    		if(str.charAt(index)!=' ')
	    		System.out.print(str.charAt(index)+" ");
	    	}
	    	System.out.println();
	    }
	    scan.close();
   }
}
