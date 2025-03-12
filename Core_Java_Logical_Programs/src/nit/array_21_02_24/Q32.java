package nit.array_21_02_24;

import java.util.Scanner;

public class Q32 {
	   public static void nameAscendingOrder(String name[])
	   {   
		   String temp="";
		   for(int i=0;i<name.length;i++)
		   {
			   for(int j=i+1;j<name.length;j++)
			   {
				   if(name[i].compareTo(name[j])>0)
				   {
					   temp = name[i];
					   name[i]= name[j];
					   name[j]= temp;
				   }
			   }
		   }
	   }
      public static void main(String[] args)
      {
		   Scanner scan = new Scanner(System.in);
		   String name[] = new String[5];
		   for(int i=0;i<name.length;i++)
		   {
			   name[i] = scan.next();
		   }
		   nameAscendingOrder(name);
		   scan.close();
	  } 
}
