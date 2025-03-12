package nov15_Day12;

public class PiramedPatternLogic {
  public static  String drawPattern(int rows)
  {
	  String str = "";
	  for(int i=1;i<=rows;i++)
	  {
		  for(int j=i;j<rows;j++)
		  {
			 str +=" "; 
		  }
		  for(int k=i;k>=1;k--)
		  {
			  str += k;
		  }
		  for(int p=2;p<=i;p++)
		  {
			  str += p;
		  }
		  str += "\n";
	  }
	  return str;
  }
}
