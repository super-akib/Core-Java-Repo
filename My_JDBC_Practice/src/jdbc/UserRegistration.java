package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UserRegistration
{
     
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		  
		  try
		  {
			 
			  //input for User- Name
			  System.out.print("Enter userName:");
			  String userName = scan.next();
			  //input for Password
			  System.out.print("Enter Password:");
			  String password = scan.next();
			  //input for first name
			  System.out.print("Enter First-name:");
			  String firstName = scan.next();
			  //input for last name
			  System.out.print("Enter last-name:");
			  String lastName = scan.next();
			  //input for email id
			  System.out.print("Enter Email-Id:");
			  String emailId = scan.next();
			  //input for phone number
			  System.out.print("Enter Phone-number:");
			  long number = scan.nextLong();
			  
			  //Loading the Driver
			  
			  
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  //Connect database
			  Connection  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","akib");
			  
			  
			  
			  //Dynamically data inserting in database
			  PreparedStatement pstmt = con.prepareStatement("insert into UserDetails values (?,?,?,?,?,?)");
			  
			  pstmt.setString(1,userName);
			  pstmt.setString(2,password);
			  pstmt.setString(3,firstName);
			  pstmt.setString(4,lastName);
			  pstmt.setString(5, emailId);
			  pstmt.setLong(6,number);
			  
			  pstmt.executeUpdate();
			  
			  System.out.println("Data inserted successfully in database..");
			  
			 
		  }
		  catch(Exception e)
		  {
			  System.err.println(e);
		  }
		  finally
		  {
		      scan.close();	
		  }
		  
	}
} 
