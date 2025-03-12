package com.nit.amar;

import java.util.Arrays;

public class ArrayMaxSumKeyTimes
{   
	//Maximum sum logic 
	public static void maxSum(int[] a ,int key)
	{
	     Arrays.sort(a);
	     
	     int max= a[0];
	     for(int i=0;i<a.length;i++)
	     {
	    	 if(a[i]>max)
	    	 {
	    		 max = a[i];
	    	 }
	     }
	     int sum=0;
	     for(int i=0;i<a.length;i++)
	     {  
	    	  sum=0;
	    	 if(max==a[i])
	    	 {
	    		 for(int j=0;j<key;j++)
	    		 {
	    			 sum +=a[i];
	    			 a[i] =a[i]+1;
	    		 }
	    	 }
	     }
	     System.out.println("Maximum Sum is:"+sum);
	}
	
	public static void main(String[] args) 
	{
        int arr[] = {5,5,5};
        int key=2;
        maxSum(arr, key);
        
	}
}
