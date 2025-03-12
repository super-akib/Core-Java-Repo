package jdbc_task3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConnectionTest 
{
	  static final String DRIVER ="oracle.jdbc.driver.OracleDriver";
	  static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	  static final String USER_NAME = "System";
	  static final String PASSWORD = "akib";
	  
      public static void main(String[] args) 
      {
		   try{
			    Class.forName(DRIVER);
			    Connection connection  = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
 			    Statement  stmt  = connection.createStatement();
 			    ResultSet  rs = stmt.executeQuery("Select * from Employee ");
 			    
 			    ResultSetMetaData  metaData = rs.getMetaData();
 			    
 			     metaData.getColumnCount();
 			    
 			    while(rs.next())
 			    {
 			    	
 			       Employee emp = new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4));
 			    	getArrayList(emp);
 			    }
 			    
		     }
		     catch (ClassNotFoundException | SQLException e)
		     {
				e.printStackTrace();
		     }
		   
	  }
      
      public static void getArrayList(Employee emp)
      {
    	  List<Employee>  list = new ArrayList<>();
    	  list.add(emp);
    	  
    	  List<Employee> collect = list.stream().filter(emp1-> emp1.getAge()> 25).collect(Collectors.toList());
    	  collect.forEach(e -> System.out.println(e));
      }
}
