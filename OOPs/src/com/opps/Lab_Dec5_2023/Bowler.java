package com.opps.Lab_Dec5_2023;

public class Bowler {

	private String playerName;
	private int  wickets;
	private int matches ;
	private int ballsBowled ;
	private int runsConceded;
	
	
	
	//This method is used to set instance values
		public void bowlerDetails(String name, int wickets, int matches, int balls_bowled, int runs_conceded ) 
		{
		     this.playerName = name;
		     this.wickets = wickets;
		     this.matches = matches;
		     this.ballsBowled = balls_bowled;
		     this.runsConceded = runs_conceded;
		    
		}
		 
		 //this method is used to calculate and print the bowling average 
		 public void computeBowlingAverage()
		 {   
			 if(matches <= 0 || ballsBowled <= 0 ||runsConceded<=0)
		     {   
		    	 System.out.println("----------------------------");
		    	 System.out.println("Error.....");
		     }
			 else
			 {	 
			 System.out.println("-----------------------------");
			 System.out.println("Player name:"+playerName);
			 System.out.println("Balling Average is:"+((double)runsConceded / wickets));
			 }
		 }
		 
		 //this method is used to calculate and print bowling strike rate
		 public void computeStrikeRate() 
		 {   
			 if(matches <= 0 || ballsBowled <= 0 ||runsConceded<=0)
		     {   
		    	 System.out.println("----------------------------");
		    	 System.out.println("Error.....");
		     }
			 else
			 {
			   System.out.println("-----------------------------");
			   System.out.println("Player Name:"+playerName);
			   System.out.println("Strick Rate is:"+((double)runsConceded/ballsBowled));	 
			 }
		 }
		 
		 //this method is used to display bowler/batter statistics
		 public void showStatistics() 
		 {   
			 if(matches <= 0 || ballsBowled <= 0 ||runsConceded<=0)
		     {   
		    	 System.out.println("----------------------------");
		    	 System.out.println("Error.....");
		     }
			   
			 else
				 {
				 System.out.println("-----------------------------");
				 System.out.println("Player Name:"+playerName);		     System.out.println("Wickets ="+wickets);
		         System.out.println("Matches ="+matches);
		         System.out.println("balls_bowled ="+ballsBowled);
		         System.out.println("runs_conceded="+runsConceded);
				 }
		 }
		
}
