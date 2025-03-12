package jdbc_task8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataInEmployeeTable
{
	
	//Insertion logic method
	public static void insertData(Connection con)
	{
		
		//Insertion query 
		
		try (Statement stmt = con.createStatement()) {
			
			stmt.addBatch("insert into employee values(1, 'Naresh' ,22,23432.6)");
			stmt.addBatch("insert into employee values(2,'Suresh' ,23,32222.5)");
			stmt.addBatch("insert into employee values(3, 'Jain' ,32,43332.6)");
			stmt.addBatch("insert into employee values(4, 'David' ,27,15009.2)");
			stmt.addBatch("insert into employee values(5, 'Anthony' ,34,32322.5)");
		    
			stmt.executeBatch();
			System.out.println("Data inserted successfully..");
		} catch (SQLException e) {
			

			e.printStackTrace();
		}
		
		
		

		

		
	}
	
	// Main method
     public static void main(String[] args) {
    	 
    	 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","akib");
		    //data insertion method invked
			insertData(con);
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
		
	}
}
