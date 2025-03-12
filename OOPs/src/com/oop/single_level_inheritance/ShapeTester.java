package com.oop.single_level_inheritance;

import java.util.Scanner;

public class ShapeTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius of Circle:");
		double radius  = sc.nextDouble();
		System.out.print("Enter Height of Cylinder:");
		double height = sc.nextDouble();
		
		System.out.println("--------------------Default value-----------------");
	//create an object to Cylinder class. don't pass values.
		Cylinder cylinder = new Cylinder();
		//call getVolume and getArea methods and print details
		double result = cylinder.getArea();
		System.out.println("Area of Circle:"+result);
		result = cylinder.getVolume();
		System.out.println("Cylinder volume:"+result);
		
		System.out.println("-------------------Passing parameter--------------------");
		
	//create an object to Cylinder class by passing values like (6,12)
		Cylinder c1 = new Cylinder(radius,height);
		//call getVolume and getArea methods and print details
		result = c1.getArea();
		System.out.println("Area of Circle:"+result);
		result = c1.getVolume();
		System.out.println("Cylinder volume:"+result);
		sc.close();
	}

}
