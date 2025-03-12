package Day9_Nov10;

 class AdamNumber {
	 public static boolean isAdamNumber(int num)
	 {
		 int rev1=0,rev2=0,temp,square=0;
		 square = (int)Math.pow(num,2);
		 temp = num;
		 while(temp!=0)
		 {
			 rev1 = rev1*10+temp%10;
			 temp /= num;
		 }
		 int rev1Square = (int)Math.pow(rev1,2);
		 while(rev1Square!=0)
		 {
			 rev2 = rev2*10+rev1Square%10;
			 rev1Square /= 10;
		 }
		 return rev2 == square;
		 
	 }
}
