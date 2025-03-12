package com.akib.exam13_03_24;

import java.util.HashSet;

public class GenericContainer 
{
    private HashSet<?>  hash1 = new HashSet<>(); 
    private HashSet<?>  hash2 = new HashSet<>();
    
    public GenericContainer(HashSet<?> hash1,HashSet<?> hash2)
    {
    	this.hash1 = hash1;
    	this.hash2 = hash2;
    }
	public  boolean isEqualTo()
	{    
         if(hash1.containsAll(hash2))
         {
             return true;
         }
         else
         {
        	 return false;
         }
	}
	
}
