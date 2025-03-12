package com.akib.collections_examples;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class StringRemoveDublicates
{    
	 public static void removeDublicates(String str)
	 {
		   LinkedHashSet<Character>  lenkedHashSet = new LinkedHashSet<>();
		   for(int i=0;i<str.length();i++)
		   {
			   lenkedHashSet.add(str.charAt(i));
		   }
		   System.out.println(lenkedHashSet);
	 }
     public static void main(String[] args) 
     {
	     Scanner sc = new Scanner(System.in); 
    	 System.out.print("Enter String:");
    	 String str =  sc.nextLine();
    	 
    	 removeDublicates(str);
    	 sc.close();
     }
}
