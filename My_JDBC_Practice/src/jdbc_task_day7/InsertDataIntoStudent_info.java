package jdbc_task_day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class InsertDataIntoStudent_info
{
        public static void main(String[] args) {
        	Connection con = null;
        	Scanner scan = new Scanner(System.in);
        	try(scan){
				Class.forName("oracle.jdbc.driver.OracleDriver");
				  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","akib");
	
				  System.out.print("Enter student Id:");
				  int studentId = scan.nextInt();
				  System.out.print("Enter student name:");
				  String studentName = scan.nextLine();
				  studentName = scan.nextLine();
				  System.out.print("Enter rollno:");
				  int rollNo = scan.nextInt();
				  System.out.print("Enter Address:");
				  String address = scan.nextLine();
				  address = scan.nextLine();
				  
				  
				  String inserQuery="insert into  student_info values (?,?,?,?,?)";
				  
				  PreparedStatement  prepareStatement = con.prepareStatement(inserQuery);
				  
				  
				  prepareStatement.setInt(1,studentId);
				  prepareStatement.setString(2, studentName);
				  prepareStatement.setInt(3, rollNo);
				  prepareStatement.setString(4, address);
				   
				  java.util.Date  date = new Date();
				  prepareStatement.setDate(5, new java.sql.Date(date.getTime()));
				  prepareStatement.executeUpdate();
				  System.out.println("Data inserted:");
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
   		     
        }
   		 
}
