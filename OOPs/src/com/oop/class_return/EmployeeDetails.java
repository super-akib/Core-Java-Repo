package com.oop.class_return;

import java.util.Scanner;

public class EmployeeDetails
{

	public static void main(String[] args)
	{   
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number of Employee Data you want:");
		int empNumber = scan.nextInt();
		for(int i=1;i<=empNumber;i++)
		{	
		  Employee employee = Employee.getEmployeeObject();
		  System.out.println(employee);
		}
		
		scan.close();
	}

}
