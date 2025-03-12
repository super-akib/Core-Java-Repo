package jdbc_task_day4;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class DisplayStudentDataUsingProcedure {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "System";
		String password = "akib";

		Scanner scan = new Scanner(System.in);

		try (scan) {

			System.out.print("Enter student id:");
			int studentId = scan.nextInt();

			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, userName, password);
			CallableStatement call = con.prepareCall("{call displayStudent(?,?,?,?,?,?,?,?,?)}");

			call.setInt(1, studentId);
			call.registerOutParameter(2, Types.INTEGER);
			call.registerOutParameter(3, Types.VARCHAR);
			call.registerOutParameter(4, Types.VARCHAR);
			call.registerOutParameter(5, Types.INTEGER);
			call.registerOutParameter(6, Types.VARCHAR);
			call.registerOutParameter(7, Types.INTEGER);
			call.registerOutParameter(8, Types.VARCHAR);
			call.registerOutParameter(9, Types.INTEGER);
			//call.registerOutParameter(2, Types.VARCHAR);
			call.execute();
//				System.out.println("Student ID: " + rs.getInt("stuId"));
//				System.out.println("Roll No: " + rs.getInt("stuRollNo"));
				System.out.println("Name: " + call.getInt(2));
				//System.out.println("Name: " + call.getString(2));
//				System.out.println("Branch: " + rs.getString("student_branch"));
//				System.out.println("Address: " + rs.getString("student_homeno") + ", " + rs.getString("city") + ", "
//						+ rs.getString("pincode"));
//				System.out.println("Email: " + rs.getString("mailid"));
//				System.out.println("Phone: " + rs.getString("phone"));

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}
}
