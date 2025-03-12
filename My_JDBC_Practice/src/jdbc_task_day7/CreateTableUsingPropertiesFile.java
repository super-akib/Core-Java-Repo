package jdbc_task_day7;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class CreateTableUsingPropertiesFile
{
     
	public static void main(String[] args) {
		
		Properties   property = new Properties();
		try {
			property.load(new FileInputStream("D:\\javapractice\\My_JDBC_Practice\\src\\jdbc_task_day7\\database.properties"));
		
		
		String url = property.getProperty("url");
		String userName = property.getProperty("user_name");
		String password = property.getProperty("password");
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,userName,password);
			
			
			Statement statement = con.createStatement();
			statement.execute("create table player_info(player_id number(4) primary key ,player_name varchar2(60)not null,images blob,birth date)");
			System.out.println("Player_info Table created successfully.....");
			
		} catch (ClassNotFoundException  | SQLException |IOException  e) {
			
			e.printStackTrace();
		}
		
		
	}
}
