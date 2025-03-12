package exam_27_dec_2023;

public class Video  extends Media
{
   protected String formate;

public Video(String title, int duration, String formate) 
{
	super(title, duration);
	this.formate = formate;
}
   @Override
   public Video getDetails()
   {   
	   System.out.println("Title:"+super.title+", Duration:"+super.duration+", Formate:"+formate);
	   return new Video("abc",4,"mp4");
   }
}
