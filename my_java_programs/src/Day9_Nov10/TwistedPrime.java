package Day9_Nov10;

 class TwistedPrime {
	 public static boolean isTwistedPrime(int num)
	 {
		 boolean result=false;
		 int temp = num ,rev=0;
		 if(isPrime(num))
		 {	 
		   while(temp!=0)
		   {
			 rev = rev*10+temp%10;
			 temp /=10;
		   }
	    }
		 return result;
	 }
	 public static boolean isPrime(int number)
	 {
		 int count = 0;
		 for(int i=2;i<=number/2;i++)
		 {
			 if(number%i==0)
			    count++;
		 }
		 return count == 0;
	 }
}
