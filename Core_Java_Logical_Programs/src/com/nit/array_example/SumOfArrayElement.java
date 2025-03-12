/*
  WAP to store any 10 numbers into array and display their sum
 */

package com.nit.array_example;

public class SumOfArrayElement 
{
     public static void main(String[] args) {
		int arr[] = {10,1,4,5,0,1,4,1,2,5};
		int legnth =arr.length;
		int sum =0;
		for(int index=0;index<legnth; index++)
		{
			sum += arr[index];
			if(index == legnth-1)
				System.out.print(arr[index]);
			else
				System.out.print(arr[index]+" | ");
		}
		System.out.println("\nArray Element Sum is:"+sum);
	}
}
