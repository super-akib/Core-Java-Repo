package com.oops.program_on_interface;

public class Flexibility 
{
   public static void main(String ...args)
   {
	   Jio  jio = new Jio(7498975889L, "4G");
	   Airtel airtel = new Airtel(7385932895L, "5G");
	   BSNL bsnl = new BSNL(9960663079L, "3G");
	   
	    MobilePhone mobile = new MobilePhone();
	    
	    mobile.insertSimCard(jio);
	    mobile.makingCalls(jio);
	    mobile.sendingMessage(jio);
	    mobile.removingSimCard(jio);
	    
	    mobile.insertSimCard(airtel);
	    mobile.makingCalls(airtel);
	    mobile.sendingMessage(jio);
	    mobile.removingSimCard(jio);
   }
}
