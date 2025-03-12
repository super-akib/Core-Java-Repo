package com.oops.lab_3_jun_exam;

public class MyProgram {

	public static void main(String[] args)
	{
           SocialMediaMessage   sp  = new WhatsAppMessage("Akib","Today is weekly test");
           SocialMediaMessage   sp2 =  new FacebookMessage("Akib", "weather report", "Some attached images");
           
           
           
     System.out.println("Encrypted:"+sp.encrypt()+", Decrypted data:"+sp.decrypt()+",Sender information:"+sp.displayMessageInfo());
	 
     System.out.println("Encrypted:"+sp2.encrypt()+", Decrypted data:"+sp2.decrypt()+",Sender information:"+sp2.displayMessageInfo());

	}

}
