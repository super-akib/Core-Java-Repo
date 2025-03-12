package com.oops.lab2_18dc_2023;

public class SmartHomeDevice
{
    // instance variable
	private String type;
	private boolean status;
	
	//Parameterized constructor super class
	public SmartHomeDevice(String type)
	{   
		super();
		this.type = type;
	}
	
	//Getter and setter for read and modify data
	public void setType(String type)
	{
		this.type = type;
	}
	public String getType()
	{
		return this.type;
	}
	
	public void setStatus(boolean status)
	{
		this.status = status;
	}
	
	public boolean getStatus()
	{
		return this.status;
	}
	
	//Instance methods 
	public void turnOn()
	{   
		  System.out.println(type+" is turn ON.");
	}
	
	public void turnOff()
	{   
		System.out.println(type+" is turn OFF.");
	}
	
	
}
