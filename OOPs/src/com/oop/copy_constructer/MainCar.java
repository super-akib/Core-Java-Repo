package com.oop.copy_constructer;

import java.util.Scanner;

public class MainCar 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Driver name");
		String driverName = sc.nextLine();
		System.out.println("Enter Driver age:");
		int driverAge = sc.nextInt();
		System.out.println("Enter car brand :");
		String brand = sc.nextLine();
		       brand = sc.nextLine();
		System.out.println("Enter model name:");
		String model = sc.nextLine();
	
	    System.out.println("Enter Year :");
	    int year = sc.nextInt();
	    
	    //Creating object
	    Driver  d1 = new Driver(driverName,driverAge);
	    Car  car = new Car(brand,model,year,d1);
	    Car  car2 = new Car(car);
	    
	    System.out.println("Enter Driver name");
		 driverName = sc.nextLine();
		 driverName = sc.nextLine();
		System.out.println("Enter Driver age:");
	     driverAge = sc.nextInt();
	     System.out.println(car);
		    System.out.println(car2);
	    Driver d2 = new Driver(driverName,driverAge);
	    car2.changeDriver(d2);
	    
	    System.out.println("-----------------Change-Driver-------------------");

	    System.out.println(car);
	    System.out.println(car2);
	    sc.close();
	}

}
