package com.oops.override_method2;

class NIT
{
	int a;
	public NIT(int a) {
		this.a=a;
	}
	static int getNum()
	{
		//return this.a;  //we can not used this keyword in Static field
	    return new NIT(10).a;
	 }
}
class NIT1 extends NIT
{
	int a;
	public NIT1(int a,int b) {
		super(a);
		this.a=b;
	}
	int getVal()
	{
		return this.a;
	}
}
class OopsMCQ{
public static void main(String[] args) {
	NIT1 nit = new NIT1(74,152);
	System.out.print(nit.getNum()+" "+nit.getVal());
	}
}