package com.oop.labDec4;
import java.util.Scanner;
public class StudentDetails
{

	public static void main(String[] args)
	{
	   Student s1 = new Student();
	   
	   Scanner scan = new Scanner(System.in);
	   
	   System.out.print("Enter Student Name:");
	   String studentName = scan.nextLine();
 	   System.out.print("Enter Student ID:");
 		int studentId = scan.nextInt();
 		System.out.println("Enter Obtain Marks:");
 		int marks = scan.nextInt();
 		s1.setStudentData(studentId, studentName, marks);
 		s1.calculateGrade();
 		String result = s1.displayDetails();
 		System.out.println(result);
 		scan.close();
	}

}
