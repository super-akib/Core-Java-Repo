package nit.array_21_02_24;
/* WAP to  accept a string and display the new String after reversing the letters of each words'
 * Input: Write Once Run Anywhere
 * Output: etirw ecnO nuR erehwynA*/
public class Q25 
{
      public static void reversString(String str)
      { 
    	  String rev="";
    	  String words[] = str.split(" ");
    	  
    	     for(int i=0;i<words.length;i++)
    	     {
    	         String word = words[i];
    	         for(int j=word.length()-1;j>=0;j--)
    	         {
    	        	 char ch = word.charAt(j);
        	         rev += ch;
    	         }
    	         rev +=" ";
    	     }
    	     System.out.println(rev);
      }
      public static void main(String args[])
      {
    	  String str = "Write Once Run Anywhere";
    	  reversString(str);
      }
}
