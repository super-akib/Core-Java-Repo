package jdbc_task2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CustomerLoginAndRegistration 
{  
	private static final String DRIVER ="oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_NAME = "System";
	private static final String PASSWORD ="akib";
   
	public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in);
		try (scan){
			Class.forName(DRIVER);
			Connection connection = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
	
				System.out.println("Select-Option:\n=============");
				System.out.println("1.Login.");
				System.out.println("2.Registration.");
				System.out.println("================\n");
				System.out.print("Enter option:");
				int option = scan.nextInt();
				switch(option)
				{
				   case 1:  new CustomerLogin(connection).customerLogin();
				            break;
				   case 2:  new CustomerRegistration(connection).customerRegistration();
				            break;
				   default : 
					        System.err.println("!! invalid option");
				}
			
		} catch (SQLException |ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	 }
}
