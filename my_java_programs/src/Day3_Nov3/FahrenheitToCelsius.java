package Day3_Nov3;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
	float f , c;
	f = Float.parseFloat(args[0]);
	c = (f-32)*5/9;
	System.out.println("Given Temperature in Fahrenheit:"+f);
	System.out.println("Themperature in Celsius:"+c);
	}

}
