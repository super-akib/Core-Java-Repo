package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LoginOperation 
{
      public static void main(String[] args)
      {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter user Name:");
		 String userName = scan.next();
		 System.out.print("Enter password:");
		 String password = scan.next();
		 try(scan)
		 {
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","akib");
		    PreparedStatement prepare = con.prepareStatement("Select uFName,uLName,mailId,phNumber from UserDetails where (userName=? AND password = ?) ");
		    prepare.setString(1, userName);
		    prepare.setString(2,password);
		    
	         ResultSet  rs = prepare.executeQuery(); 
		     if(rs.next())
		     {
		    	 System.out.println("Login Successfully..");
		     }
		     else
		     {
		    	 System.err.println("!Invalid UserName and Password...");
		     }
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	  }
}
