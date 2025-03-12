package Day9_Nov10;

 class LogicNeonNumber {
	 public static boolean isNeonNumber(int num)
	 {
		 int square = 0,temp,sum=0;
		 square = (int)Math.pow(num,2);
		 temp = square;
		 while(temp!=0)
		 {
			 sum += temp%10;
			 temp /= 10;
		 }
		 return sum == num;
	 }
}
