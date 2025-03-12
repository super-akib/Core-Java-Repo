package com.akib.employee_enum;

public class Employee
{
    private String employeeName;
    private int employeeId;
    private double salary ;
    
    public Employee()
    {
    	
    }
    
    //parametrised constructor
    public Employee(String employeeName,int employeeId,double salary)
    {
    	this.employeeName = employeeName;
    	this.employeeId = employeeId;
    	this.salary  = salary;
    }
    
    //setter for set the values of private all instance variable
    public void setEmployeeName(String employeeName)
    {
    	this.employeeName = employeeName;
    }
    public void setEmployeeId(int employeeId)
    {
    	this.employeeId = employeeId;
    }
    public void setSalary(double salary)
    {
    	this.salary = salary;
    }
    
    //getter for all instance variables
    
    public String getEmployeeName()
    {
    	return this.employeeName;
    }
    public int getEmployeeId()
    {
      return this.employeeId;
    }
    public double getSalary()
    {
    	return this.salary;
    }

	@Override
	public String toString() 
	{
		return "Employee \nName=" + employeeName + ", \nId=" + employeeId + ", \nsalary=" + salary + "";
	}
    
    
    
}
