package com.akib.cab_booking_system;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo 
{
	public static void main(String[] args) 
	{
		
         long startTime = System.currentTimeMillis();
		
		Vector<Integer> v = new Vector<>();
		
		for(int i=0 ; i<=10000000; i++)
		{
			v.add(i);
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken by Vector :"+(endTime-startTime)+ "ms");
		
		
		
		 startTime = System.currentTimeMillis();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0 ; i<=10000000; i++)
		{
			al.add(i);
		}
		
		 endTime = System.currentTimeMillis();
		System.out.println("Total time taken by ArrayList :"+(endTime-startTime)+ "ms");
		
        
	}
}