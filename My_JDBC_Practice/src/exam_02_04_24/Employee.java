package exam_02_04_24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee 
{  
	static PreparedStatement prepareStatement;
    
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		  try (sc){
			Class.forName("oracle.jdbc.driver.OracleDriver");
			  Connection  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "akib");
			  
			  while(true)
			  {
				  System.out.println(" 1.Insert data into Employee Table.");
				  System.out.println(" 2.Increase 10% of salary of those employee who is getting salary less than 10000.");
				  System.out.println("3.delete employee who is getting salary greater than 50000.");
				  System.out.println("4.Exit.");
				  System.out.println("===========================================");
				  System.out.print("Enter your option:");
				  int option  = sc.nextInt();
				  
				  switch(option)
				  {
				    case 1: 
				    	    System.out.print("Enter employee id:");
				    	    int id = sc.nextInt();
				    	    System.out.print("Enter employee Name:");
				    	    String name = sc.next();
				    	    System.out.print("Enter salary:");
				    	    double salary =sc.nextDouble();
				    	    System.out.print("Enter Address:");
				    	    String address = sc.next();
				    	    System.out.print("Enter mail id:");
				    	    String emailId = sc.next();
				    	    System.out.print("Enter phone number:");
				    	    long phNo = sc.nextLong();
				    	    String insert ="insert into employee_info values (?,?,?,?,?,?)"; 
				    	     prepareStatement = con.prepareStatement(insert);
				    	     prepareStatement.setInt(1, id);
				    	     prepareStatement.setString(2, name);
				    	     prepareStatement.setDouble(3, salary);
				    	     prepareStatement.setString(4, address);
				    	     prepareStatement.setString(5, emailId);
				    	     prepareStatement.setLong(6, phNo);
				    	    
				    	    prepareStatement.executeUpdate();
				    	    System.out.println("Data inserted successfully...");
				    	    break;
				    case 2: 
				    	     Statement stmt = con.createStatement();
				    	    
				    	     stmt.addBatch("update emplouee_info set empsalary = empsalary*0.1 where empsalary<=10000");
				    	     stmt.executeBatch();
				    	     System.out.println("Data updated..");
				    	     break;
				    case 3:  
				    	    Statement  s1 = con.createStatement();
				    	    s1.addBatch("delete employee_info  where empsalary >= 50000");
				    	    s1.executeBatch();
				    	    System.out.println("Employee deleted.");
				    	    break;
				    	    
				    case 4:  System.exit(0);  	    
				  }
			  }
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		  
	}
}
