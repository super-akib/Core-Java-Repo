package exam_set_a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEmployeeData 
{
    static final String JDBC_DRIVER ="oracle.jdbc.driver.OracleDriver";
    static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    static final String USER_NAME ="System";
    static final String PASSWORD ="akib";
    
    public static void main(String[] args) {
		
    	Connection con =null;
    	Scanner scan = new Scanner(System.in);
    	try (scan){
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			
			System.out.print("Enter employee id:");
			int empId = scan.nextInt();
			System.out.print("Enter employee name:");
			String empName = scan.nextLine();
			empName = scan.nextLine();
			
			System.out.print("Enter employee age:");
			int age = scan.nextInt();
			System.out.print("Enter department:");
			String department = scan.next();
			
			String insertQuery="insert into employees values (?,?,?,?)";
			PreparedStatement prepareStatement = con.prepareStatement(insertQuery);
			prepareStatement.setInt(1,empId );
			prepareStatement.setString(2, empName);
			prepareStatement.setInt(3, age);
			prepareStatement.setString(4, department);
			
			prepareStatement.executeUpdate();
			
			System.out.println("Data inserted successfully...");
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
    	
	}
}
