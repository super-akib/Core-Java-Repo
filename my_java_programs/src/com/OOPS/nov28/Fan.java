package com.OOPS.nov28;
import java.util.Scanner;
public class Fan {
    
	String name;
	String coil;
	int wings;
	// Method to switch on the fan
    public void switchOn() {
    	System.out.println("-------------------------------");
        System.out.println("The Brand Name is:"+name);
        System.out.println("The Fan Coil name:"+coil);
        System.out.println("Number of Wings is:"+wings);
        System.out.println("Switch ON:Fan is Rotating.");
    }

    // Method to switch off the fan
    public void switchOff() {
       System.out.println("Switch OFF:Fan is not Rotating.");
    }
    public static void main(String[] args) {
        // Create a Fan object
       Fan  fanObj = new Fan();
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter Fan Brand Name:");
       fanObj.name = scan.next();
       System.out.print("Enter Fan Coil name:");
       fanObj.coil = scan.nextLine();
       fanObj.coil = scan.nextLine();
       System.out.print("Enter Fan Wings:");
       fanObj.wings = scan.nextInt();
       scan.close();

        // Call methods on the Fan object
       fanObj.switchOn();
       fanObj.switchOff();
       scan.close();
        
    }
}
