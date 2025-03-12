package exam_27_dec_2023;

public class WeatherReportingSystem {

	public static void main(String[] args) 
	{
		WeatherReport  wp = new WeatherReport();
		wp.generateReport();
		wp.generateReport("India");
		wp.generateReport(2023, 12, 27);
		
		
		WeatherReport m = new HourlyReport();
		
		m.generateReport();
		m.generateReport("India");
		m.generateReport(2023, 12, 27);
		

	}

}
