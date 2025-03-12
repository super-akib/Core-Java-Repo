package com.akib.employee_directory;
import java.util.ArrayList;
public class Directory 
{
    ArrayList<Employee>   employeDirectory = new ArrayList<>();
    //Add employee data in ArrayList
    public void addEmployee(Employee emp)
    {
    	employeDirectory.add(emp);
    }
    
    //Display all employee data 
    public void displayAllEmployee()
    {
         employeDirectory.forEach(emp-> System.out.println(emp));
    }
    //update emplyee data 
    public void  updateEmployee(Employee emp)
    {
    	int index =employeDirectory.indexOf(emp);
         
    	employeDirectory.set(index, emp);
    }
    
    //remove or delete employee data
    public void deleteEmployee(Employee emp)
    {
    	employeDirectory.remove(emp);
    }
    
    
    
}
