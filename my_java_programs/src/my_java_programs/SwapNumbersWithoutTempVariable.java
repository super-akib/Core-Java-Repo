package my_java_programs;

public class SwapNumbersWithoutTempVariable {
   public static void main(String args[]) {
	   int a ,b;
	   if(args.length==2) {
	   a = Integer.parseInt(args[0]);
	   b = Integer.parseInt(args[1]);
	   System.out.println("Orignal Value:"+"num1="+a+" num2="+b);
	   a = a+b;
	   b = a-b;
	   a = a-b;
	   System.out.println("Swaped Value:"+"num1="+a+" num2="+b);
	  }else System.out.println("Usage: java SwapNumbersWithoutTempVariable <num1> <num2>");
   }
}
