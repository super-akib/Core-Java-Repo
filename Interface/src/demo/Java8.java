package demo;

interface NIT
{
	void myInterface(int a);
	
}
public class Java8 {
	public static void main(String[] args) {
		NIT nit = (int a) -> System.out.println(a+5);
		nit.myInterface(15);
	}
}
