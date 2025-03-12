package serialization_deserialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class RetrieveCustomerObject
{
      public static void main(String[] args) throws Exception
      {
		FileInputStream fileInputStream = new FileInputStream("D:\\\\JAVA27\\\\CustomerObject.txt");
    	ObjectInputStream  objectInputStream = new ObjectInputStream(fileInputStream);
    	Customer customerObj = null;
    	try(fileInputStream;objectInputStream)
    	{
    	  while((customerObj=(Customer)objectInputStream.readObject())!= null)
    	  {
    		  System.out.println(customerObj);
    	  }
    	}
    	catch(EOFException e)
    	{
    		System.err.println("End Of File Exception...");
    	}
	  }
}
