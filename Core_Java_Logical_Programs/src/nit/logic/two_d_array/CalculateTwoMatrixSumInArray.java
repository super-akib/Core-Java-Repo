package nit.logic.two_d_array;

import java.util.Scanner;

public class CalculateTwoMatrixSumInArray 
{
    public static void storeElement(int a[][]) 
    {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[0].length; j++)
            {
                System.out.print("element["+i+","+j+"]:");
            	a[i][j] = scan.nextInt();
            }
        }
        
    }

    public static void add2DArray(int a1[][], int a2[][]) {
        int sum[][] = new int[a1.length][a1[0].length];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[0].length; j++) {
                sum[i][j] = a1[i][j] + a2[i][j];
            }
        }
        System.out.println("Sum array is:-");

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row for 1st array:");
        int row1 = sc.nextInt();
        System.out.print("Enter number of column for 1st array:");
        int col1 = sc.nextInt();
        System.out.println("Enter [" + (row1 * col1) + "] elements in 1st array:");
        int arr1[][] = new int[row1][col1];

        storeElement(arr1);

        System.out.print("Enter number of row for 2nd array:");
        int row2 = sc.nextInt();
        System.out.print("Enter number of column for 2nd array:");
        int col2 = sc.nextInt();
        System.out.println("Enter [" + (row2 * col2) + "] elements in 2nd array:");
        int arr2[][] = new int[row2][col2];

        storeElement(arr2);

        add2DArray(arr1, arr2);
        
        
        sc.close();
    }
}
