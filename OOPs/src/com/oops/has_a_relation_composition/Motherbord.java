package com.oops.has_a_relation_composition;

public class Motherbord
{
    private String motherbordName;
    private String  processorName;
    private double  processorFrequency;
    private int installRam;
    private int harddrive;
    private String graphicCard;
    
    public Motherbord(String motherbordName,String processorName,double processorFrequency,int installRam ,int harddrive,String graphicCard)
    {
    	this.motherbordName = motherbordName;
    	this.processorName = processorName;
    	this.processorFrequency  = processorFrequency;
    	this.installRam = installRam;
    	this.harddrive = harddrive;
    	this.graphicCard = graphicCard;
    }
    
    public String toString()
    {
    	return "Motherbord:"+motherbordName+"\n Processor:"+processorName+" "+processorFrequency+"GHz \n RAM:"+installRam+"GB DDR5 ,Storage:"+harddrive+"TB SSD \n Graphic Card:"+graphicCard;
    }
    
}
