package com.akib.exam13_03_24;

import java.util.Scanner;

public class StudentDataTest
{
     public static void main(String[] args)
     {
		   Scanner sc = new Scanner(System.in);
		   StudentData  data = new StudentData();
		   while(true)
		   {
			   System.out.println("=================Student-Record-Entry=============");
		
			   System.out.println("1.Add Student Record.");
			   System.out.println("2.Display Student Record.");
			   System.out.println("3. Exit.");
			   
			   System.out.println("Enter your choice:");
			   int choice = sc.nextInt();
			  switch(choice)
			  {
			    case  1: System.out.print("Enter Student name:");
			             String name = sc.nextLine();
			             name = sc.nextLine();
			             System.out.print("Enter grade :");
			             char grade = sc.next().charAt(0);
			    	     data.addStudent(name,grade);
			    	     System.out.println("Student "+name+" added sucessfully..");
			             break;
			             
			    case  2:  System.out.println("Enter student name:");
			              name = sc.nextLine();
			              name = sc.nextLine();
			              data.viewStudentInformation(name);
			              break;
			    
			    case 3:  
			    	    sc.close();
			    	    System.exit(0);
			    	    break;
			   default :
				         System.err.println("Invalid option choise again....");
			  }
		   }
	}
}
