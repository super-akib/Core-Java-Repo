package method_overloading;

public class Overloading
{
    
	public void method1(int n, char ch)
	{
		System.out.println("Integer:"+n+"  Charecter:"+ch);
	}
	
	public void method1(char ch,int n)
	{
		System.out.println("Charecter:"+ch+"   Integer:"+n);
	}
}
