package exam_27_dec_2023;

public class MultimediaSystem 
{

	public static void main(String[] args)
	{    
		Media media = new Image("ABC",4,"1280p");
		
        Media  m1 = new Video("XYZ",2,"MP4");
        
        m1.getDetails();
	}

}
