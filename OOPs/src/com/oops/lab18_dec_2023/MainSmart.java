package com.oops.lab18_dec_2023;

import java.util.Scanner;
public class MainSmart 
{
  
	public static void main(String args[]) 
	{
	 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter device type:");
		String type = sc.next();
		System.out.print("Enter brightness level:");
		int brightness = sc.nextInt();
		
		
		 
		 LightDevice d1 = new LightDevice(type);
		
		 
		 System.out.print("Enter device type:");
		 type = sc.next();
		
		 System.out.print("Enter temperature:");
		 int temperature = sc.nextInt();
		 ThermostatDevice t1 = new ThermostatDevice(type);
		 System.out.println("-------------------------------");
		 d1.turnOn();
		 d1.dim(brightness);
		 t1.turnOn();
		 t1.setTemperature(temperature);
		 d1.turnOff();
		 t1.turnOff();
		 sc.close();
		
	}
  
}
