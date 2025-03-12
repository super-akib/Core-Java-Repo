package Nov9_Day8;

class IsArmstrongNumber {
 public static boolean isArmstrong(int num)
 {
	 int sum=0,temp=0,count=0;
	 temp = num;
	 while(temp != 0)
	 {
		temp /= 10;
		count++;
	 }
	 temp = num;
	 while(temp != 0)
	 {
		 int rev = temp%10;
		 sum += Math.pow(rev, count);
		 temp /=10;
	 }
	 return sum == num;
 }
 public static void printArmstrong(int num)
 {
	 for(int i=1;i<=num;i++)
	 {
		 boolean b = isArmstrong(i);
		 if(b)
		 {
			 System.out.println(i+" ");
		 }
	 }
 }
}
