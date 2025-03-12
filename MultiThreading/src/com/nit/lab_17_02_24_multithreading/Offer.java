package com.nit.lab_17_02_24_multithreading;

public class Offer 
{
   private String offerText;
   
   public Offer(String offerText)
   {
	   this.offerText = offerText;
   }
   
   public String getOfferText()
   {
	   return offerText;
   }
   
   @Override 
   public String toString()
   {
	   return "Special Descount:"+offerText;
   }
}
