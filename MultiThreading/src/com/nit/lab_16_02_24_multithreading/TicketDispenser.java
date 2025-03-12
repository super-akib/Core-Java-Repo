package com.nit.lab_16_02_24_multithreading;

public class TicketDispenser 
{
     private int availableTicket = 200;
     private int allotedSeats;
      
     public int allotSeatNumber(int ticket)
     {
    	 if(ticket<= availableTicket)
    	 {
    		 for(int i=1;i<=availableTicket;i++)
    		 {    
    			 allotedSeats += i;
    		 }
    	 }
    	 else 
    	 {
    		 allotedSeats = -1;
         }
    	 return allotedSeats;
     }
}
