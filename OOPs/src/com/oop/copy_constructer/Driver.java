package com.oop.copy_constructer;

public class Driver
{
    private String driverName;
    private int driverAge;
    
    public Driver(String name,int age)
    {
    	super();
    	this.driverName = name;
    	this.driverAge = age;
    }

	public String getDriverName()
	{
		return driverName;
	}

	public void setDriverName(String driverName) 
	{
		this.driverName = driverName;
	}

	public int getDriverAge() 
	{
		return driverAge;
	}

	public void setDriverAge(int driverAge)
	{
		this.driverAge = driverAge;
	}

	@Override
	public String toString() {
		return "Driver [driverName=" + driverName + ", driverAge=" + driverAge + "]";
	}
    
	
}
