package jdbc_task2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CustomerRegistration
{
     private Connection connection;
     
     public CustomerRegistration (Connection connection)
     {
    	 this.connection = connection;
     }
     
     public void customerRegistration()
     {
    	 Scanner scan = new Scanner(System.in);
    	 
    		System.out.print("Enter customer Id:"); 
    		Integer customerId = scan.nextInt();
    		
    		System.out.print("Enter Customer Name:");
    		String customerName = scan.nextLine();
    		customerName = scan.nextLine();
    		
    		System.out.print("Enter Password:");
    		String password = scan.next();
    		
    		System.out.print("Enter First-name:");
    		String firstName = scan.next();
    		
    		System.out.print("Enter Lasr-name:");
    		String lastName = scan.next();
    		
    		System.out.print("Enter Mail Id:");
    		String mailId = scan.next();
    		
    		System.out.print("Enter mobile number:");
    		Long phoneNumber = scan.nextLong();
    		
    		getRegistrationData(customerId, customerName, password, firstName, lastName, mailId, phoneNumber);
    		scan.close();
         }
     
     public void getRegistrationData(Integer customerId,String customerName,
    		 String password,String firstName,String lastName,String mailId,Long phoneNumber)
     {
    	 String sql ="INSERT INTO customerInfo VALUES (?,?,?,?,?,?,?)";
        try {
			
        	PreparedStatement  prstmt = connection.prepareStatement(sql);
        	
        	prstmt.setInt(1, customerId);
        	prstmt.setString(2, customerName);
        	prstmt.setString(3,password );
        	prstmt.setString(4,firstName );
        	prstmt.setString(5,lastName);
        	prstmt.setString(6,mailId);
        	prstmt.setLong(7, phoneNumber);
        	
        	prstmt.executeUpdate();
        	System.out.println("Register successfully..");
        } 
        catch (SQLException e) {
			
			e.printStackTrace();
		}
     }
     
    
}
