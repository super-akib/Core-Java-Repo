package com.akib.stream_api;

import java.util.Scanner;

public record EmployeeSalary(String employeeName,Integer age,Double employeeSalary) 
{
    
	public static EmployeeSalary enterEmployeeData()
	{
		Scanner scan = new Scanner(System.in);
		   System.out.print("Enter Employee Name:");
		   String edmployeeName = scan.nextLine();
		   System.out.print("Enter Age of employee:");
		   int age = scan.nextInt();
		   System.out.print("Enter salary:");
		   double salary = scan.nextDouble();
		   
		   return new EmployeeSalary(edmployeeName, age, salary);
	}
}
