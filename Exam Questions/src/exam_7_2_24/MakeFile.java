package exam_7_2_24;

import java.io.File;
import java.io.IOException;

public class MakeFile 
{
   private String fileName;
   private File file;

   public MakeFile(String fileName)
   {
	super();
	this.fileName = fileName;
   }
   
   public String makeFile()throws IOException
   {
	   file = new File("D:\\JAVA27\\"+fileName);
	   if(file.createNewFile())
	   {
		   fileName = file.getName();
	   }
	   else
	   {
		   fileName = null;
	   }
	   return fileName;
   }
   
   
}
