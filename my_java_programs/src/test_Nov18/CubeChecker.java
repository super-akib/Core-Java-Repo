package test_Nov18;
 class CubeChecker {
  public static int isCube(int n)
  {  
	  int i,x=0;
	  for(i=1;i<=n/3;i++)
	  {
		 if(i*i*i==n)
		 {
			  x += i; 
		 }
	  }
	  return x;
    }
 }