package my_java_programs;

public class TaxCalculator {
  public static void main(String args[]) {
	  float tax , amt ,txamt;
	  amt = Float.parseFloat(args[0]);
	  tax = Float.parseFloat(args[1]);
	  txamt = (amt*tax)/100;
	  System.out.println("Tax Income:Rs."+amt);
	  System.out.println("Tax Rate:"+tax);
	  System.out.println("Tax Amount:Rs."+txamt);
	  
  }
}
