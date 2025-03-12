package lab_exam_20_march2024;

import java.util.Arrays;
import java.util.List;

public class TestEmployee
{
    public static void main(String[] args) 
    {
		  List<Employee>  list = Arrays.asList(new Employee("Mike",54000.0),
				  new Employee("Jake",44000.0),new Employee("Jhon",64000.0),new Employee("Tom",34000.0));
	
             list.stream().forEach(System.out::println);
    }
    
}
