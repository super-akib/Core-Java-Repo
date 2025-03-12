package lab_exam_20_march2024;

import java.util.Arrays;
import java.util.List;


public class Dublicates
{
      public static void main(String[] args)
      {
		   List<Integer>  list = Arrays.asList(1,2,3,4,2,1,5,6);
		   
		  list.stream().distinct().forEach(System.out::print);
		   
		 
	  }
}
