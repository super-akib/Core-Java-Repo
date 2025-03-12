package serialization_deserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StoreCustomerObject
{
     public static void main(String[] args) throws IOException
     {
	      FileOutputStream  fos = new FileOutputStream("D:\\JAVA27\\CustomerObject.csv");
	      ObjectOutputStream oos = new ObjectOutputStream(fos);
	      Scanner scan = new Scanner(System.in);
          try(fos;oos;scan)
          {
        	  System.out.print("Enter number of Object we want to:");
        	  int numberOfObject = scan.nextInt();
        	  for(int i=1;i<=numberOfObject; i++)
        	  {
        		  Customer  customerObj =  Customer.getCustomerObject();
        		  oos.writeObject(customerObj);
        	  }
          }
          catch(IOException e)
          {
        	  e.printStackTrace();
          }
          System.out.println("Customer Object Store Sucessfully..");
     }
}
