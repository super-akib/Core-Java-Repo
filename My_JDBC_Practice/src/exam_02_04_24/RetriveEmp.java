package exam_02_04_24;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveEmp {
    public static void main(String[] args) throws IOException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "akib");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select resume from emp_info where empid = 101");

            Reader characterStream = rs.getCharacterStream(1);

            FileWriter fw = new FileWriter("C:\\Users\\YourUsername\\Desktop\\emp.txt");
            System.out.println("File transfer successfully..");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
