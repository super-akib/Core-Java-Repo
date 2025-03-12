package my_java_programs;

public class CycleSellingPriceCalculator {
 public static void main(String args[]) {
	 float cost,repair ,c_cost,ac,total,profit,sp;
	 cost = Float.parseFloat(args[0]);
	 repair = Float.parseFloat(args[1]);
	 c_cost = Float.parseFloat (args[2]);
	 ac = Float.parseFloat(args[3]);
	 profit = Float.parseFloat(args[4]);
	 
	 total = cost+repair+c_cost+ac;
	 sp = profit + total;
	 
	 System.out.println("Initial Cost:Rs."+cost);
	 System.out.println("Repair Cost:Rs."+repair);
	 System.out.println("Color Cost:Rs."+c_cost);
	 System.out.println("Accessoris Cost:Rs."+ac);
	 System.out.println("Total Cost:Rs."+total);
	 System.out.println("Desired Profit:Rs."+profit);
	 System.out.println("Selling Price:Rs."+sp);
	 
 }
}
