package com.oop.copy_constructer;

public class Car 
{
  
	private String brand;
    private String model;
    private int year ;
    private Driver driver;
    //Parameterize constructor
    public Car(String brand,String model,int year,Driver driver)
    {
    	this.brand = brand;
    	this.model = model;
    	this.year = year;
    	this.driver = driver;
    }
    //Reference pass through constructor
    public Car(Car newCar)
    {
    	this.brand = newCar.brand;
    	this.model = newCar.model;
    	this.year = newCar.year;
    	this.driver = newCar.driver;
    }
    
     //setter and getter
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand) 
	{
		this.brand = brand;
	}
	public String getModel() 
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	public Driver getDriver()
	{
		return driver;
	}
	public void setDriver(Driver driver)
	{
		this.driver = driver;
	}
    
	//method change care driver
	
	public void changeDriver(Driver newDriver)
	{
		this.driver = newDriver;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", year=" + year + ", driver=" + driver + "]";
	}
    
	
    
    
}
