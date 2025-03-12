package my_java_programs;

public class CircleAreaCalculator {
	
	public static void main(String []args) {
	float r =Float.parseFloat(args[0]);
	 float pi = 3.14f ,area=0;
			if(r>=2)
			{
			 area = pi*r*r;
			 System.out.printf("The area of circle with radius %.1f  is %.15f",r,area);
			    
			}else   System.out.println("Radius must be a non-negative numbe.");
	}
}
 //The area of circle with radius 2.0  is 12.560000419616700
