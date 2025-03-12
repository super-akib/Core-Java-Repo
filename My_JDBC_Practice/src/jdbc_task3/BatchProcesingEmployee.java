package jdbc_task3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BatchProcesingEmployee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try(scan){
            Class.forName(ConnectionTest.DRIVER);

            Connection connection = DriverManager.getConnection(ConnectionTest.URL,
                    ConnectionTest.USER_NAME, ConnectionTest.PASSWORD);

            System.out.print("Enter employee Id:");
            int empid = scan.nextInt();
            scan.nextLine(); // Consume newline character

            System.out.print("Enter employee name:");
            String empName = scan.nextLine();

            System.out.print("Enter employee Salary:");
            double salary = scan.nextDouble();
            scan.nextLine(); // Consume newline character

            System.out.print("Enter employee Address:");
            String empAddress = scan.nextLine();

            System.out.print("Enter employee mail-Id:");
            String mailId = scan.next();

            System.out.print("Enter employee Phone no.:");
            long phoneNo = scan.nextLong();

            String sql = "INSERT INTO employee_info VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setInt(1, empid);
            prepareStatement.setString(2, empName);
            prepareStatement.setDouble(3, salary);
            prepareStatement.setString(4, empAddress);
            prepareStatement.setString(5, mailId);
            prepareStatement.setLong(6, phoneNo);
            prepareStatement.addBatch();

            // Second PreparedStatement for update
            sql = "UPDATE employee_info SET empSalary = ?, empAddress = ? WHERE empid = ?";
            PreparedStatement pstmt2 = connection.prepareStatement(sql);
            pstmt2.setDouble(1, 4000.0);
            pstmt2.setString(2, "Japan");
            pstmt2.setInt(3, 3);
            pstmt2.addBatch();

            // Third Statement for delete
            sql = "DELETE FROM employee_info WHERE empSalary = (SELECT MAX(empSalary) FROM employee_info)";
            Statement stmt = connection.createStatement();
            stmt.addBatch(sql);

            prepareStatement.executeBatch();
            pstmt2.executeBatch();
            stmt.executeBatch();

            System.out.println("Batch processing completed..");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } 
    }
}
