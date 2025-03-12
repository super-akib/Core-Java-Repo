package Day3_Nov3;

public class MaxNumber {

	public static void main(String[] args) {
	int a , b, c;
	a = Integer.parseInt(args[0]);
	b = Integer.parseInt(args[1]);
	c = Integer.parseInt(args[2]);
	if(args.length==3) {
	if(a>b) {
		System.out.println(a);
	}else if(b>a) {
		System.out.println(b);
	}else if(c>b) {
		System.out.println(c);
	}
	}else System.out.println("Enter three number:");
	}

}
