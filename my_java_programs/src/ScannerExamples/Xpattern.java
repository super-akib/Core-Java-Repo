package ScannerExamples;

public class Xpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10,c;
		c = num*2-1;
			 for (int i = 1 ; i <= c; i++ ) 
				{
					for (int j = 1 ; j <= c; j++ ) 
					{
						if(j == i  || (j==c-i+1)) {
							System.out.print("*");
						}
						System.out.print(" ");
					}
					System.out.println("\n");
				}
	}
	}


