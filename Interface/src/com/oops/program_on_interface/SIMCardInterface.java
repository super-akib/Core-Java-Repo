package com.oops.program_on_interface;

public interface SIMCardInterface 
{
   long getPhoneNumber();
   String networkProvider();
   boolean isActivate();
   void  simActivated(boolean activate);
      
}
