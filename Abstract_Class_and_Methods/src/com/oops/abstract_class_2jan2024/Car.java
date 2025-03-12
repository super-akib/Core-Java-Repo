package com.oops.abstract_class_2jan2024;

public abstract class Car 
{
    String brand;
    String model;
    int mileage;
    int topSpeed;
    int yearOfManufacturing;
    //No-Argument Constructor
    public  Car()
    {
            
    } 
    
    String carBrand()
    {    
    	this.brand = "Mahandra";
    	return this.brand;
    }
    
    String carModel()
    {
    	this.model = "Thar 4x4";
    	return this.model;
    }
    
    int carMileage()
    {
    	this.mileage = 15;
    	return this.mileage;
    }
    
    int carTopSpeed()
    { 
    	this.topSpeed = 155;
    	return this.topSpeed;
    }
    int carYear()
    {    
        this.yearOfManufacturing =  2023; 
    	return this.yearOfManufacturing;
    }
    
    public abstract void display();
    
}
 