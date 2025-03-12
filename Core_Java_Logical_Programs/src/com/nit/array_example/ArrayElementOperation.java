package com.nit.array_example;

import java.util.Scanner;

/*
 WAP to store 10 numbers , enter a number  to be searched  in the array . if the number is available
 in the array the display
 "Element is present"  otherwise "Element is not present"*/
public class ArrayElementOperation {
  
	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 Integers:");
		for(int i=0;i<arr.length; i++)
		{
			System.out.print("Element["+i+"] :");
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter key to be searched:");
		int key = sc.nextInt();
		boolean present = false;
		
		for(int i=0;i<arr.length; i++)
		{
			if(key == arr[i])
			{
				present = true;
				break;
			}
		}
		if(present == true)
		{
			System.out.println("Element is present.");
		}
		else
		{
			System.out.println("Element is not present.");
		}
		sc.close();
	}
}
