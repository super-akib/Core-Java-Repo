package com.akib.exam06_mar_24;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates 
{
	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(33,66,66,45,67,89,33,47,21,45));
	    
		if(ar.isEmpty()) 
		{
	    	System.out.println("list is empty");
	    }
		else 
		{
	    	for(int i=0;i<ar.size();i++) 
	    	{
	    		for(int j=i+1;j<ar.size();j++) 
	    		{
	    			if(ar.get(i)==ar.get(j)) 
	    			{
	    				System.out.println(ar.get(j));break;
	    			}
	    		}
	    	}
	    }
	}
}
