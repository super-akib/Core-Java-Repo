package com.oop.dec6_2023;

public class Address
{
   private String city;
   private String district;
   private String state ;
   
   public Address(String city,String district,String state)
   {
	   this.city = city;
	   this.district = district;
	   this.state = state;
   }
   
   public String toString()
   {
	   String address = "Address[ City :"+city+", District:"+district+",State:"+state+"]";
	   return address;
   }
}
