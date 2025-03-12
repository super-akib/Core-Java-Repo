package jdbc_task2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class CustomerLogin
{
	private Connection connection;
	private PreparedStatement prepareStatement;
	private ResultSet rs;
	
	
	public CustomerLogin(Connection connection)
	{
	   this.connection = connection;	
	}
	
    public void customerLogin()
    {     
    	Scanner scan = new Scanner(System.in);
          try(scan)
          {
        	  
        	  System.out.print("Enter customer name:");
        	  String customerName = scan.nextLine();
        	  
        	  System.out.print("Enter password:");
        	  String password = scan.next();
        	  String sql ="select * from customerinfo where (customername =? AND password=?)";
        	  prepareStatement = connection .prepareStatement(sql);
        	  
        	  prepareStatement.setString(1, customerName);
        	  prepareStatement.setString(2, password);
        	  
        	    this.rs = prepareStatement.executeQuery();
        	  
        	  if(rs.next())
        	  {
        		  System.out.println("Customer login Successfully..");
        		  opration();
        		  
        	  }
        	  else
        	  {
        		  System.err.println("! Invalid process");
        	  }
          }
          catch(Exception e)
          {
        	  e.printStackTrace();
          }
          
    }
    
    public void opration()
    {
    	System.out.println("=====================Select-Option========================\n");
    	System.out.println("1.Show all Customers.");
    	System.out.println("2.Update customer mailid/phone no. base on id.");
    	System.out.println("3.Delete  Customer whose name start with's'.");
    	System.out.println("4.Show those Customer whose id is even.");
    	System.out.println("5.Exit.");
    	System.out.println("========================================================\n");
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter your choice:");
    	int choice = sc.nextInt();
    	switch(choice)
    	{
    	    case  1: 
			        try { 
			        	  prepareStatement = connection.prepareStatement("SELECT * FROM customerInfo");
			        	  rs = prepareStatement.executeQuery();
				          ResultSetMetaData  data =rs.getMetaData();
				           
				              int columnCount = data.getColumnCount();
                            for(int i=1;i<=columnCount;i++)
                            {
                            	System.out.print(data.getColumnName(i)+"    ");
                            }
                            System.out.println("\n-------------------------------------------------------------------"
                            		+ "-------------------------------");
                            while(rs.next())
                            {
                            	for(int i=1;i<=columnCount;i++)
                            	{
                            		System.out.print("  "+rs.getString(i)+"  |  ");
                            	}
                            	System.out.println();
                            }
			           } 
			            catch (SQLException e) 
			            {
			        	 e.printStackTrace();
			            }
			         break;
			 //Case:2
    	    case 2:
    	        System.out.println("Enter customer id to update:");
    	        Integer id = sc.nextInt();
    	        System.out.print("Enter new mail id:");
    	        String mailId = sc.next();
    	        System.out.println("Enter phone number:");
    	        Long phoneNumber = sc.nextLong();
    	        try {
    	            prepareStatement = connection.prepareStatement("UPDATE customerInfo set MAILID =?,PHNUMBER=? WHERE CUSTOMERID=?");
    	            prepareStatement.setString(1, mailId);
    	            prepareStatement.setLong(2, phoneNumber);
    	            prepareStatement.setInt(3, id);
    	            prepareStatement.executeUpdate();
    	            System.out.println("Customer Details updated..");
    	        } catch (SQLException e) {
    	            e.printStackTrace();
    	        }
    	        break;

			   
    	    case 3:  
    	    	try {
    	    	    PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM customerInfo WHERE customername LIKE 's%'");
    	    	    int rowsAffected = preparedStatement.executeUpdate();
    	    	    System.out.println(rowsAffected + " rows deleted.");
    	    	} catch (SQLException e) {
    	    	    e.printStackTrace();
    	    	}

    	    	   break;
    	    case 4:
    	        try {
    	            prepareStatement = connection.prepareStatement("SELECT * FROM customerInfo WHERE MOD(CUSTOMERID, 2) = 0");
    	            rs = prepareStatement.executeQuery();
    	            ResultSetMetaData metaData = rs.getMetaData();
    	            int columnCount = metaData.getColumnCount();
    	            for (int i = 1; i <= columnCount; i++) {
    	                System.out.print(metaData.getColumnName(i) + "    ");
    	            }
    	            System.out.println("\n-------------------------------------------------------------------"
                    		+ "-------------------------------");
    	            while (rs.next()) {
    	                for (int i = 1; i <= columnCount; i++) {
    	                    System.out.print("  "+rs.getString(i) + "  |  ");
    	                }
    	                System.out.println();
    	            }
    	        } catch (SQLException e) {
    	            e.printStackTrace();
    	        }
    	        break;

    	    case 5: sc.close();
    	    	    System.exit(0);
    	    	 break;
    	    default : 
    	    	      System.err.println("!!Invalid option...");
    	}
    }
    
}
    
    