package Day6_Lab;
import java.util.Scanner;
public class ArithmaticOperation {
    public static int AdditionOfNumber(int num,int num2)
    {
       return num+num2;	
    }
    public static int SubstractionOfNumber(int num,int num2)
    {
       return num-num2;	
    }
    public static int MultipOfNumber(int num,int num2)
    {
       return num*num2;	
    }
    public static int DivOfNumber(int num,int num2)
    {
       return num/num2;	
    }
	
	public static void main(String[] args) 
	{
		int n1 , n2 ,res=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number:");
		n1 = sc.nextInt();
		System.out.print("Enter Second Number:");
		n2 = sc.nextInt();
        res = AdditionOfNumber(n1,n2);
        System.out.println("Addition of two number:"+res);
        res = SubstractionOfNumber(n1,n2);
        System.out.println("Subtraction of two number:"+res);
        res = MultipOfNumber(n1,n2);
        System.out.println("Multiplication of two number:"+res);
        res =  DivOfNumber(n1,n2);
        System.out.println("Division of two number:"+res);
        sc.close();
	}  

}
