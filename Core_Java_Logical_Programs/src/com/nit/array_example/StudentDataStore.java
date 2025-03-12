package com.nit.array_example;

import java.util.Scanner;

public class StudentDataStore 
{  
	 public static void  checkAvailability(String name[],String studentName)
	 {
		 boolean flag= false;
		  for(int i=0;i<name.length;i++)
		  { 
			   if(name[i].equalsIgnoreCase(studentName)==true)
			   {
				   flag = true;
				   break;
			   } 
		  }
		  if(flag==true)
		  {
			  System.out.println("Student "+studentName+" present in Database");
			  
		  }
		  else
		  {
			  System.err.println("Student "+studentName+"not present in Database");
		  }
	 }
     public static void main(String[] args)
     {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter how many student record Store:");
		  int size = sc.nextInt();
		  String arr[]= new String[size];
		  
		  System.out.println("Enter Student Name in Array:");
		  for(int i=0;i<arr.length;i++)
		  {
			  System.out.print("Enter name of Student:");
			  arr[i] = sc.next();
		  }
		  
		  System.out.println("Enter Student name to sarch:");
		  String studentName=sc.next();
		  checkAvailability(arr, studentName);
		  sc.close();
	 }
}
