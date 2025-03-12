package one_file_data_copie_in_multiple_files;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo 
{
    public static void main(String args[])  throws Exception
    {
    	FileInputStream  fin  = new FileInputStream("D:\\JAVA27\\file1.txt");
    	FileOutputStream fout1  = new FileOutputStream("D:\\JAVA27\\file2.txt");
    	FileOutputStream fout2  = new FileOutputStream("D:\\JAVA27\\file3.txt");
    	
    	ByteArrayOutputStream  bout = new ByteArrayOutputStream();
    	
    	try(fin;fout1;fout2;bout)
    	{
    		int i ;
    		while((i=fin.read())!=-1)
    		{
    			bout.write((byte)i);
    		}
    		bout.writeTo(fout1);
    		bout.writeTo(fout2);
    		bout.flush();
    	}
    	catch(IOException e)
    	{
    		System.err.println(e.getMessage());
    	}
    	System.out.println("Data sucessfully copy in files.....");
    }
}  
