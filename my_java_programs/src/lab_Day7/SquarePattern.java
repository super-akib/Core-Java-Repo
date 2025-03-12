package lab_Day7;
import java.util.Scanner;
public class SquarePattern {
  public static void squarePattern(int row,int col)
  {
	  for(int r=1;r<=row;r++)
	  {
		  for(int c=1;c<=col;c++)
		  {
			  if(r==1||r==row||c==1||c==col)
			  {
				  System.out.print("@ ");
			  }
			  else
			  {
				  System.out.print("  ");
			  }
		  }
		  System.out.println("\n");
	  }
  }
  public static void main(String args[])
  {
	  int nr ,nc;
	  Scanner rc = new Scanner(System.in);
	  System.out.print("Enter number rows:");
	  nr = rc.nextInt();
	  System.out.print("Enter number columns:");
	  nc = rc.nextInt();
	  squarePattern(nr,nc);
	  rc.close();
  }
}
