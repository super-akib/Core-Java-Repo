package nov11_LabDay12;
import java.util.Scanner;
public class VowelOrConsonantUsingSwitch {

	public static void main(String[] args) {
		char ch,temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character:");
		ch = sc.next().charAt(0);
		temp=ch;
		if(ch>='A' && ch<='Z')
			ch+=32;
		if(ch>='a'&&ch<='z')
		{	
		  switch(ch)
		  {
		    case 'a': System.out.println("The character "+temp+" is a vowel.");break;
		    case 'e': System.out.println("The character "+temp+" is a vowel.");break;
		    case 'i': System.out.println("The character "+temp+" is a vowel.");break;
		    case 'o': System.out.println("The character "+temp+" is a vowel.");break;
		    case 'u': System.out.println("The character "+temp+" is a vowel.");break;
		    default : System.out.println("The character "+temp+" is a Consonant.");break;
		  }
		    
		 }else
		     System.out.println("Invalid alphabet.");
		System.out.println("UNICODE value is:"+(int)temp);
		  sc.close();

	}

}
