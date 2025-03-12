package jdbc_task_day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class StructureOfStudent_info {
       
	public static void main(String[] args) {
		Connection con = null;
		 try {
			 
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","akib");
		      
			  Statement  stmt = con.createStatement();
			     ResultSet   rs = stmt.executeQuery("select * from student_info");
			  
			 ResultSetMetaData  metaData = rs.getMetaData();
			 int count = metaData.getColumnCount();
			 System.out.println("Present Columns Names are: ");
			 for(int i=1;i<=count;i++)
			 {
				 System.out.println(metaData.getColumnName(i)+" column data-type :  "+metaData.getColumnTypeName(i));
			 }
			 System.out.println();
			 System.out.println("No. of columns present in table :"+count);
			
			 	      
		        
		      con.close();
		      
		 } catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
			try {
				if(con != null)
				{
					con.close();
				}
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
