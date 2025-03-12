package Exam2;

public class User 
{
   private String userName;
   private boolean isSubscribed;
   
   public User(String userName,boolean isSubscribed)
   { 
	   super();
	   this.userName = userName;
	   this.isSubscribed = isSubscribed;
   }
   public boolean getIsSubscribed()
   {
	   return this.isSubscribed;
   }
   @Override
   public String toString()
   {
	   return "User Name:"+this.userName+", Subscription Status:"+this.isSubscribed;
   }
}
