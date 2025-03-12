package com.oop.labDec4;
import java.util.Scanner;
public class EmployeeDetails {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Employee First name:");
		String firstName = scan.next();
		System.out.print("Enter Employee Last name:");
		String lastName = scan.next();
		System.out.print("Enter Employee Id:");
		int  empId = scan.nextInt();
		System.out.print("Enter salary:");
		double salary = scan.nextDouble();
		System.out.print("Enter number of projects:");
		int numberOfProject = scan.nextInt();
		 
	     e1.getEmployeeData(firstName, lastName, empId, salary, numberOfProject);
		 e1.calculateSalary();
		 System.out.println(e1);
	     scan.close();
     
	}

}

