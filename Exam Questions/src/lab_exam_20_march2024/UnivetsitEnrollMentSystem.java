package lab_exam_20_march2024;

import java.util.HashMap;
import java.util.List;

public class UnivetsitEnrollMentSystem
{
     
	 public static void main(String[] args) 
	 {
		 University.Student  st1 = new University().new Student("A104","JAVA");
		 University.Student  st2 = new University().new Student("A105","JAVA");
		 University.Student  st3 = new University().new Student("A102","Python");
		 University.Student  st4 = new University().new Student("A103","C");
		 
		 University  u1 = new University();
		 
		 u1.enrollStudent(st1.getStudentId(), st1.getCourses());
		 u1.enrollStudent(st2.getStudentId(), st2.getCourses());
		 u1.enrollStudent(st3.getStudentId(), st3.getCourses());
		 u1.enrollStudent(st4.getStudentId(), st4.getCourses());
		 
		 HashMap<String,List<String>>  map = u1.enrollment;
		 
		 System.out.println(map);
		 
		 
	 }
} 
