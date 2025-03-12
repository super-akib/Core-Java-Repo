package com.akib.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeTest 
{
   public static void main(String args[])
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter number of Employee data insert into list:");
	   int numberOfEmployee = sc.nextInt();
	   
	   //ArrayList Object
	   List<EmployeeSalary>  list = new ArrayList<>();
	   
	   for(int i=1;i<=numberOfEmployee ; i++)
	   {
		   list.add(EmployeeSalary.enterEmployeeData());
	   }
	  
	      list.stream().filter((e->e.employeeSalary()>=25)).
	    		   map((emp->{
	    			   emp.employeeSalary();
	    			 return emp;  
	    		   }));
	    	   	    	   
	      
	       sc.close(); 
	       //1System.out.println(collect);
   }
	 
}
