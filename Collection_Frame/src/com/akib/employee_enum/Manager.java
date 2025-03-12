package com.akib.employee_enum;

public class Manager extends Employee
{
    private ManagerType hr ;
    
    public Manager()
    {
    	
    }
    public Manager(String employeeName,int employeeId,double salary,ManagerType hr)
    {   
    	super(employeeName,employeeId,salary);
    	this.hr = hr;
    }
    
    @Override 
    public  void setSalary(double salary)
    {
    	if(this.hr.equals(ManagerType.HR))
    	{
    		super.setSalary(salary+10000.0);
    	}
    	else
    	{
    		super.setSalary(salary+5000.0);
    	}
    }
    
}
