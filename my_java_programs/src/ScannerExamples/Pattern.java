package ScannerExamples;

public class Pattern {

	public static void main(String[] args) {
		int rows = 5,j;
        char ch = 65;
        for (int i = 0; i < rows; i++) {
            for (j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < rows - i; k++) {
                System.out.print((char)j+ch+" ");
            }

            System.out.println();
        }

	}

}
