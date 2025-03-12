package exam_7_2_24;

public class Test1 
{
     public static void main(String[] args)
     {
		  try
		  {
			   MakeDirectory md = new MakeDirectory("Demo1");
			   MakeFile mf = new MakeFile("Exam1.txt");
			   DeleteFile  delete = new DeleteFile("Exam1");
			   System.out.println("Drectory name is:"+md.dir());
			   System.out.println("File name is:"+mf.makeFile());
			   //System.out.println("File Deleted:"+delete.deleteFile());
		  }
		  catch(Exception e)
		  {
			  System.err.println(e);
		  }
	 }
}
