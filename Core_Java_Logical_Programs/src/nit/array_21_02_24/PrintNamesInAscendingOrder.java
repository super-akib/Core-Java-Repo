package nit.array_21_02_24;

public class PrintNamesInAscendingOrder
{
   public static void main(String[] args)
   {
	  String str[] = {"Orange","Banana","Apple","Mango"};
	  System.out.println("Orignale Order:\n------------");
	  for(int i=0;i<str.length;i++)
	  {   
		  if(i==str.length-1)
		  {
			  System.out.print(str[i]);
		  }
		  else
		  {
			  System.out.print(str[i]+" | ");  
		  }
	  }
	  System.out.println("\n----------------");
	 //Sorting String array  
	  for(int i=0;i<str.length;i++)
	  {
		  for(int j=i+1;j<str.length;j++)
		  {
			  if(str[i].compareTo(str[j])>0)
			  {
				  String temp = str[i];
				  str[i] = str[j];
				  str[j] = temp;					  
			  }
		  }
	  }
	  System.out.println("Ascending Order:\n-------------");
	  for(int i=0;i<str.length;i++)
	  {
		  if(i==str.length-1)
		  {
			  System.out.print(str[i]);
		  }
		  else
		  {
			  System.out.print(str[i]+" | ");  
		  }
	  }
	  
   }
}
