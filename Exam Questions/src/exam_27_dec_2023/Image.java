package exam_27_dec_2023;

public class Image extends Media
{
  protected String resolution;

public Image(String title, int duration, String resolution) 
{
	super(title, duration);
	this.resolution = resolution;
}
    
   @Override
   public Image getDetails()
   {
	   System.out.println("Title:"+super.title+", Duration:"+super.duration+", Resolution:"+resolution);
	  return new Image("xyz",2,"1280p");
   }
  
}
