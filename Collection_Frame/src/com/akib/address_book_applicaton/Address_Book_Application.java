package com.akib.address_book_applicaton;
import java.util.HashMap;
import java.util.Scanner;
public class Address_Book_Application
{
   
	 public static void main(String[] args)
	 {
		  HashMap<String,Contact>  contact = new HashMap<>();
		  Scanner sc = new Scanner(System.in); 
		 
		  while(true)
		  {
			  System.out.println("Options:\n..........");
			  System.out.println("1.Add Contact details.");
			  System.out.println("2.Remove Contact detail.");
			  System.out.println("3.Exit");
			 System.out.println("Enter your choice:");
			 int choice = sc.nextInt();
			 
			 switch(choice)
			 {
			 	case 1:
			 		   System.out.print("Enter name:");
			 		   String name = sc.nextLine();
			 		   name = sc.nextLine();
			 		   System.out.print("Enter phone number:");
			 		   long phoneNumber = sc.nextLong();
			 		   System.out.print("Enter Address:");
			 		   String address = sc.nextLine();
			 		   address = sc.nextLine();
			 		   contact.put(name, new Contact(phoneNumber,address));
			 		   System.out.println("Contact added sucessfully.");
			 		  break;
			 	case  2:
			 		    if(contact.isEmpty())
			 		    {
			 		    	System.err.println("! Record is empty..");
			 		    }
			 		    else
			 		    {
			 		    	System.out.print("Enter name of contact to remove:");
			 		    	name = sc.nextLine();
					 		name = sc.nextLine();
					 		if(contact.containsKey(name))
					 		{
					 			contact.remove(name);
					 			System.out.println("Contact"+name+" is removed.");
					 		}
					 		else
					 		{
					 			System.err.println("Contact "+name+" is not Availabe");
					 		}
			 		    }
			 		    break;
			 	case  3:
			 		    System.out.println("Thanks for uing our site..");
			 		    sc.close();
			 		    System.exit(0);
			 		    break;
			 	default :
			 		     System.err.println("Invalid option please select right option..");
			 }
		  }
	 }
}
