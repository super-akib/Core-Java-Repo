package nit.logic.array_programs;
/*WAP to store elements and display array in reverse order */
public class ArrayReversOrder 
{
	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40,50};
		int rev[] = new int[arr.length];
		System.out.println();
		
		for(int i =0 ;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0,j=arr.length-1;i<arr.length;i++,j--)
		{
			rev[j] = arr[i];
		}
		
		for(int i =0 ;i<rev.length;i++)
		{
			System.out.print(rev[i]+" ");
		}
		
	}

}
