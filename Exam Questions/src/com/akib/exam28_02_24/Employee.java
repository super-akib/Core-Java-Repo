package com.akib.exam28_02_24;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class Employee implements Serializable
{
    Integer employeeId;
    String employeeName;
    Double  employeeSalary;
    Date    date;
	
    public Employee(Integer employeeId, String employeeName, Double employeeSalary, Date date) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.date = date;
	}
    
    public static Employee getEmployeeObject()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Id:");
    	Integer id = sc.nextInt();
    	System.out.print("Enter name:");
    	String name = sc.nextLine();
    	name = sc.nextLine();
    	System.out.print("Enter Salary:");
    	Double salary =sc.nextDouble();
    	
    	return new Employee(id, name, salary, new Date());
    }

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", date=" + date + "]";
	}
    
    
    
    
    
}
