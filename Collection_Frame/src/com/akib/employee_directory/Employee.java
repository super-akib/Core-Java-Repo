package com.akib.employee_directory;

public class Employee 
{
    private String employeeName;
    private String employeePosition;
    private Double employeeSalary ;
    
    public Employee(String employeeName,String employeePosition,Double employeeSalary)
    {
    	this.employeeName = employeeName;
    	this.employeePosition = employeePosition;
    	this.employeeSalary = employeeSalary;
    }
    
    //set the employee name
    public void setEmployeeName(String employeeName)
    {
    	this.employeeName = employeeName;
    }
    //get the employee name
    public String getEmployeeName()
    {
    	return this.employeeName;
    }
    
    //Set employee position
    public void setEmployeePosition(String employeePosition)
    {
    	this.employeePosition = employeePosition;
    }
    //get employee position 
    public String getEmployeePosition()
    {
    	return this.employeePosition;
    }
    //set employee  salary
    public void setEmployeeSalary(Double employeeSalary)
    {
    	this.employeeSalary = employeeSalary;
    }
    //get employee salary
    public Double getEmployeeSalary()
    {
    	return this.employeeSalary;
    }
    
    @Override 
    public String  toString()
    {
    	return "Employee{Name ="+employeeName+", position="+employeePosition+", salary="+employeeSalary+"}";
    }
    
    
    
}
