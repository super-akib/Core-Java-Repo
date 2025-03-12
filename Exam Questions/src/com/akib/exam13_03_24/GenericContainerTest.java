package com.akib.exam13_03_24;

import java.util.HashSet;

public class GenericContainerTest
{
   
	public static void main(String[] args) {
		
		HashSet<String>  h1 = new HashSet<>();
		HashSet<String>  h2 = new HashSet<>();
		HashSet<Integer>  h3 = new HashSet<>();
		
		h1.add("Akib");
		h1.add("hello");
		h3.add(12);
		
		GenericContainer  gneric  = new GenericContainer(h1, h3);
		
	    if(	gneric.isEqualTo())
	    {
	    	System.out.println("Both are equale");	
	    }
	    else
	    {
	    	System.err.println("Both are not equale..");
	    }
	}
	
}
