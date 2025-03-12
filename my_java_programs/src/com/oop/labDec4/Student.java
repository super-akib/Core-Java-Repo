package com.oop.labDec4;

public class Student {

    private	int studentId;
    private String studentName;
    private int marks;
    private char studentGrade;
  //set class variables studentId, studentName and marks
  	public void setStudentData(int studentId, String studentName,int marks) 
  	{
  		this.studentId = studentId;
  		this.studentName = studentName;
  		this.marks = marks; 
  	}
  	
  	//set class variable grade value using conditions 
  	public void calculateGrade()
  	{
  	    if(this.marks>90)
  	    {
  	    	this.studentGrade = 'A';
  	    }
  	    else if(this.marks <= 90 && this.marks>=81)
  	    {
  	    	this.studentGrade = 'B';
  	    }
  	    else if(this.marks <= 80 && this.marks>=71)
  	    {
  	    	this.studentGrade = 'C';
  	    }
  	  else if(this.marks <= 70 && this.marks>=61)
	    {
	    	this.studentGrade = 'D';
	    }
  	  else
  	  {
  		this.studentGrade = 'E';
  	  }
  	}
  	
  	//display student details as per the format provided in question
  	public String displayDetails() 
  	{
  		String studentDetails ="Student ["+"name="+studentName+",studentId="+studentId+",marks="+marks+",grade="+studentGrade;
   		return studentDetails;
  	}
	
}
