package nit.logic.two_d_array;
import java.util.Scanner;
public class FindOccurrenceOfElementInArray
{
     public static int findOccurrence(int arr[],int key )
     {
    	 int occurrenceCount =0;
    	 for(int i=0;i<arr.length;i++)
    	 {   
    		 if(arr[i]== key)
    		 {
    			 occurrenceCount+=1;
    		 }
    	 }
        return occurrenceCount;	 
     }
     
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size:");
		int arraySize = sc.nextInt();
		int arr[]= new int[arraySize];
		System.out.println("Enter "+arraySize+" array elements:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("element["+i+"]:");
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter number we want to search:");
		int key = sc.nextInt();
		
		int occurrence = findOccurrence(arr, key);
		  if(occurrence >0)
		  {
			System.out.println("Entered "+key+" number Occurred:"+occurrence+" times");
		  }
		  else
		  { 
			 System.out.println("Entered number "+key+" not found.");
		  }
		sc.close();
	} 
}
