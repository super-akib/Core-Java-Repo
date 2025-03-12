package Day3_Nov3;

public class UperToLowerCase {
 public static void main(String args[]) {
	 char ch ;
	 ch = args[0].charAt(0);
	 if(args.length==1) {
		 if(ch>='a' && ch<='z') {
			 System.out.println("Upper Case:"+(char)(ch-32));
		 }
		 else {
			 System.out.println("Lower Case:"+(char)(ch+32));
		 }
		 
	 }
 }
}
