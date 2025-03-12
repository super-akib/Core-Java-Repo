package file_handling_examples;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferOutPutStreamDemo
{
   public static void main(String[] args) throws IOException
   {
	    BufferedOutputStream bufferObject = new BufferedOutputStream(new FileOutputStream("D:\\JAVA27\\hello.txt"));
	    Scanner sc = new Scanner(System.in);
	    try(bufferObject;sc)
	    {  
	    	System.out.print("Write your feedback: ");
	    	String feedback = sc.nextLine(); 
	    	byte byteArr[] = feedback.getBytes();
	    	
	    	bufferObject.write(byteArr);
	    	System.out.println("Your FeedBack Sucessfully Sumited...");
	    }
	    catch(IOException e)
	    {
	    	System.err.println(e);
	    }
   }
}
