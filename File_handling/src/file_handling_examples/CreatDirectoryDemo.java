
package file_handling_examples;

import java.io.File;

public class CreatDirectoryDemo
{

	public static void main(String[] args)
	{
	    try
	    { 
	    	File  file = new File("D:\\JAVA27"); 
	        if(file.exists())
	       {
	        	System.out.println("All ready directory available...");
	       }
	       else
	       { 
	    	   if(file.mkdirs())
	       	    	 System.out.println("Directory Name:"+file.getName());
	       }	   
	     }
	     catch(Exception e)
	    {
	    	 System.err.println(e);
	    }

	}

}
