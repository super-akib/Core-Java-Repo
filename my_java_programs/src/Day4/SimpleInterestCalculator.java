package Day4;

public class SimpleInterestCalculator
{
 public static void main(String args[]) 
  {	
   float Pamt , RI, time, SI, toamt;
   Pamt = Float.parseFloat(args[0]);
   RI = Float.parseFloat(args[1]);
   time = Float.parseFloat(args[2]);
   SI = (Pamt*RI*time)/100;
   toamt = Pamt + SI;
   System.out.println("Time in Year:"+time);
   System.out.println("Simple Interest:Rs"+SI);
   System.out.println("Total Amount:Rs"+toamt);
  }
}
