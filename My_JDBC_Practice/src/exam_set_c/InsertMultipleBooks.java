package exam_set_c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMultipleBooks 
{
     
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);

		try(sc) {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","akib");
			 			 
			 while(true)
			 {
				 System.out.println("1.Insert book data.");
				 System.out.println("2.Exit.");
				 System.out.print("Enter option:");
				 int option = sc.nextInt();
				 switch(option)
				 {
				    case 1: 
                             System.out.print("Enter book id:");
                             int id = sc.nextInt();
                             System.out.print("Enter title of book:");
                             String title = sc.nextLine();
                             title = sc.nextLine();
                             System.out.print("Enter Author name:");
                             String  author = sc.nextLine();
                             System.out.print("Enter price:");
                             double price = sc.nextDouble();
                             
 				    	   String insertQuery="insert into book values (?,?,?,?)";
					       PreparedStatement  prepareStatement  = con.prepareStatement(insertQuery);
					 
					     prepareStatement.setInt(1,id);
					     prepareStatement.setString(2, title);
					     prepareStatement.setString(3, author);
					     prepareStatement.setDouble(4, price);
					     prepareStatement.executeUpdate();
					     System.out.println("Data insert successfully");
					     break;
				    case 2: System.exit(0); 
				             break;
				    default : 
				    	      System.err.println("Invalid option....");
				 }

			 }		
			 
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
}
