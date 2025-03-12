package exam_set_c;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

    static final String USER = "system";
    static final String PASS = "akib";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        List<Inventory>  list = new ArrayList<>();
        
        try {
            Class.forName(JDBC_DRIVER );
            System.out.println("Connecting to database...");
            
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT book_id, titel, author, price FROM book";
            ResultSet rs = stmt.executeQuery(sql);

            // Fetching data from result set and transforming using Stream API
             rs.getMetaData();
			
			 while(rs.next())
			 {
				 	 Inventory  in = new Inventory(rs.getInt(1), rs.getString(2),  rs.getString(3), rs.getDouble(4));
					 list.add(in);
				 
			 }

          list.stream() .map(Main::reverseAuthorAndCapitalize)
                    .forEach(System.out::println);

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    // Reverse author name and make first and last letter capital
    static Inventory reverseAuthorAndCapitalize(Inventory inventory) {
        String reversedAuthor = new StringBuilder(inventory.author).reverse().toString();
        String firstLetterCapitalized = reversedAuthor.substring(0, 1).toUpperCase();
        String lastLetterCapitalized = reversedAuthor.substring(reversedAuthor.length() - 1).toUpperCase();
        String middle = reversedAuthor.substring(1, reversedAuthor.length() - 1);
        return new Inventory(inventory.bookId, inventory.title, firstLetterCapitalized + middle + lastLetterCapitalized, inventory.price);
    }

    // Static inner class for Inventory
    static class Inventory {
        int bookId;
        String title;
        String author;
        double price;

        public Inventory(int bookId, String title, String author, double price) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Inventory{" +
                    "bookId=" + bookId +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    
    
}