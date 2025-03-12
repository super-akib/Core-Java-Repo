package com.nit.amar;

import java.util.Scanner;

public class ArrayPrograms {
	public static void findNthLargest(int[] a, int rank) {
		int max = a[0], min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i])
				max = a[i]; // 11
			if (min > a[i])
				min = a[i]; // -3
		}

		int count = 0;// {4,2,11,9,3,11,11,1,-3} // 
		for (int i = max; i >= min; i--) { // 11  10 9....... -3
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					count++;
					break;
				}
			}
			if (rank == count) {
				System.out.println("Nth largest is : " + i);
				break;
			}
		}
	}

	public static void shiftZerosTotheEnd(int[] a) {
		int zeroIndex = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				int t = a[i];
				a[i] = a[zeroIndex];
				a[zeroIndex] = t;
				zeroIndex++;
			}

		}
	}

	public static void rotateArray(int[] a, int n) {// {4,5,1,2,3}
		for (int i = 0; i < n; i++) {
			int temp = a[a.length - 1]; // 4
			for (int j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[0] = temp;
		}
	}

	public static int findElementLocation(int[] a, int key) {
		int start = 0, end = a.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (a[mid] == key)
				return mid;
			if (a[mid] < key) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return -1;

	}

	public static void printArray(int[] a) {
		for (int ele : a) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {4,2,11,9,3,1,-3};

		// System.out.println(findElementLocation(arr,5));
		printArray(arr);
		findNthLargest(arr,1);
		//printArray(arr);
	}
}
