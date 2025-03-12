package com.akib.day1_task;

import java.util.*;

class Array {
	public static void main(String args[]) {
		int array[] = new int[5];
		for (int i = 5; i > 0; i--)
		{
			array[5 - i] = i;
		}
		System.out.println(Arrays.toString(array));
		Arrays.fill(array, 1, 5, 4);
		System.out.println("array printing");
		for (int i = 0; i < 5; i++)
			System.out.print(array[i]);
	}
}