package com.akib.employee_enum;

public class EmployeeTester 
{
       public static void main(String[] args)
       {
		   Clerk clerk = new Clerk("Akib", 102,50000.0, 80, 90);
		   System.out.println("Before Increase Typing speed salary:");
		   System.out.println("Clerk "+clerk);
		   clerk.setSalary(50000);
		   clerk.setSpeed(95);
		   System.out.println("\n***********************************");
		   System.out.println("After Increase Typing speed salary:");
		   System.out.println("Clerk "+clerk);
		   System.out.println("...................................");
           
		   Manager  hr = new Manager("Akib", 105, 60000, ManagerType.HR);
		   System.out.println("Hr-Manger :\n"+hr);
		   hr.setSalary(60000);
		   System.out.println(hr);
		   System.out.println("\n***********************************");
		   System.out.println("After adding bonouce:");
		   System.out.println("Hr-Manger :\n"+hr);
		   
		   System.out.println("-----------------------------------------");
		   Manager  sales = new Manager("Akib", 105, 60000, ManagerType.SALES);
		   System.out.println("Sales-Manager :\n"+sales);
		   sales.setSalary(60000);
		   System.out.println("\n***********************************");
		   System.out.println("After adding bonouce:");
		   System.out.println("Sales-Manager:\n"+sales);
	   }
}
