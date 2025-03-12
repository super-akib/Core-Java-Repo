package com.OOPS.nov28;
import java.util.Scanner;
public class Dog {
    
	 String name;
	 double height;
	 int age;
	// Method to get dog information
	public void getDogInformation() 
	{
	    System.out.println("Dog name is:"+name);
	    System.out.println("Dog height is:"+height);
	    System.out.println("Dog age is:"+age);
    }
	
	 // Method for the dog to bark
    public void bark() {
        System.out.println("The Dog is Barking..");
    }

	public static void main(String[] args) {
		 // Create a Dog object
		Dog dogObj = new Dog();
		Scanner scanObj = new Scanner(System.in);
		System.out.print("Enter name of the Dog:");
		dogObj.name = scanObj.nextLine();
		System.out.print("Enter Height of the Dog:");
		dogObj.height = scanObj.nextDouble();
		System.out.print("Enter Age of Dog:");
		dogObj.age = scanObj.nextInt();
		
		//Calling The Methods..
		dogObj.getDogInformation();
		dogObj.bark();
		scanObj.close();

	}

}
