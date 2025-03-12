package jdbc_task5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PerformOperationOnProducts 
{
	static Connection connection;
	static ResultSet result;
	static PreparedStatement pstmt;
	
	//insert product data
	public static void insertProducts(int productId,String productName,double price, int productQty)
	{
		String insertQuery = "insert into product values(?,?,?,?)";
		
		try {
		        pstmt  = connection.prepareStatement(insertQuery);
			
			pstmt.setInt(1, productId);
			pstmt.setString(2, productName);
			pstmt.setDouble(3, price);
			pstmt.setInt(4, productQty);
			
			pstmt.executeUpdate();
			
			System.out.println("Product details inserted successfully..");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "system";
		String password = "akib";
		Scanner scan = new Scanner(System.in);
		try (scan){
         			Class.forName(driver);
		      	 connection = DriverManager.getConnection(url,userName,password);
			
		    while(true)
			{
			    System.out.println("==================SELECT-OPTION================");
			    System.out.println("1.Insert productdetails into product table.");
			    System.out.println("2.Retrieve productdetails in forward direction.");
			    System.out.println("3.Retrieve productdetails in reverse direction.");
			    System.out.println("4.Retrieve 3rd record from top.");
			    System.out.println("5.Retrieve 3rd record from bottom.");
			    System.out.println("6.Exit.");
			    System.out.println("------------------------------------------------");
			    
			    System.out.print("\n Enter your option:");
			    int option = scan.nextInt();
			    
			    switch(option)
			    {
			         case 1:  System.out.print("Enter product id:");
			          		  int productId = scan.nextInt();
			                  
			          		  System.out.print("Enter product name:");
			                  String porductName = scan.nextLine();
			                  porductName = scan.nextLine();
			                  
			          		  System.out.print("Enter product price:");
			          		  double price = scan.nextDouble();
			          		  
			          		  System.out.print("Enter product quantity:");
			          		  int productQty = scan.nextInt();
			          		  
			          		  insertProducts(productId, porductName, price, productQty);
			          		  break;
			          		  
			         case 2:    
			        	        Statement statement = connection.createStatement();
			        	        String selectQuery ="select * from product ";
			        	        
			        	      result  = statement.executeQuery(selectQuery);
			        	      
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
			        	       break;
			         case 3:   
			        	    pstmt =connection.prepareStatement("SELECT * FROM Product", 
			        	    		 ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			                 result  =  pstmt.executeQuery();
			                 result.afterLast();
			                 
			        	       while(result.previous())
			        	       {
			       	    		   System.out.print(result.getInt(1)+"\t");
			       	    		   System.out.print(result.getString(2)+"\t");
			       	    		   System.out.print(result.getDouble(3)+"\t");
			       	    		   System.err.print(result.getInt(4)+"\t");
			       	    		   System.out.println();
			        	       }
			        	       break;
			        	       
			         case 4: 
			        	 String sqlQuery = "SELECT * FROM product"; 
			        	 pstmt = connection.prepareStatement(sqlQuery, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			        	           result.absolute(3);
			        	           while(result.next())
									{
			        	        	   System.out.print(result.getInt(1)+"\t");
				       	    		   System.out.print(result.getString(2)+"\t");
				       	    		   System.out.print(result.getDouble(3)+"\t");
				       	    		   System.err.print(result.getInt(4)+"\t");
				       	    		   System.out.println();
									}
			        	     break;
			         
			         case 5:
			        	    pstmt = connection.prepareStatement("SELECT * FROM Product", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			        	    result = pstmt.executeQuery();
			        	    result.afterLast(); 
			        	    while(result.relative(-2)) {
			     
			        	        System.out.println("ID: " + result.getInt(1) + ", Name: " + result.getString(2) +
			        	                ", Price: " + result.getDouble(3) + ", Quantity: " + result.getInt(4));
			        	    }
			        	    


		                    break;
		                    
			         case  6:   System.exit(0);      
		                default:
		                    System.out.println("Invalid option.");
		                    break; 	     
			    }
			    
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
