package com.oop.single_level_inheritance;

public class MainTicket 
{

	public static void main(String[] args)
	{
	    
	   
	    Ticket t1 = new Ticket("Concert",101,50);
	    System.out.println(t1+"\n");
	   
	    
	    VIPTicket vip = new VIPTicket("VIP Concert",202,100,"Backstage Access");
	    
	    System.out.println(vip+"\n");
	    
	    
	    StudentTicket  s1 = new StudentTicket("Student Event",301,30,true);
	    
	    System.out.println(s1+"\n");
	    
	}

}
