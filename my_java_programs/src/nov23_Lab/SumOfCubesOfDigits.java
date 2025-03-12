package nov23_Lab;

public class SumOfCubesOfDigits {
	public static int findSum(int n)
	{
		int temp = n ,rem=0,cubeSum=0 ;
		while(temp!=0)
		{
			rem = temp%10;
				cubeSum += Math.pow(rem,3);
		    temp /=10;
		}
		return cubeSum;
	}
}
