package com.nit.logic14_02_2024;

import java.util.Scanner;

public class StoreFriendNameInArray 
{

	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		String name[] = new String[5];
		System.out.println("Enter "+name.length+" integers in array");
		
		for(int i=0;i<name.length;i++)
		{
			name[i]= sc.nextLine();	
		}
		
		for(int i=0;i<name.length;i++)
		{
			System.out.print(name[i]+" ");	
		}
		sc.close();
	}

}
