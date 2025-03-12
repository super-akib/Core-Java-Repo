package com.oops.has_a_relation_composition;

public class Laptop 
{
	private String laptopName;
	private String laptopBrand;
    private String laptopType;
    private String sirealNumber;
    private Motherbord motherbord;
    
    public Laptop(String laptopName,String laptopBrand,String laptopType,String sirealNumber)
    {
    	this.laptopName = laptopName;
    	this.laptopBrand = laptopBrand;
    	this.laptopType = laptopType;
    	this.sirealNumber = sirealNumber;
    	this.motherbord = new Motherbord("FX750", "i7 12th gen", 3.5, 16, 1, "RTX4060 6GB");
    }


	public String toString()
	{
		return "laptopName:" + laptopName + "\n laptopBrand:" + laptopBrand +"\n laptopType:" + laptopType
				+ "\n sirealNumber:" + sirealNumber + "\n Specification:\n"+motherbord;
	}
    
    
    
}
