package exam_dec_13;

public class Student 
{
     private int studentId;
     private String studentName;
     private String course;
     private Address address;  //Has-a relation
	
     public Student(int studentId, String studentName, String course, Address address) 
	 {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.address = address;
	}

	public int getStudentId()
	{
		return studentId;
	}

	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}

	public String getStudentName() 
	{
		return studentName;
	}

	public void setStudentName(String studentName)
	
	{
		this.studentName = studentName;
	}

	public String getCourse()
	{
		return course;
	}

	public void setCourse(String course)
	{
		this.course = course;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	@Override
	public String toString()
	{
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", course=" + course + ", address="
				+ address + "]";
	}
     
     
     
     
     
}
