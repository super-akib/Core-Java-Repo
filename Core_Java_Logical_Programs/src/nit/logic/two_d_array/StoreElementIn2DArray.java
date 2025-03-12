package nit.logic.two_d_array;

import java.util.Scanner;

public class StoreElementIn2DArray
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	int row=4;
    	int column=3;
		 int arr[][]= new int [row][column];
		 for(int i =0;i<row;i++)
		 {
			 for(int j=0;j<column;j++)
			 {
				 System.out.print("Element:["+i+","+j+"]:");
				 arr[i][j]= sc.nextInt();
			 }
		 }
		 
		 System.out.println("2D-Array Elements are:");
		 for(int i =0;i<row;i++)
		 {
			 for(int j=0;j<column;j++)
			 {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
		 sc.close();
	}
}
