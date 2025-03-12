package com.nit.array_example;

import java.util.Scanner;

public class ArrayMultiplePositionDisplay
{
	 public static void main(String args[])
		{
	    	Scanner scanObj = new Scanner(System.in);
	        System.out.print("Enter array size:");
	        int arraySize = scanObj.nextInt();
		    int arr[] = new int[arraySize];
		    System.out.println("Enter array elements:");
		    for(int i = 0 ; i< arr.length; i++)
		    {
		    	System.out.print("element["+i+"] :");
		    	arr[i] = scanObj.nextInt();
		    }
		    System.out.println("\n--------------Array-Elements------------\n");
		    for(int i =0; i<arr.length; i++)
		    {
		    	if(i == arr.length-1)
	  		    {
	  			  System.out.print(arr[i]);
	  		    }
	  		    else
	  		    { 
	  			  System.out.print(arr[i]+" | ");
	  		    }
		    }
		    System.out.println("\n\n-------------Find-Element----------------\n");
		    System.out.print("Enter element to serched:");
		    int element = scanObj.nextInt();
		    boolean flag = false;
		    
		    for(int i=0;i<arr.length;i++)
			{
				if(element==arr[i])
				{
					flag=true;
					System.out.println(element+"present at "+(i+1)+" position.");
				}
			}
            if(flag == true)
            {
            	System.out.println("Element present in array..");
            }
            else
            {
            	System.out.println("Element is not present in array..");
            }
		    scanObj.close();
		}    
}
