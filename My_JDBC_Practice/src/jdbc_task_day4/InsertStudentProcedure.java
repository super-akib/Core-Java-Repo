package jdbc_task_day4;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertStudentProcedure {
    public static void main(String[] args) {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String userName = "System";
        String password = "akib";

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter student ID:");
            int studentId = sc.nextInt();

            System.out.print("Enter student roll no.:");
            int rollNo = sc.nextInt();

            sc.nextLine(); // Consume the newline character

            System.out.print("Enter student name:");
            String studentName = sc.nextLine();

            System.out.print("Enter student branch:");
            String branch = sc.nextLine();

            System.out.print("Enter student mail-id:");
            String mailId = sc.next();

            System.out.print("Enter student phone no.:");
            long phNo = sc.nextLong();

            System.out.print("Enter home no.:");
            int homeNumber = sc.nextInt();

            System.out.print("Enter city name:");
            String city = sc.next();

            System.out.print("Enter pincode no.:");
            int pincode = sc.nextInt();

            Class.forName(driver);
            try (Connection connection = DriverManager.getConnection(url, userName, password)) {
                String procedure = "{call insertStudent(?,?,?,?,?,?,?,?,?)}";
                CallableStatement call = connection.prepareCall(procedure);
                call.setInt(1, studentId);
                call.setInt(2, rollNo);
                call.setString(3, studentName);
                call.setString(4, branch);
                call.setString(5, mailId);
                call.setLong(6, phNo);
                call.setInt(7, homeNumber);
                call.setString(8, city);
                call.setInt(9, pincode);
                call.executeUpdate();
                System.out.println("Student data inserted Successfully...");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
