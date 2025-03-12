package com.oops.abstract_class_methods;

public abstract class Student
{
    
	protected String studentName;
	protected String studentClass;
	protected static int totalNoOfStudents;
	
	public abstract int getPercentage();
	
	public static int getTotalNostudent()
	{
		return totalNoOfStudents;
	}
	
	public Student()
	{
		
	}
	public Student(String studentName,String studentClass)
	{
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		Student.totalNoOfStudents++;
	}
	
}
