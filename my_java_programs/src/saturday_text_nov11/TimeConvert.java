package saturday_text_nov11;

public class TimeConvert {
    public static void secondConvertion(int sec)
    {
       int 	minute ,hours,totalSecond;
       hours = sec/3600;
       minute = (sec/60)%60;
       totalSecond = sec/60;
       System.out.println("Hours:"+hours);
       System.out.println("Minutes:"+minute);
       System.out.println("Second:"+totalSecond);
    }
	public static void main(String[] args) {
		int second;
		second = Integer.parseInt(args[0]);
		secondConvertion(second);
		
	}

}
