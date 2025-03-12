package com.oops.overrid_method;

public class OopsTest
{
	public String nit()
    {
        return "Welcome ";
    }

    public static void main(String[] args)
    {
    	OopsTest n = new OopsTest();
        System.out.print(n.nit());
        OopsTest nit1 = new NIT();  //here we performe up-casting
        System.out.print(nit1.nit());
    }
}
class NIT extends OopsTest
{    
	 @Override 
	 public String nit()
	 {
		 return "to Naresh IT";
	 }
}