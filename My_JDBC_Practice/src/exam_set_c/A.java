package exam_set_c;

public class A {
	public static boolean getPrimeNumber(double price)
	   {
		   int count =0;
		   for(int i=2;i<=price/2;i++)
		   {
			   if(price%i ==0)
			   {
				   count++;
			   }
		   }
		   if(count==0)
		   {
			   return true;
		   }
		   return false;
	   }

	public static void main(String[] args) {
		System.out.println(getPrimeNumber(13000));

	}

}
