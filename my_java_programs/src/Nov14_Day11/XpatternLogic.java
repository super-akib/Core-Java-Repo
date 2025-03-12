package Nov14_Day11;
class XpatternLogic {
  public static String drawPattern(int num)
  {  
	  int count;
	  count = num*2-1;
	 String str ="";
	  for(int i=1;i<=count;i++)
	  {
		  for(int j=1;j<=count;j++)
		  {
			  if((j == i)||(j == count -i+1))
			      str +="X";
			  else 
				  str +=" ";
		  }
		  str +="\n";
	  }
	  return str;
  }
}
