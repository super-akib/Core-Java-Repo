package my_java_programs;

public class Calculator {
    public static void main(String[] args) {	        

        // Define Two numbers
        float x , y;
        x = Float.parseFloat(args[0]);
        y = Float.parseFloat(args[1]);
         // Perform addition
        float sum = x+y;
        System.out.println(sum);
        // Perform subtraction 
        float sub = x-y;
        System.out.println(sub);
        // Perform multiplication 
        float mul = x*y;
        System.out.println(mul);
       
        if(x>0 && y>0){
        	float division = x/y;
            System.out.println(division);
          }
        else {
        System.out.println("Division by zero is not allowed.");
        }
    }
}
