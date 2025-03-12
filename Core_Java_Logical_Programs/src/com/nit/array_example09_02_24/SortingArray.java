package com.nit.array_example09_02_24;

public class SortingArray 
{
    public static void main(String[] args) {
		
    	int arr[]= {20,11,50,40,31};
    	for(int i=0;i<arr.length;i++)
    	{   
    		for(int j=i+1;j<arr.length;j++)
    		{		
    		 if(arr[i]>arr[j])//Ascending  (<)Descending
    		 {
    			int temp = arr[i];
    			arr[i] = arr[j];
    			arr[j] = temp;
    		 }
    	    }
    	}
    	
    	for(int i=0;i<arr.length;i++)
    	{
           System.out.print(arr[i]+" "); 		
       	}
	}
}
