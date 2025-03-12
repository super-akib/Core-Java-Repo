package exam_dec_13;

public class Faculty
{
    private int facultyId;
    private String facultyName;
    private double salary;
    private Address  address2;
	
    public Faculty(int facultyId, String facultyName, double salary, Address address2)
	{
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.salary = salary;
		this.address2 = address2;
	}

	public int getFacultyId()
	{
		return facultyId;
	}

	public void setFacultyId(int facultyId)
	{
		this.facultyId = facultyId;
	}

	public String getFacultyName() 
	{
		return facultyName;
	}

	public void setFacultyName(String facultyName) 
	{
		this.facultyName = facultyName;
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

	public Address getAddress2() 
	{
		return address2;
	}

	public void setAddress2(Address address2)
	{
		this.address2 = address2;
	}

	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", salary=" + salary + ", address2="
				+ address2 + "]";
	}
    
	
    
    
}
