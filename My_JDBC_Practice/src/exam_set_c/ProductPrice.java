package exam_set_c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ProductPrice
{
   static class product
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
	
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	  
	   
   }
   
   public static void main(String[] args) {
	List<product> list = new ArrayList<ProductPrice.product>();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","akib");
		 
		 Statement  stmt = con.createStatement();
		 
		 ResultSet  rs = stmt.executeQuery("select * from product");
		 
		 
		 
		 while(rs.next())
		 { 
        	 ProductPrice.product  in = new product(rs.getInt(1), rs.getString(2),  rs.getDouble(3));
				 list.add(in);
		 }
		 
		   List<product> collect = list.stream().filter(p-> getPrimeNumber(p.price)&&p.price>=25000).collect(Collectors.toList());
	       System.out.println(collect);
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}	
  }
   
   public static boolean getPrimeNumber(double price)
   {
	   int count =0;
	   for(int i=2;i<=price/2;i++)
	   {
		   if(price%i ==0)
		   {
			   count++;
		   }
	   }
	   if(count==0)
	   {
		   return true;
	   }
	   return false;
   }
}  
