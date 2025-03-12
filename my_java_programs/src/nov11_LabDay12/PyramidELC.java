package nov11_LabDay12;
import java.util.Scanner;
public class PyramidELC {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a numbr:");
		int row = sc.nextInt();
		System.out.println(PyramidBLC.printInvertedPyramid(row));
		sc.close();
	}

}
