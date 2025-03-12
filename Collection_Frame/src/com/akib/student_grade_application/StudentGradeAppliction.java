package com.akib.student_grade_application;
import java.util.HashMap;
import java.util.Scanner;
public class StudentGradeAppliction
{
    public static void main(String args[])
    {
    	HashMap<String,Character> hsm = new HashMap<>();
    	Scanner scan = new Scanner(System.in);
        
    	while(true)
    	{   
    		System.out.println("*******************<STUDENT-GRADE-MENU>***************");
    		System.out.println("Select-Options");
    		System.out.println("1.Add Student Grade.");
    		System.out.println("2.Remove Student Grade.");
    		System.out.println("3.Exit");
    		System.out.print("Enter your choice:");
    		int choice = scan.nextInt();
    		
    		switch(choice)
    		{
    		   case 1: 
    			       System.out.print("Enter Student name:");
    			       String studentName = scan.nextLine();
    			       studentName = scan.nextLine();
    			       System.out.print("Enter grade:");
    			       char grade = scan.next().charAt(0);
    			       hsm.put(studentName, grade);
    			       System.out.println("Student "+studentName+"  grade ["+grade+"] added sucessfully ");
    			       System.out.println("===========================================================");
    			       break;
    		   case 2: 
    			       if(hsm.isEmpty())
    			       {
    			    	   System.out.println("Record is empty ");
    			       }
    			       else
    			       {
    			    	   System.out.print("Enter the student name whose grade they want ot remove:");
    			    	   studentName = scan.nextLine();
    			    	   studentName = scan.nextLine();
    			    	   if(hsm.containsKey(studentName))
    			    	   {
    			    		   hsm.remove(studentName);
    			    		   System.out.println("Student "+studentName+" is removed ..");
    			    	   }
    			    	   else
    			    	   {
    			    		   System.err.println("Student "+studentName+" is not present in the record");
    			    	   }
    			       }
    			       break;
    		   case 3:
    			       System.out.println("All the best Student , Good by");
    			       scan.close();
    			       System.exit(0);
    			       break;
    		   default :
    			        System.err.println("Enter valid choice.");
    		}
    	}
    	
    }
}
