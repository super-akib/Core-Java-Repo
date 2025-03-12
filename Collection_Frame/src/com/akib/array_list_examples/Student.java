package com.akib.array_list_examples;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class Student  implements Serializable
{
    private Integer studentId;
    private String studentName;
    private Double courseFee;
    private Date  dateOfAdmission;
    public Student(Integer studentId,String studentName, Double courseFee,Date dateOfAdmission)
    {
    	this.studentId = studentId;
    	this.studentName = studentName;
    	this.courseFee = courseFee;
    	this.dateOfAdmission = dateOfAdmission;
    }
    
    public static Student getStudentObject()
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Enter student ID:");
    	Integer studentId = scan.nextInt();
    	System.out.print("Enter student name:");
    	String studentName = scan.nextLine();//buffer problem handled
    	studentName = scan.nextLine();
    	System.out.print("Enter a course fees:");
    	Double courseFee = scan.nextDouble();
    	
    	return new Student(studentId,studentName,courseFee,new Date());
    }

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courseFee=" + courseFee
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}
    
    
}
