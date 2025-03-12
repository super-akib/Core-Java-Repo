package com.oops.lab_3_jun_exam;

public abstract class SocialMediaMessage    
{
    protected String sender;
    protected String content;
    
    public SocialMediaMessage(String sender , String content)
    {
    	this.sender  = sender;
    	this.content = content;
    }
    
    
    public abstract String encrypt();
    public abstract String decrypt();
    public abstract String displaySenderInfo();
    public String displayMessageInfo()
    {
    	return "Wellcome to social media";
    }
    
    
}
