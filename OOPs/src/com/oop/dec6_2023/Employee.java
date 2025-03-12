package com.oop.dec6_2023;

public class Employee
{
    private int empNumber;
    private String empName;
    private Address add ; //HAS-A relation
    
    public Employee(int empNumber,String empName,Address add)
    {
    	this.empNumber = empNumber;
    	this.empName = empName;
    	this.add = add;
    }
    
    public String toString()
    {
    	String employee = "Employee[Empoly Number:"+empNumber+",Employee Name:"+empName+",Address:"+add+"]";
    	return employee;
    }
}
