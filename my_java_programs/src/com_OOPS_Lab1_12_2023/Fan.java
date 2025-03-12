package com_OOPS_Lab1_12_2023;

import java.util.Scanner;
public class Fan {
    //Declare the variable
    String brandName;
    String nameOfCoil;
    int numberOfWings;
    char ch;
    // Method to initialize fan properties
    private void initializeProperties() {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter Fan name:");
      brandName = scan.next();
      System.out.print("Enter Coil name:");
      nameOfCoil = scan.next();
      System.out.print("Enter number of wings:");
      numberOfWings = scan.nextInt();
      System.out.print("Press Button ON/OFF Fan:");
      ch = scan.next().charAt(0);
      scan.close();
    }

    // Method to switch on the fan
    public void switchOn() {
    	System.out.println("---------------------------------");
       System.out.println("Fan name:"+brandName);
       System.out.println("Fan Coil:"+nameOfCoil);
       System.out.println("Fan wings:"+numberOfWings);
       System.out.println("The Fan switch is ON, fan is Rotating.");
    }

    // Method to switch off the fan
    public void switchOff() {
    	System.out.println("---------------------------------");
      System.out.println("Fan name:"+brandName);
       System.out.println("Fan Coil:"+nameOfCoil);
       System.out.println("Fan wings:"+numberOfWings);
       System.out.println("The Fan switch is OFF, fan is not Rotating.");
    }
    
    void getFanData()
    {
        initializeProperties();
        if(ch =='N'||ch=='n')
        {
            switchOn();
        }
        else
         {
             switchOff();
         }
    }

    public static void main(String[] args) {
       
        // Call methods on the Fan object
        Fan fanObj = new Fan();
        fanObj.getFanData();
    }
}
