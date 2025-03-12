package Day3_Nov3;

public class Dominos {
 public static void main(String args[]) {
	 float cr , vp ,yd,qty,qty1,total,bill;
	 char ch;
	 cr = Float.parseFloat(args[0]);
	 qty = Float.parseFloat(args[1]);
	 vp = Float.parseFloat(args[2]);
	 qty1 = Float.parseFloat(args[3]);
	 ch = args[4].charAt(0);
	 yd = Float.parseFloat(args[5]);
	 cr = cr * qty;
	 vp = vp*qty1;
	 total = cr + vp;
	 if(ch=='Y' || ch=='y')
	 {	 
	 bill = total - yd;
	 }else bill = total;
	 
	 System.out.println("Itemized Bill:");
	 System.out.println("Cost of Chicken Rolls:Rs "+cr);
	 System.out.println("Cost of Vegitable Puffs:Rs "+vp);
	 System.out.println("Total Bill Before Discoount:Rs "+total);
	 System.out.println("Yoga Day discount:Rs "+yd);
	 System.out.println("Final Bill after discount: Rs "+bill);
	 
	 
 }
}
