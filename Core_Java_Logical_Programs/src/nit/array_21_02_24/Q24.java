package nit.array_21_02_24;

public class Q24 
{   
	public static void  printInitials(String str)
	{
		String res="";
		str = str.toUpperCase();
		String words[] = str.split(" ");
		int i; //last word reference purpose  
		for( i=0;i<words.length-1;i++)//here Rao is not fetch
		{
			res += words[i].charAt(0)+".";
		}
		//upto here we get result K.C. now we have to fetch the last word
		res += words[i].charAt(0)+words[i].substring(1).toLowerCase();
		System.out.println(res);
	}
   public static void main(String[] args) {
	 
	 String str = "Kalvakuntla Chandrashekar Rao ";
	 printInitials(str); 
   }
}
