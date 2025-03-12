package com.oop.copy_constructer;

public class Employee 
{
  
	 private String employeeName;
	 private int employeeAge;
	 private double employeeSalary;
	 private String department;
	 
	
	 //Parameterize constructor
	 public Employee(String employeeName, int employeeAge, double employeeSalary, String department)
	 {
		super();
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeSalary = employeeSalary;
		this.department = department;
	}
	 
	 //Copy constructor
	 public Employee(Employee e) 
	 {
		 this.employeeName = e.employeeName;
		 this.employeeAge  = e.employeeAge;
		 this.employeeSalary = e.employeeSalary;
		 this.department = e.department;
	 }

	 //Setter and Getter methods
	public String getEmployeeName()
	{
		return employeeName;
	}

	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}

	public int getEmployeeAge()
	{
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge)
	{
		this.employeeAge = employeeAge;
	}

	public double getEmployeeSalary()
	{
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary)
	{
		this.employeeSalary = employeeSalary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	 
	 //method take salary percentage
	public double raiseSalary(double percentage)
	{
		//we used here Setter method 
	    employeeSalary += ((this.employeeSalary * percentage)/100);
	    this.setEmployeeSalary(employeeSalary);
		return this.employeeSalary;
	}
 
	public String toString()
	{
		String str = "";
		str = "Employe Name:"+this.employeeName+",Employee Age:"+this.employeeAge+",Salary:"+this.employeeSalary+",Department:"+this.department;
		return str;
	}
	 
	 
}
