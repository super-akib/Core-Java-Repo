package exam_7_2_24;

import java.io.File;

public class DeleteFile
{
    private String fileName;
    private File file;
	
    
    public DeleteFile(String fileName)
    {
		super();
		this.fileName = fileName;
	}
    
    public String deleteFile()
    { 
    	file = new File("D:\\JAVA27\\"+fileName);
    	if(file.exists())
    	{ 
    		fileName = file.getName();
    		file.delete();
    	}
    	else
    	{
    		fileName = null;
    	}
    	return fileName;
    }
    
	
}
