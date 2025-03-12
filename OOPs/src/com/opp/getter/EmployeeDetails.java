package com.opp.getter;
public class EmployeeDetails 
{ 
	
   public static void main(String []args)
   {
	  
	 Employee e1 = Employee.getEmployeeData();
	 System.out.println("Employee ID:"+e1.getEmployeeID());
	 System.out.println("Employee Name:"+e1.getEmployeeName());
	 System.out.println("Salary is:"+e1.getSalary());
	 
	 
	 if(e1.getSalary() >= 60000)
	   {
		   System.out.println("Employee is Developer.");
	   }
	   else if(e1.getSalary() >=40000 && e1.getSalary()<60000)
	   {
		   System.out.println("Employee is Designer.");
	   }
	   else
	   {
		  System.out.println("Employee is Tester."); 
	   }
	   
   }
   
   
}
