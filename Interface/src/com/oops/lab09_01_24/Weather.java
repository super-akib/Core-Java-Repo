package com.oops.lab09_01_24;

import java.util.Scanner;
import java.util.function.Function;

public class Weather
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Select Convertion : \n1.Celcius to Kelvin.\n2.Fahrenheit to Celcius.");
        int option = scan.nextInt();
        
        System.out.print("Enter Temperature:");
        double temperature = scan.nextDouble();
        
    	Function<Double, Double> celciusKelvin = celcius -> celcius + 273.15;
    	Function<Double, Double>  fahrenheitToCelcius = fahrenheit -> ((fahrenheit-32)*5/9);
    	double result;
 
    	if(option == 1)
    	{  
    		result = celciusKelvin.apply(temperature); 
    	   System.out.println("Celcius to Kelvin is:"+result);
    	}
    	else if(option == 2)
    	{
    		result = fahrenheitToCelcius.apply(temperature);
        	System.out.println("Fahrenheit to Celcius is:"+result);
    	}
    	else
    	{
    		System.out.println("Invalid Option 1-2 only...");
    	}
    	
    }
}    