package Nov16;

class LogicBankAccount {
  static double balance =0;
  public static void createAccount(int id,String name,int acc,char gender,int amt)
  {  
   System.out.println("Your Account Details:"); 
   System.out.println("---------------------------------------------");
	  System.out.println("ID:"+id);
	  System.out.println("Name:"+name);
	  System.out.println("Account No:"+acc);
	  if(gender=='M'||gender=='m')
	    System.out.println("Gender:Male");
	  else if(gender=='F'||gender=='f') 
		  System.out.println("Gender:Female");
	  else
		  System.out.println("Gender:Otehrs");
	  System.out.println("Deposit Amount:"+amt);
  }
  
}

