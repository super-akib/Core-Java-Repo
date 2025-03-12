package com.akib.system_utilization;

public class A implements I1
{  
	private int a;
	private int b;
	
	public A()
	{
		
	}
	
    public A(int a,int b)
    {
    	this.a = a;
    	this.b = b;
    }
    
    public void setA(int a)
    {
    	this.a= a;
    }
    public int getA()
    {
    	return this.a;
    }
    public void setB(int b)
    {
    	this.b = b;
    }
    public int getB()
    {
    	return this.b;
    }
    
	@Override
	public int m1() 
	{  
		return a-b;
	}
    @Override 
    public String toString()
    {
    	return m1()+" ";
    }
}
