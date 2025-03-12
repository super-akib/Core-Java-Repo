package com_OOPS_Lab1_12_2023;
import java.util.Scanner;
public class Dog {
	// Declare the varible 
    String dogName;
    double dogHeight;
    int  dogAge;
    // Method to initialize dog properties
    private void initializeProperties() {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Dog name:");
       dogName = sc.next();
       System.out.print("Enter Dog height:");
       dogHeight = sc.nextDouble() ;
       System.out.print("Enter Dog age:");
       dogAge = sc.nextInt();
       sc.close();
    }

    // Method to get dog information
    public void getDogInformation() {
       System.out.println("Dog name is:"+dogName);
       System.out.println("Dog Height is:"+dogHeight+"cm");
       System.out.println("Dog age is:"+dogAge+" year");
    }

    // Method for the dog to bark
    public void bark() {
       System.out.println("The dog is Barking.");
    }
    void getData()
    {
    	initializeProperties();
    	getDogInformation();
    	bark();
    }

    public static void main(String[] args) {
     
        // Call methods on the Dog object
    	Dog object = new Dog();
    	object.getData();
    }
}
