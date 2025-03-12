package my_java_programs;

public class SumAndAverageCalculator {
  public static void main(String args[]) {
	  float x ,y ,z, sum, avg;
	  if(args.length==3) {
	  x = Float.parseFloat(args[0]);
	  y = Float.parseFloat(args[1]);
	  z = Float.parseFloat(args[2]);
	  sum = x+y+z;
	  avg = sum/3;
	  System.out.println("Sum of the Three numbers is:"+sum);
	  System.out.println("Average of the three number :"+avg);
	  }else System.out.println("Usage: java SumAndAverageCalculator <num1> <num2> <num3>");
  }
}
