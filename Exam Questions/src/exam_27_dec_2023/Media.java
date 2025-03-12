package exam_27_dec_2023;

public class Media 
{
   protected String title;
   protected  int duration;

   public Media(String title, int duration)
   {
	super();
	this.title = title;
	this.duration = duration;
   }

public String getTitle()
{
	return title;
}

public int getDuration()
{
	return duration;
}

 public Media getDetails()
 {
	 System.out.println("Title:"+title+" ,Durtation:"+duration);
	 
	 return new Media("xyz",2);
 }
   
}
