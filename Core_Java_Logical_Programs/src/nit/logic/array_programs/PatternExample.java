package nit.logic.array_programs;
/*
 1. a a a a    2.a b c d	3.a b a b   4.a a a a   5.a
   	a a a a		 a b c d	  a b a b     b b b b     a b
	a a a a	     a b c d   	  a b a b	  c c c c     a b c
  	a a a a		 a b c d	  a b a b     d d d d	  a b c d  	
 
 */
public class PatternExample
{ 
	//Logic for pattern 1
	public static void patternOne(int num)
	{
		
		for(int row =1;row<=num;row++)
		 {
			 for(int column=1;column<=num; column++)
			 {
				 System.out.print("a ");
			 }
			 System.out.println();
		 }
	}
	
	//Logic for pattern 2
	public static void patternTwo(int num)
	{
		
		for(int row =1;row<=num;row++)
		{
			char ch ='a';
			for(int column=1;column<=num;column++,ch++)
			{	
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
	
	//Logic for pattern 3
	public static void patternThree(int num)
	{

		for(int row =1;row<=num;row++)
		 {
			 for(int column=1;column<=num; column++)
			 { 
			   if(column%2==0)
		          System.out.print("b ");
			   else
				   System.out.print("a ");
		     }
			 System.out.println();
		 }
	}
	
	//Logic for pattern 4
	public static void patternFour(int num)
	{
        char ch='a'; 
		for(int row =1;row<=num;row++,ch++)
		 {
			 for(int column=1;column<=num; column++)
			 { 
		          System.out.print(ch+" ");
		     }
			 System.out.println();
		 }
	}
    
	//Logic for pattern 5
		public static void patternFive(int num)
		{
	        
			for(int row =1;row<=num;row++)
			 {
				char ch='a'; 
				 for(int column=1;column<=row; column++,ch++)
				 { 
			          System.out.print(ch+" ");
			     }
				 System.out.println();
			 }
		}

	
    public static void main(String[] args) 
    {
		System.out.println("Pattern-1:");
		System.out.println("----------");
    	patternOne(4);
    	System.out.println("\nPattern-2:");
    	System.out.println("----------");
    	patternTwo(4);
    	System.out.println("\nPattern-3:");
    	System.out.println("----------");
    	patternThree(4);
    	System.out.println("\nPattern-4:");
    	System.out.println("----------");
    	patternFour(4);
    	System.out.println("\nPattern-5:");
    	System.out.println("----------");
    	patternFive(4);
	}
}
