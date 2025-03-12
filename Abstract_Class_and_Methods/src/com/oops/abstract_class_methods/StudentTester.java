package com.oops.abstract_class_methods;
import java.util.Scanner;
public class StudentTester
{
   public static void main(String []args)
   {
	   Scanner sc  = new Scanner(System.in);
	   
	   System.out.print("Enter Class Name:");
	   String studentClass = sc.nextLine();
	   System.out.print("Enter Student Name:");
	   String studentName = sc.nextLine();
	   System.out.print("Enter Physics marks:");
	   int physics  = sc.nextInt();
	   System.out.print("Enter Chemistry marks:");
	   int chemistry = sc.nextInt();
	   System.out.print("Enter Maths marks:");
	   int maths = sc.nextInt();
	   
	   Student s1 = new ScienceStudent(studentName, studentClass, physics, chemistry, maths);
	      
	   
	   System.out.print("Enter Class Name:");
	    studentClass = sc.nextLine();
	    studentClass = sc.nextLine();
	   System.out.print("Enter Student Name:");
	    studentName = sc.nextLine();
	    
	    System.out.print("Enter History marks:");
	    int history = sc.nextInt();
	    System.out.println("Enter civics marks:");
	    int civics = sc.nextInt();
	    
	    Student s2 = new HistoryStudent(studentName,studentClass,history,civics);
	    
         System.out.print("\n\nFor Science Students.\n------------------------------------------\n");
	    
	    System.out.println("Student Name:"+s1.studentName);
	    System.out.println("Class Name:"+s1.studentClass);
	    System.out.println("Percentage:"+s1.getPercentage());
	    System.out.println("Number of student:"+Student.getTotalNostudent());
	    
	    System.out.print("\n\nFor History Students.\n------------------------------------------\n");
	    System.out.println("Student Name:"+s2.studentName);
	    System.out.println("Class Name:"+s2.studentClass);
	    System.out.println("Percentage:"+s2.getPercentage());
	    System.out.println("Number of student:"+Student.getTotalNostudent());
	   
	    sc.close();
   }
}
