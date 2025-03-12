package com.nit.amar;

import java.util.Arrays;

/*
 Q1 .Write a java program to insert element in its proper 
     position in a given sorted array.
    Example.
    input :{5,6,14,17,44}
	Element to be inserted:15
	output: 5,6,14,15,17,44
	*/


public class ArrayProgram1
{
	
	public static void insertElement(int arr[],int key)
	{
	    int index =0;
	    int res[] = new int [arr.length+1];
	    int i=0;
	    for(i=0;i<arr.length;i++)
	    { 
	       if(key<arr[i])
	       {
	    	   index =i;
	    	   break;
	       }
	    }
	    if(i==arr.length) index= arr.length;
	    int pos =0;
	    for(int j=0;i<res.length;j++)
	    {
	    	if (j!=index) res[j]= arr[pos++];
	    }
	     res[index] = key;
	    System.out.println(Arrays.toString(res));
		 
	}
	
	
	public static void productArray(int[] a)
	{
		int res[] = new int [a.length];
		for(int i = 0;i<a.length;i++)
		{
			int pro =1;
			for(int j=0;j<a.length;j++)
			{
				if(i!=j) pro*=a[j];
			}
			res[i] = pro;
		}
		System.out.println(Arrays.toString(res));	
	}
	
	
	public static void runningSum(int a[])
	{
		int sum=0;
		int res []= new int [a.length];
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			res[i]=sum;
		}
		System.out.println(Arrays.toString(res));
	}
	
	
	//Odd sub-array sum
	
	public static void sumOfOddSubarray(int[] a)
	{
		int sum =0;
		for(int i=0;i<a.length;i++)
		{  
			int count =0;
			for(int j=i;j<a.length;j++)
			{  
				count++;
				if(count%2 !=0)
				{
					for(int k=i;k<=j;k++)
					{
						sum+=a[k];
					}		
				}
				
			}
		}
		System.out.println("Addition of odd sub-array:"+sum);
	}
	
	
	public static void main(String[] args)
	{
         int  arr[]= {5,6,14,17,44};
         
         
        
         //insertElement(arr, 15);
         //productArray(arr);
         
         //runningSum(arr);
         sumOfOddSubarray(arr);
	}
}
