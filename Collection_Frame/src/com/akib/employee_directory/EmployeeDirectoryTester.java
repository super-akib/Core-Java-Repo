package com.akib.employee_directory;

public class EmployeeDirectoryTester 
{
      public static void main(String[] args)
      {
		 Directory  directory = new Directory();
		 
		 Employee  emp1 = new Employee("Alice", "Manager", 50000.0);
		 Employee  emp2 = new Employee("Bob", "Developer", 60000.0);
		 
		 directory.addEmployee(emp1);
		 directory.addEmployee(emp2);
		 //display employee data
		 directory.displayAllEmployee();
		 System.out.println("-----------------------------------------");
		 emp2.setEmployeePosition("Senior Developer");
		 emp2.setEmployeeSalary(55000.0);
		 directory.updateEmployee(emp2); 
		 System.out.println("After updating :");
		 directory.displayAllEmployee();
		 System.out.println("------------------------------------------");
		 System.out.println("Delete employee data :");
		 directory.deleteEmployee(emp2);
		 directory.displayAllEmployee();
		 
		 
		
	  }
}
