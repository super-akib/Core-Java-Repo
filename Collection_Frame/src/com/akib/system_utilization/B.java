package com.akib.system_utilization;

public class B implements I1
{
    private int  a; 
    private int  b;
    
    public  B()
    {
    	
    }
    public B(int a , int b)
    {
    	this.a = a;
    	this.b = b;
    }
	@Override
	public int m1() 
	{
		return a*b;
	}
	@Override
	public String toString() {
		return m1()+"";
	}
	

    
}
