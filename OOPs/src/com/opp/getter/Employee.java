package com.opp.getter;

import java.util.Scanner;

public class Employee 
{
    private int employeeId;
    private String employeeName;
    private double salary;
    
    public  Employee(int employeeId,String employeeName,double salary)
    {
    	this.employeeId = employeeId;
    	this.employeeName = employeeName;
    	this.salary = salary;
    }
    
    public int getEmployeeID()
    {
    	return employeeId;
    }
    
    public String getEmployeeName()
    {
    	return employeeName;
    }
    
    public double getSalary()
    {
    	return salary;
    }
    
    public static Employee getEmployeeData()
    {
 	   Scanner sc = new Scanner(System.in);
 		  
 		  System.out.print("Enter Employee id:");
 		  int empId = sc.nextInt();
 		  System.out.print("Enter Employee name:");
 		  String empName = sc.nextLine();
 		          empName = sc.nextLine();
 		  System.out.print("Enter Employee Salary:");
 		  double empSalary = sc.nextDouble();
 	   Employee emp = new Employee(empId,empName,empSalary);
 	   return emp;
    }
    
}
