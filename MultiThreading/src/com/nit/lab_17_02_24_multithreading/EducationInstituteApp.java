package com.nit.lab_17_02_24_multithreading;

public class EducationInstituteApp 
{

	public static void main(String[] args) throws InterruptedException
	{  
		Course [] courses = new Course[3];
		courses[0] = new Course(1, "Mathametics", 1000);
		courses[1] = new Course(2, "Science", 1200);
		courses[2] = new Course(3, "English", 900);
		
		Offer [] offers = new Offer[2];
		offers[0]= new Offer("Special discount: Get 20% off on all courses!");
		offers[1] = new Offer("Limited time offer: Enroll in any two courses and get one course free!");
     
		EducationInstitute ei = new EducationInstitute(courses, offers);
		Student john  = new Student("John",ei);
		Student alice = new Student("Alice",ei);
		
		//Threads 
		Thread thread1 = new Thread()
		{
			@Override
			public void run()
			{   System.out.println("Available Courses:\n--------------");
				john.viewCoursesAndFees();
				System.out.println("Ongoing Offers:");
				john.viewOffers();
				john.enrollInCourse(2);
				System.out.println("--------------------------------------------");
			}
		};
		
		Thread thread2 = new Thread()
		{
			@Override
			public void run()
			{   
				System.out.println("Available Courses:\n--------------");
				alice.viewCoursesAndFees();
				System.out.println("Ongoing Offers:");
				alice.viewOffers();
				alice.enrollInCourse(1);
			}
		};
		
		//start threads
		thread1.start();
		thread1.join();
		thread2.start();
	}

}
