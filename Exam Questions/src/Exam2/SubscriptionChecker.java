package Exam2;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class SubscriptionChecker 
{
	
	
      private static User generateUser(Supplier<User> userSupplier)
      {   
    	return userSupplier.get() ;
      }
     
      private static boolean checkSubscriptionStatus(Predicate<User> subscription , User user)
      {
    	  return subscription.test(user);
      }
      
      private static void printUserInformation(User user)
      {
    	 System.out.println("User Informetion:\n"+user);  
      }
      private static void printSubscriptionStatus(User user)
      {
    	  System.out.println("Subscription :"+(user.getIsSubscribed()? "Subscribed" :"Not Subscribed"));
      }
     
      public static void main(String args[])
      {
    	  Supplier<User>  userSupplier = ()-> new User("JhonDoe",true);
    	  User  user = userSupplier.get();
    	  
    	  generateUser(userSupplier);
    	  
    	  printUserInformation(user);
    	  
    	  Predicate<User> userSubscription = u -> u.getIsSubscribed();
    	  checkSubscriptionStatus(userSubscription,user);
    	
    	  printSubscriptionStatus(user);
    	
      }
}
