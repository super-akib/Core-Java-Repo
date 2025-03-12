package nov20_lab;
import java.util.Scanner;
public class TemperatureConversion {
	public static void main(String[] args) {
       float temp,celsius,fahrenheit;
       char ch;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Tempreture Number:");
       temp = sc.nextFloat();
       System.out.print("Enter Conversion type:");
       ch = sc.next().charAt(0);
       if(ch=='C'|| ch=='c')
          ch='c';
        else if(ch=='F'||ch=='f')
          ch='f';
       switch(ch)
       {
           case 'c': celsius = (temp-32)*5/9f;
                        System.out.println(temp+" F fahrenheit  to Celsius is:"+celsius+" C");
                        break;
            case 'f': fahrenheit = ((9*temp)/5f)+32; 
                         System.out.println(temp+" C  Celsius to Fahrenheit is:"+fahrenheit+" F");
                        break;
           default : System.out.println("Invalid Coversion Choose..");break;
       }                
       
		sc.close();
	}

}

