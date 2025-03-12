package com.nit.lab_17_02_24_multithreading;

public class Student 
{
  private String studentName;	
  private EducationInstitute educationInstitute;
  
  public Student(String studentName, EducationInstitute educationInstitute)
  {
	  this.studentName = studentName;
	  this.educationInstitute = educationInstitute;
  }
  //Display courses and fees
  public  void viewCoursesAndFees()
  { 
	 Course[] courses = educationInstitute.getCourses();
	  for(Course course:courses)
	  {
		  System.out.println(course.getCourseId()+"."+course.getCourseName()+"-Fee:Rs."+course.getCourseFees());
	  }
  }
  //Display Offers related to courses
  public void viewOffers()
  {
	  Offer[] offers = educationInstitute.getOffers(); 
	  for(Offer offer:  offers)
	  {
		  System.out.println(offer);
	  }
  }
  
  public void enrollInCourse(int courseId)
  {   
	  	 educationInstitute.enrollStudentInCourse(courseId, studentName);
  }
  
}
