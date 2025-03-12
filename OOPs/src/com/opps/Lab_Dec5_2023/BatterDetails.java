package com.opps.Lab_Dec5_2023;
import java.util.Scanner;
public class BatterDetails {

	public static void main(String[] args) {
		Batter b1 = new Batter();
        
		Scanner  sc = new Scanner(System.in);
		System.out.print("Enter Batter name:");
		String batterName = sc.next();  
		System.out.print("Enter runs:");
		int runs = sc.nextInt();
		System.out.print("Enter matches:");
		int mathces =  sc.nextInt();
		
		b1.batterDetails(batterName, runs, mathces);
		b1.computeBattingAverage();
		b1.getStatistics();
		sc.close();
	}

}
