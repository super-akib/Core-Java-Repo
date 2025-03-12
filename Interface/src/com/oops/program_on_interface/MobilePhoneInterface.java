package com.oops.program_on_interface;

public interface MobilePhoneInterface  
{
    void insertSimCard(SIMCardInterface sim);
    void removingSimCard(SIMCardInterface sim);
    void makingCalls(SIMCardInterface sim);
    void sendingMessage(SIMCardInterface sim);
 }
