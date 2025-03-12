package exam_set_c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductUpdate 
{
     public static void main(String[] args) {
		
    	 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","akib");
			 
			 String updateQuery="update product set product_price = ? where product_id=?";
			 PreparedStatement  prepareStatement  = con.prepareStatement(updateQuery);
			 
			 prepareStatement.setDouble(1, 82883);
			 prepareStatement.setInt(2, 102);
			 
			 prepareStatement.executeUpdate();
			 System.out.println("Data update successfully");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
}
