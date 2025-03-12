package com.oop.Constructer;

import java.util.Scanner;

public class EmployeeDetails
{
    public static void main(String []args)
    {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.print("Enter a Employee Id:");
    	int empId = scan.nextInt();
    	System.out.print("Enter a Employee name:");
    	String empName = scan.next();
    	System.out.print("Salary:");
    	double salary = scan.nextDouble();
    	System.out.print("Number of Project:");
    	int noOfProject = scan.nextInt();
    	
    	Employee e1 = new Employee(empId,empName,salary,noOfProject);
    	System.out.println(e1);
    	scan.close();
    	
    }
	
}
