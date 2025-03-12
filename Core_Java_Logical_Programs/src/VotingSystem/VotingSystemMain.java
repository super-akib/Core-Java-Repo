package VotingSystem;

import java.util.Scanner;

public class VotingSystemMain
{
    public static void main(String[] args) 
    {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.print("Enter  popultation of state:");
    	long population = scan.nextLong();
    	System.out.print("Enter Percentage of Voter went for vote:");
    	long votingPecentage = scan.nextLong();
    	System.out.print("Enter candidate 1 name:");
    	String candidate1name = scan.nextLine();
    	                        scan.nextLine();
    	System.out.print("Enter candidate voting percentage:");
    	int percentage = scan.nextInt(); 
    	System.out.print("Enter candidate 2 name:");
    	String candidate2name = scan.nextLine();
                        	    scan.nextLine();
                        	    
                        	    
		 long countVote = VoterCoutingSystem.calculateVotingPercentage(population , votingPecentage);
		 
	}
}
