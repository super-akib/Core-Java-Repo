package ScannerExamples;

import java.util.Scanner;
public class A1Bakery {
	public static void main(String[] args) {
		float amt,qty,toamt;	
		int item;
		System.out.println("------------------------Wellcome-To-A1-Bakery-----------------------------");
		System.out.println("Select item you want to Buy:");
		System.out.println("1.Chocolate Cake.");
		System.out.println("2.Vineela Cake.");
		System.out.println("3.Stoberry Cake.");
		System.out.println("4.Cheese Barger");
		Scanner op = new Scanner(System.in);
		System.out.print("Enter your option:");
		item = op.nextInt();
		switch (item)
		{
		  case 1: System.out.println("Chocolate Cake:");break;
		  case 2: System.out.println("Vineela Cake:");break;
		  case 3: System.out.println("Stoberry Cake:"); break;
		  case 4: System.out.println("Cheese Bargar:"); break;
		  default : System.out.println("Please put the given option thats available in list!");break;
		}
		Scanner qt = new Scanner(System.in);
		System.out.print("Enter Quntity:");
		qty = qt.nextFloat();
		Scanner price = new Scanner(System.in);
		System.out.print("Enter Cost:");
		amt = price.nextFloat();
		 toamt = amt*qty;
		 System.out.println("-------------------------Invoice-----------------------------");
		   if(item==1)
		   {	 
		    System.out.println("Chocolate Cake:"+qty);
		   }else if(item==2)
		   { 
			   System.out.println("Vineela Cake:"+qty);
		   }else if(item==3)
		   {  
		     System.out.println("Stoberry Cake:"+qty);
		   }else if(item==4)
		   {
			   System.out.println("Cheese Barger:"+qty);
		   }
		   System.out.println("Total Bill:Rs."+toamt);
		   System.out.println("------------------------Thanks-----------------------------");
		   op.close();
		   qt.close();
		   price.close();
	}

}

