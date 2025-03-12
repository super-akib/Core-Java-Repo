package nov15_Day12;

public class FindGCDofNumbers {
  public static int getGCDtwoNumber(int n1,int n2)
  {
	  int gcd=0,i=1;
	  for(i=1;i<=n1 && i<=n2;i++)
	  {
		  if(n1%i==0 && n2%i==0)
		  {
			  gcd = i;
		  }
	  }
	  return gcd;
  }
  public static int getGCDThreeNumber(int n1,int n2,int n3)
  {
	  int gcd1=0,i=1;
	  for(i=1;i<=n1 && i<=n2 && i<=n3;i++)
	  {
		  if(n1%i==0 && n2%i==0 && n3%i==0)
		  {
			  gcd1 = i;
		  }
	  }
	  return gcd1;
  }
}
