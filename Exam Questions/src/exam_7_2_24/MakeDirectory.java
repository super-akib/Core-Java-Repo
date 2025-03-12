package exam_7_2_24;

import java.io.File;

public class MakeDirectory 
{
     private String dirName;
     private File  file;
     public MakeDirectory(String dirName)
     {
    	 super();
    	 this.dirName = dirName;
     }
     
     public String dir()
     {
    	 try
 	    { 
 	    	File  file = new File("D:\\JAVA27\\"+dirName); 
 	        if(file.exists())
 	       {
 	        	return null;
 	       }
 	       else
 	       { 
 	    	   if(file.mkdirs())
 	       	    	dirName = file.getName();
 	       }	   
 	     }
 	     catch(Exception e)
 	    {
 	    	 System.err.println(e);
 	    }
    	 return dirName;
     } 	 
}
