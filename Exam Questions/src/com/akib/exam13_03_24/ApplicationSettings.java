package com.akib.exam13_03_24;

import java.util.HashMap;
import java.util.Scanner;

public class ApplicationSettings 
{
     
	public static void main(String[] args)
	{
	      Scanner sc = new Scanner(System.in);
	      HashMap<String,String>  hash = new HashMap<>();   
	      
	      while(true)
	      {
	    	  System.out.println("-----------------Enter given Options----------------");
	    	  System.out.println("1. Display Settings");
	    	  System.out.println("2. Update Setting");
	    	  System.out.println("3.Exit");
	    	  
	    	  System.out.print("Enter your choice:");
	    	  int choice = sc.nextInt();
	    	  
	    	  switch(choice)
	    	  {
	    	    case 1: 
	    	    	     hash.put("Setting1", "ABC");
	    	    	     System.out.println("Current property vlaue: "+hash.get(hash));
	    	     	     break;
	    	    case 2:  
	    	    	     System.out.println("Update property Key:");
	    	    	     String setting  = sc.next();
	    	    	     System.out.println("enter value:");
	    	    	     String value = sc.next();
	    	    	     hash.put(setting, value);
	    	    	     System.out.println(" Updated value is:"+hash.get(hash));
	    	    	     break;
	    	    case 3: 
	    	    	    sc.close();
	    	    	     System.exit(0);
	    	    	     break;
	    	     default :
	    	    	      System.err.println("invalid option try again....");
	    	  }
	    	 	    	  
	      }
	}
	
}
