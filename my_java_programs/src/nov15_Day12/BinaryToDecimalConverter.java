package nov15_Day12;

public class BinaryToDecimalConverter {
 public static int toDecimal(int num)
 {
	 int sum =0,temp=num,power=0;
	 while(temp!=0)
	 {
		 if(temp%10 == 1 || temp%10== 0)
		 {
            sum += (temp%10)*(int)Math.pow(2, power);
		    power++;	 
		 }
		 else
		   return -1;
		 temp /=10;
	 }
	 return sum;
 }
}
