package com.opps.Lab_Dec5_2023;

public class Batter {

	private String name ;
    private int runs ;
    private int matches ; 
    private  float  batting_avg ;
    private boolean flag ;
  //this method is used to assign values to instance variables
  	public void batterDetails(String name, int runs, int matches)
  	{
  	      this.name = name;
  	      this.runs = runs;
  	      this.matches = matches;
  	      if( runs <= 0 || matches <= 0 )
  	      {   
  	    	  this.flag = false;
  	    	  System.out.println("----------------------------");
  	    	  System.out.println("Error..");
  	      }
  	      else
  	      {
  	    	  flag = true;
  	      }
  	
  	}
  	
  	//This method is used to calculate batting average. use logic provided in question.
  	public void computeBattingAverage() 
  	{
  		if(flag)
  		{   
  			System.out.println("----------------------------");
  			System.out.println("Name:"+name);
  			batting_avg = runs / matches ;
  			System.out.println("Batting average is:"+batting_avg);
  		}
  	}
  	
  	// this method is used to display statistics of a batter/bowler
  	public void getStatistics()
  	{    
  		if(flag)
  		{
  			System.out.println("----------------------------");
  			System.out.println("Name:"+name);
  			System.out.println("Runs:"+runs);
  			System.out.println("Matches:"+matches);
  		}
  		
  	}
}
