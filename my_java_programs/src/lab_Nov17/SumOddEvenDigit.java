package lab_Nov17;

 class SumOddEvenDigit {
  public static int getEvenPosSum(int num)
  {
	  int Esum=0,temp=num,p=0;
	  while(temp!=0)
	  {
		  p++;
		  temp /= 10;
	  }
	  temp=num;
		  while(temp!=0)
		  {   
			  if(p%2==0) {
				  
			 Esum+=temp%10;
			  }
			  p--;
			  temp/=10;
		  }
	 
	  return Esum;
  }
  public static int getOddPosSum(int num)
  {
	  int Osum=0,p1=0,temp1=num;
      while(temp1!=0)
      {
    	  p1++;
    	  temp1 /=10;
      }
      temp1 = num;
      while(temp1 != 0)
      {
    	if(p1%2!=0) {
    		Osum += temp1%10;
    	}
    	p1--;
    	temp1 /= 10;
      }
      return Osum;
  }
}
 
