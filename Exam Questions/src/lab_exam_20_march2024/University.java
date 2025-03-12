package lab_exam_20_march2024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class University 
{
	HashMap<String,List<String>>   enrollment =  new HashMap<>();
	List<String> listOfStudent = new ArrayList<>();
	
	public  class Student
	{
		private String studentId ;
		private String  courses ;
		
		public Student(String studentId, String courses) {
			super();
			this.studentId = studentId;
			this.courses = courses;
		}

		public String getStudentId() {
			return studentId;
		}

		public void setStudentId(String studentId) {
			this.studentId = studentId;
		}

		public String getCourses() {
			return courses;
		}

		public void setCourses(String courses) {
			this.courses = courses;
		}
		
						
	}
	
	
	
	public void enrollStudent(String studentID, String courseName)
	{
		listOfStudent.add(studentID);
		enrollment.put(courseName,listOfStudent );
	}
	
	
	
	
}
