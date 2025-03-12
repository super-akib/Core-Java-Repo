package com.nit.array_example;
import java.util.Scanner;
/*
  if element is present then display  the  position of element .
  If element is present in multiple locations then also the position must be display
  Linear Search Algorithm: 
  */
public class ArrayElementOperationUpdate
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
	    int index = 0;
	    boolean flag = false;
	    
	    for(int i =0 ; i<arr.length ;i++)
	    {
	    	if(element == arr[i])
	    	{  
	    		flag= true;
	    		index += i;
	    		break;
	    	}
	    }
	    if(flag == true)
	    {
	      System.out.println("\nElement:["+element+"] is present in Index["+index+"]");
	    }
	    else
	    {
	    	System.out.println("\nElement:["+element+"] is not present in array");
	    }
	    scanObj.close();
    }
}
