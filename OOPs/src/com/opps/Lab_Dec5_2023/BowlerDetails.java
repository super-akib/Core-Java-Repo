package com.opps.Lab_Dec5_2023;
import java.util.Scanner;
public class BowlerDetails {

	public static void main(String[] args) {
		Bowler  b1 = new Bowler();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Player name:");
		String playerName = scan.next();
		System.out.print("Enter wickets:");
		int wickets = scan.nextInt();
		System.out.print("Enter matches:");
		int matchs = scan.nextInt();
		System.out.print("Enter Balls bowled:");
		int ballsBowled = scan.nextInt();
		System.out.print("Enter runs conceded:");
		int run = scan.nextInt();
		b1.bowlerDetails(playerName, wickets, matchs, ballsBowled, run);
		b1.computeBowlingAverage();
		b1.computeStrikeRate();
		b1.showStatistics();
       scan.close(); 
	}

}
