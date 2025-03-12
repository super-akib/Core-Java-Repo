package exam_02_04_24;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudent
{
     public static void main(String[] args) 
     {
    	 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			  Connection  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "akib");
			  PreparedStatement prepare = con.prepareStatement("insert into student_info values(?,?,?,?,?)");
			  prepare.setInt(1, 103);
			  prepare.setString(2, "Jhon");
			  prepare.setInt(3, 507);
			  prepare.setString(4, "Hyd");
			  Date d1 = new Date();
			  prepare.setDate(5, new java.sql.Date(d1.getDate()) );
			  
			  prepare.executeUpdate();
			  System.out.println("Data inserted successfully....");
			  
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		  
	}
}
