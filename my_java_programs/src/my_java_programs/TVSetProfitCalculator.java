package my_java_programs;

public class TVSetProfitCalculator {
	   public static void main(String args[]) {
		   
		   float cost,profit, total, vat, sc;
		   
		   cost = Float.parseFloat(args[0]);
		   
		   profit = Float.parseFloat(args[1]);
		   
		   vat = Float.parseFloat(args[2]);
		   
		   sc = Float.parseFloat(args[3]);
		   
		   profit = (profit * cost)/100;
		   
		   vat = ((profit+cost)*vat)/100;
		   
		   sc = ((cost+profit)*sc)/100;
		   
		   total = cost + profit + vat + sc;
		   
		   System.out.println("Cost Price:Rs."+cost);
		   
		   System.out.println("Profit:Rs."+profit);
		   
		   System.out.println("VAT:Rs."+vat);
		   
		   System.out.println("Service Charge:Rs."+sc);
		   
		   System.out.println("Total Selling Price:Rs."+total);
	   }
	}