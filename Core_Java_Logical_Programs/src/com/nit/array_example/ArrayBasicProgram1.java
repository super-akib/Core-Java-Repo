package com.nit.array_example;

public class ArrayBasicProgram1
{
     public static void main(String[] args) {
		
    	 int arr[] = {100,50,70,10,-90,122,4};
    	  int length = arr.length;
    	  
    	  for(int index = 0; index<length; index++)
    	  {   
    		  if(index == length-1)//second approach(index < length-1)
    		  {
    			  System.out.print(arr[index]+" . ");
    		  }
    		  else
    		  { 
    			  System.out.print(arr[index]+",");
    		  }
    	  }
	}
}
