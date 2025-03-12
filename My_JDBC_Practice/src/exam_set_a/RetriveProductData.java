package exam_set_a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveProductData 
{
    static final String JDBC_DRIVER ="oracle.jdbc.driver.OracleDriver";
    static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    static final String USER_NAME ="System";
    static final String PASSWORD ="akib";
    
    
    public static void main(String[] args)
    {
	    try {
			Class.forName(JDBC_DRIVER);
			Connection con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			
			Statement  stmt = con.createStatement();
			   ResultSet result = stmt.executeQuery("select * from product");
			   ResultSetMetaData  metaData = result.getMetaData();
			   int count = metaData.getColumnCount();
			   for(int i=1;i<=count;i++)
			   {
				   System.out.print(metaData.getColumnName(i)+"\t");
			   }
			   System.out.println();
			   while(result.next())
			   {
				   for(int i=1;i<=count;i++)
				   {
					   System.out.print(result.getString(i)+"\t");
				   }
				   System.out.println();
			   }
			
		} catch (ClassNotFoundException |SQLException e) {
		
			e.printStackTrace();
		}
	    
	}
}
