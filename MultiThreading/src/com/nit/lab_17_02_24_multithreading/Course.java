package com.nit.lab_17_02_24_multithreading;

public class Course 
{
     private int courseId ;
     private String courseName;
     private double courseFees;
     
     public Course(int courseId, String courseName, double courseFees)
     {
    	 this.courseId = courseId;
    	 this.courseName = courseName;
    	 this.courseFees = courseFees;
     }
     
     // use getter for read the private variable value
     public int getCourseId()
     {
    	 return courseId;
     }
     public String getCourseName()
     {
    	 return courseName;
     }
     public double getCourseFees()
     {
    	 return courseFees;
     }

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFees=" + courseFees + "]";
	}

	
     
     
}
