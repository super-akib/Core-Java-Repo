package com.nit.logic14_02_2024;

import java.util.Scanner;

public class DisplayEachElementOccrrence
{
   public static void main(String[] args) 
   {
	  int arr[] = new int [10];
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter "+arr.length+" elements in array:");
	  //assigning elements to array
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.print("element:["+i+"]:");
		  arr[i] =sc.nextInt();
	  }
	  //Find each elements Occurrence 
	  for(int i=0; i<arr.length;i++)
	  {   
		  int count= 0;
		  for(int j=i+1;j<arr.length;j++)
		  {
			  if(arr[i]==arr[j]&& i>j)
			  {
				  
			  }
		  }
	  }
	  
   }
}
