package com.oop.copy_constructer;

import java.util.Scanner;

public class EmployeeTest 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee name:");
		String empName = sc.nextLine();
		System.out.print("Enter employee age:");
		int empAge = sc.nextInt();
		System.out.print("Enter Salary:");
		double salary = sc.nextDouble();
		System.out.print("Enter Department Name:");
		String department = sc.nextLine();
	           department = sc.nextLine();
	    
	    //Reference  variable        
	    Employee emp = new Employee(empName,empAge,salary,department);
	    Employee e1 = new Employee(emp);
	    
	    //input for raiseSalary method
	    System.out.print("Enter increase salary:");
	    double percent = sc.nextDouble();
	    e1.raiseSalary(percent);
	    
	    // Display result
	    System.out.println("--------------Orignal-Data-------------");
	    System.out.println(emp);
	    System.out.println("--------------Copy-Data-------------");
	    System.out.println(e1);
	    
	    sc.close();
	}

}
