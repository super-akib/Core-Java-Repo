package nit.logic.array_programs;

public class ArrayProgramMatchTargetSum {
    public static int[] SumOfTarget(int arr[], int target) {
        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { 
                if (arr[i] + arr[j] == target) {
                    isFound = true;
                    if (isFound) {
                        System.out.println("First element: " + arr[i]);
                        System.out.println("Second element: " + arr[j]);
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[]{-1}; 
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 3};
        int target = 8;
        int result[] = SumOfTarget(arr, target);
        if (result[0] != -1) { 
            System.out.println("Indices are:");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        } else {
            System.out.println("Elements are not found.");
        }
    }
}
