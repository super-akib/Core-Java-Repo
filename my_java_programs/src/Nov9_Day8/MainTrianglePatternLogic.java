package Nov9_Day8;
class MainTrianglePatternLogic {
	public static String patternCreater(int row)
	{
		String res=""; 

		for (int i = 1; i <= row; ++i) 
		{
		    for (int j = 0; j < i; ++j) 
		    { 
		        System.out.print(j+" "); //Print *
//		    	res+=" "+j;
		    }
		    System.out.println(); //New line
		    }
		
		return res;
	}
}