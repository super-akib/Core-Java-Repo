package exam_27_dec_2023;

public class HourlyReport extends WeatherReport
{
   @Override
	public void generateReport()
	{
		System.out.println("Generic Weather report");
	}
	
	public void generateReport(String location)
	{
		System.out.println("Generic Weather roport of:"+location);
	}
	public void generateReport(int year, int month, int day)
	{
		System.out.println("Generic weather report :Day:"+day+",Month"+month+",Year:"+year);
	}
}
