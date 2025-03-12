package VotingSystem;

public class VoterCoutingSystem
{
   
   public static long calculateVotingPercentage(long population ,long voter)
   {
	  long votingPercentage =  (voter*population)/100;
	  return votingPercentage;
   }
	
	
	
	public static long calculateCandidate1Votes(long actualVoter ,long voterPercentage)
   {
	   long candidate1 = (voterPercentage*actualVoter)/100;
	   return candidate1;
   }
   
	public static long calculateCandidate2Votes(long actualVoter ,long candidate1Votes)
	   {
		   long candidate2 = candidate1Votes - actualVoter;
		   return candidate2;
	   }
	
}
