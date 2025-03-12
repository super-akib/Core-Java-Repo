package com.oops.has_a_relation_composition;

public class Fan 
{
    private String brandName;
    private String fanType;
    private int numberOfWings;
    private int fanRPM;
    private int energyEfficiency;
    private int fanWarrenty;
    private Coil coil;
    
    public Fan(String brandName,String fanType,int numberOfWings,int fanRPM,int energyEfficiency,int fanWarrenty)
    {
       this.brandName = brandName;
       this.fanType = fanType;
       this.numberOfWings =  numberOfWings;
       this.fanRPM  = fanRPM ;
       this.energyEfficiency = energyEfficiency;
       this.fanWarrenty = fanWarrenty;
       this.coil = new Coil("Copper BLDC motor",32);
    }
    
    public String toString()
    {
    	return "Fan [Brand :"+brandName+",Fan Type:"+fanType+",Wings:"+numberOfWings+","+fanRPM+"RMP, Energy efficiency:"+energyEfficiency+"Star, Warrenty:"+fanWarrenty+"Year,"+coil;
    }
    
}    
