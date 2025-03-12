package com.akib.employee_enum;

public class Clerk  extends Employee 
{
    private int speed;
    private int accuracy;
    static int count=0;
    public Clerk()
    {
    
    }
    public Clerk(String employeeName,int employeeId,double salary,int speed , int accuracy)
    {
    	super(employeeName,employeeId,salary);
    	this.speed = speed;
    	this.accuracy = accuracy;
    	
    }
    
    public void setSpeed(int speed)
    {
    	this.speed = speed;
    }
    public int getSpeed()
    {
    	return this.speed;
    }
    public void setAccuracy(int accuracy)
    {
    	this.accuracy = accuracy;
    }
    public int getAccuracy()
    {
    	return this.accuracy;
    }
    
    //Override salary method 
    @Override
    public void setSalary(double salary)
    {   
      if(count == 0)
      {
    	  count++;
    	  if(this.speed >70 && this.accuracy > 80)
      	{
      		super.setSalary(salary+1000);
      	}
      }
    	
    }
    
}
