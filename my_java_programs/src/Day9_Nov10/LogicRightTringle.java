package Day9_Nov10;

class LogicRightTringle {
	public static String patternCreator(int row)
	{
	  char ch=65;
	  String str ="";
	  for(int i=0;i<row;i++)
	  {
		  for(int j=i;j<=i;j++)
		  {
			  System.out.println(" ");
		  }
		  for(int k=i;k<=row;k++)
		  {
			  str += ch++ +" ";
		  }
	  }
	  System.out.println("\n");
	  return str;
	}
	public static void patternPrinter(int row)
	{   
		String str1 = patternCreator(row);
		System.out.println(str1);
	}
}
