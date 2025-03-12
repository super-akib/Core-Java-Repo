package jdbc_task_day7;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProgramToMetaData 
{
     public static void main(String[] args)
     {
    	 Connection con = null;
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","akib");
		      DatabaseMetaData  metaData = con.getMetaData();
		      
		      String productName = metaData.getDatabaseProductName();
		      System.out.println("Producte Name:"+productName);
		      
		      String productVersion = metaData.getDatabaseProductVersion();
		      System.out.println("Producte version:"+productVersion);
		      
		      String driverName = metaData.getDriverName();
		      System.out.println("Driver Name:"+driverName);
		      
		      int maxColumn =  metaData.getMaxColumnsInTable();
		      System.out.println("Max columns in Table:"+maxColumn);
		      
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
