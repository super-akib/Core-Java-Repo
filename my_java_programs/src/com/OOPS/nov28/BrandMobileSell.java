package com.OOPS.nov28;
import java.util.Scanner;
public class BrandMobileSell {
    // Reference vriables of class.
	String nameOfBrand;
	String nameOfModel;
	String modelNumber;
	String processor;
	int ram;
	int storage;
	double price;
	
	// Method one Specification 
	public void mobileSpecification()
	{   
		System.out.println("**********************************");
		System.out.println(""+nameOfBrand);
		System.out.println(""+nameOfModel);
		System.out.println(""+modelNumber);
		System.out.println(""+processor);
		System.out.println(ram+"GB RAM/"+storage+"GB storage.");
	}
	
	// Method two mobile cost
	public void mobileCost()
	{
		System.out.println("Cost of Mobile is:"+price);
	}
	// Main Method
	public static void main(String args[])
	{   
		// refrence Object create
		BrandMobileSell  obj = new BrandMobileSell();
		// Scanner object created
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Brand Name:");
		obj.nameOfBrand = scan.next();
		System.out.print("Enter Model Name:");
		obj.nameOfModel = scan.next();
		obj.nameOfModel = scan.next();
		System.out.print("Enter Model number:");
		obj.modelNumber = scan.next();
		System.out.print("processor name:");
		obj.processor = scan.nextLine();
		obj.processor = scan.nextLine();
		System.out.print("RAM & Storage capacity:");
		obj.ram = scan.nextInt();
		obj.storage = scan.nextInt();
		System.out.print("Enter Cost.");
		obj.price = scan.nextDouble();
		obj.mobileSpecification();
		obj.mobileCost();
		scan.close();
	}
	
}
