package nov11_LabDay12;
 class PyramidBLC {
  public static String printInvertedPyramid(int num)
  {   
	  String str ="";
	  for(int i=num;i>=1;i--)
	  {
		  for(int j=1; j<=num-i;j++)
		  {
			  str +=" ";
		  }
		  for(int k=1;k<i*2;k++)
		  {
			  str +=k;
		  }
		  str +="\n";
	  }
	  return str;
  }
}
