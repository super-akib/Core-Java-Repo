package Nov9_Day8;

class MethodOfFindFactors {
	public static String findingFactors(int num)
	{  
		String str="";
	   for(int i=1;i<=num;i++)
	   {
		   if(num%i==0)
			   str +=i+" ";
	   }
	   return str;
	}
	public static void printingFactors(int num)
	{
		System.out.println(findingFactors(num));
	}
}
