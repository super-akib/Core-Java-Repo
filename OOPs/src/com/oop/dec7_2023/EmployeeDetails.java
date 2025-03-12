package com.oop.dec7_2023;
import java.util.Scanner;
//ELC
public class EmployeeDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee Id:");
		int employeeId = sc.nextInt();
		System.out.print("Enter Employee name:");
		String empName = sc.next();
		System.out.print("Enter City name:");
		String city = sc.next();
		System.out.print("Enter District name:");
		String district = sc.next();
		System.out.print("Enter State Name:");
		String state = sc.next();
	    
		Address a1 = new Address(city,district,state);
		Employee e1 = new Employee(employeeId,empName,a1);
		System.out.println(e1);
	    sc.close();
	}

}
