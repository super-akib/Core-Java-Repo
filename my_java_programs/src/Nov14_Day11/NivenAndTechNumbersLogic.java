package Nov14_Day11;
 class NivenAndTechNumbersLogic {
  public static boolean isNivenNumber(int num)
  {
	  int temp = num,sum=0,digit;
	  if(num>=1000)
		  digit = 100;
	  else
	  	  digit = 10;
	  while(temp!=0)
	  {
		  sum += temp%digit;
		  temp /= digit;
	  }
	  if(num%sum==0)
		  return true;
	  else
		  return false;
   }
    public static boolean isTechNumber(int num)
    {
    	int sum=0,temp=num,x=1,c=0;
    	while(temp!=0)
    	{
    		temp /=10;
    		c++;
        }
    	while(c!=0)
    	{
    		x *=10;
    		c--;
    	}
    	temp = num;
    	while(temp!=0)
    	{
    		sum += temp % x;
    		temp  /=x;
    	}
    	if((int)Math.pow(sum, 2)==num)
    	    return true;
    	else
    		return false;
    }
 
}
