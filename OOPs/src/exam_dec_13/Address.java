package exam_dec_13;

public class Address
{
  
	private int roadNumber;
	private String cityName;
	private String districtName;
	
	public Address(int roadNumber, String cityName, String districtName)
	{
		super();
		this.roadNumber = roadNumber;
		this.cityName = cityName;
		this.districtName = districtName;
	}

	public int getRoadNumber()
	{
		return roadNumber;
	}

	public void setRoadNumber(int roadNumber) 
	{
	
		this.roadNumber = roadNumber;
	}

	public String getCityName()
	{
		return cityName;
	}

	public void setCityName(String cityName)
	{
		this.cityName = cityName;
	}

	public String getDistrictName()
	{
		return districtName;
	}

	public void setDistrictName(String districtName) 
	{
		this.districtName = districtName;
	}

	@Override
	public String toString() 
	{
		return "Adress [roadNumber=" + roadNumber + ", cityName=" + cityName + ", districtName=" + districtName + "]";
	}
	
	
	
	
	
}
