package com.akib.collections_examples;

import java.util.HashMap;

public class RemoveDublicatesFromArray
{
     
	public static void main(String []args)
	{
		 int arr[] = {1,1,2,5,5,4,3,6};
		 
		 HashMap<Integer,Integer>  hashMap = new HashMap<>();
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 hashMap.put( arr[i],i);
		 }
		 for(int i=1;i<hashMap.size();i++)
		 {
			  System.out.print(hashMap.get(i)+" | ");
		 }
		 
		 
	}
}
