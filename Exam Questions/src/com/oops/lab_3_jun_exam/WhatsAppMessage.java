package com.oops.lab_3_jun_exam;

public class WhatsAppMessage extends SocialMediaMessage
{
  
	public WhatsAppMessage(String sender, String content)
	{
		super(sender,content);
	}
	
	
	
	@Override
	public String encrypt() {
		return "Message encrypted";
	}

	@Override
	public String decrypt() {
		
		return "Message decrypted";
	}

	@Override
	public String displaySenderInfo() {
		
		return this.sender;
	}
    
}
