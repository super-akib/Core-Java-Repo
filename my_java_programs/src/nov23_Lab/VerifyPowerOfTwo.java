package nov23_Lab;

public class VerifyPowerOfTwo {
 public static boolean checkNumber(int n)
 { 
	 int i,j;
	 for(i=2,j=0;i<=n;)
	 {
		j=i*2;
		i=j;
		if(i==n) break;
	 }
	 return i==n;
 }
}
