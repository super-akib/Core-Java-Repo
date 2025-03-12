package nov23_Lab;

public class SumOfTheSquaresAndSquareOftheSums {
	public static int  calculateDifference(int n)
	  {
	      int nSum=0,squarSum=0;
	      for(int i=1;i<=n;i++)
	      {
	          nSum += i;
	          squarSum +=Math.pow(i,2);
	      }
	      nSum *=nSum;
	      
	      return (squarSum - nSum);
	  }
}
