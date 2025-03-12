package Day6_Lab;
import java.util.Scanner;
public class FindVowel {
 public static boolean Checkchar(char ch)
 {   
	 if(ch>='A'&& ch<='Z')
	 ch +=32;
	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	 {
	   return true;	 
	 }else
	 {
		 return false;
	 }
 }
 public static void main(String args[])
 { 
	 char alpha;
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter Alphabet:");
	 alpha = sc.next().charAt(0);
	 boolean result;
	 result = Checkchar(alpha);
	 if(result)
	 {
		 System.out.println("Vowel");
	 }else
	 {
		 System.out.println("Consonant");
	 }
	 sc.close();
	 
 }
}
