package com.oops.lab_3_jun_exam;

public class FacebookMessage extends SocialMediaMessage 
{
	private String imageAttachment;

	public FacebookMessage(String sender, String content, String imageAttachment) 
	{
		super(sender, content);
		this.imageAttachment = imageAttachment;
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
	
	public String getImageAttachment()
	{
		return this.imageAttachment;
	}

}
