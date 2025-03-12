package com.oop.dec6_2023;
import java.util.Scanner;
public class EmployeeDetails {

	public static void main(String[] args) {
		  
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter employee Id:");
		int empId = sc.nextInt();
		System.out.print("Enter employee name:");
		String empName = sc.next();
		System.out.print("Enter City name:");
		String cityName = sc.next();
		System.out.print("Enter District name:");
		String districtName = sc.next();
		System.out.print("Enter State name");
		String stateName = sc.next();
		
		Address  address1 = new Address(cityName,districtName,stateName);
		Employee emp = new Employee(empId,empName,address1);
		System.out.println(emp);
		
		sc.close();

	}

}
