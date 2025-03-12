package exam_02_04_24;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Emp 
{
    public static void main(String[] args) {
		
    	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			  Connection  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "akib");
			  PreparedStatement prepare = con.prepareStatement("insert into emp_info values(?,?,?,?,?,?)");
			  
			  prepare.setInt(1,101);
			  prepare.setString(2,"Jake");
			  prepare.setString(3,"Hydrabade");
			  prepare.setString(4, "jake@example.com");
			  prepare.setLong(5, 1234567891);
			  prepare.setClob(6, new FileReader("D:\\JAVA27\\empresume.txt"));
			  prepare.executeUpdate();
			  System.out.println("Data inserted successfully...");
		} catch (Exception e) {
						
			e.printStackTrace();
		}
    }
}
