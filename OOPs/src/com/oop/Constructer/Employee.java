package com.oop.Constructer;

public class Employee 
{
  
	private int emloyeeId;
	private String employeeName;
	private double employeeSalary;
	private int noOfProjects;
	public Employee(int emloyeeId, String employeeName, double employeeSalary, int noOfProjects) {
		super();
		this.emloyeeId = emloyeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.noOfProjects = noOfProjects;
	}
	@Override
	public String toString() {
		return "Employee [emloyeeId=" + emloyeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", noOfProjects=" + noOfProjects + "]";
	}
	
	
}
