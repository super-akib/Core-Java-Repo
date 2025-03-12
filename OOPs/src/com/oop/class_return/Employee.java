package com.oop.class_return;

import java.util.Scanner;

public class Employee
{
   private int employeeId;
   private String employeeName;
   private double employeeSalary;

   public Employee(int employeeId, String employeeName, double employeeSalary) 
   {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeSalary = employeeSalary;
   }
   
   public static Employee getEmployeeObject()
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter Employee ID:");
	   int empId = sc.nextInt();
	   System.out.print("Enter Employee Name:");
	   String empName = sc.nextLine();
	          empName = sc.nextLine();
	   System.out.print("Salary:");
	   double salary = sc.nextDouble();
	   
	   Employee emp = new Employee(empId,empName,salary);
	   
	   return emp;
   }

@Override
public String toString()
{
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
			+ employeeSalary + "]";
}
   
   
}
