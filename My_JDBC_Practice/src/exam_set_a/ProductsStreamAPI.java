package exam_set_a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductsStreamAPI
{
	public static final String JDBC_DRIVER ="oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER_NAME ="System";
	public static final String PASSWORD ="akib";
	
	 public  static class product
	   {
		  private  int id;
		  private  String name;
		  private  double price;
		  
		public product(int id, String name, double price) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
		}
		

		@Override
		public String toString() {
			return "product [id=" + id + ", name=" + name + ", price=" + price + "]";
		}
	 }
	 
	 public static void main(String[] args) {
			List<product> list = new ArrayList<product>();
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				 Connection  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","akib");
				 
				 Statement  stmt = con.createStatement();
				 
				 ResultSet  rs = stmt.executeQuery("select * from product");
				 
				 
				 
				 while(rs.next())
				 { 
		        	 product  in = new product(rs.getInt(1), rs.getString(2),  rs.getDouble(3));
						 list.add(in);
				 }
				 
				   List<product> collect = list.stream().filter(p->isArmstrong(p.id)&& (p.price>=1000 && p.price<=5000)).collect(Collectors.toList());
			   System.out.println(collect);
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			
		  }
	    public static boolean isArmstrong(int id)
		{
	       int 	sum = 0;
	       int digit;
	       int temp = id;
	       while(id!=0)
	       {
	    	   digit =  id%10;
	    	   sum += digit*digit*digit;
	    	   
	    	   id /=10;
	    	   
	       }
			return temp == sum;
		}  
}
