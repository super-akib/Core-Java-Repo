package jdbc_task_day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class OnlineBankingSystem 
{ 
	//Class variable for Connection
	private static Connection connection;
	private static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_NAME="banking_system";
	private static final String PASSWORD="bank";
   /*=========================================================================================*/ 
   
	//Method created for getting current balance of Sender/receiver
	public static double getAccountBalance(Connection con, int accountNo) {
	    String selectQuery ="select acount_balance from accounts where account_number=?";
	    double balance = 0.0;
	    try {
	        PreparedStatement prepareStatement = con.prepareStatement(selectQuery);
	        prepareStatement.setInt(1, accountNo);
	        ResultSet result = prepareStatement.executeQuery();
	        if (result.next()) {
	            balance = result.getDouble(1);
	        } else {
	            throw new SQLException("Account No: " + accountNo + " not found");
	        }
	    } catch(SQLException e) {
	        System.err.println(e);
	    }
	    return balance;
	}

	
	//Method for updating the account balance for both the users
	public static void updateAccountBalance(Connection con, double balance, int accountNo) throws SQLException {
	    String updateQuery = "update accounts set acount_balance=? where account_number=?";
	    PreparedStatement prepareStatement = con.prepareStatement(updateQuery);
	    prepareStatement.setDouble(1, balance);
	    prepareStatement.setInt(2, accountNo);
	    prepareStatement.executeUpdate();
	}

	
	//Main method 
	public static void main(String []args)
    {
    	Scanner sc = new Scanner(System.in);
    	try(sc)
    	{   
    		//Connection Established
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    		connection = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
    		
    		//innitialize values for sender ,receiver and transferAmount variables  
    		System.out.print("Enter Sender Acc.No:");
    		int senderAccount = sc.nextInt();
    		
    		System.out.print("Enter Reciver Acc.No:");
    		int receiverAccount = sc.nextInt();
    		
    		System.out.print("Enter transfer Amount:Rs.");
    		double transferAmount = sc.nextDouble();
    	   
    	   connection.setAutoCommit(false);	
    		try{
    			//getting sender account balance
    			double senderBalance = getAccountBalance(connection, senderAccount);
    			  			
    			if(senderBalance<transferAmount)
    			 {
    				 throw new SQLException("! Insufficeint Balance");
    			 }
    			  //Update sender account balance
    			  double newBalance = senderBalance-transferAmount;
    			  updateAccountBalance(connection, newBalance, senderAccount);
    			  
    			  
    			//getting receiver account balance
      			double receiverBalance = getAccountBalance(connection, receiverAccount);
      			//update receiver account balance  
    
      			newBalance = receiverBalance + transferAmount;
                 updateAccountBalance(connection, newBalance, receiverAccount);  			
      			
      			connection.commit();
      			System.out.println("Transaction sccessfully..");
    		}
    		catch(Exception e)
    		{
    			System.err.println(e);
    		}
    		
    		
    	}
    	catch(Exception e)
    	{
    		System.err.println("! Transaction faild.....");
    		e.printStackTrace();
    		try {
    			connection.close();
    		}
    		catch(SQLException sqlexception)
    		{
    			sqlexception.printStackTrace();
    		}
    	}
    }
    
}
