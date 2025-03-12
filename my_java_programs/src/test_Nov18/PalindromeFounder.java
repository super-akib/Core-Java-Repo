package test_Nov18;

class PalindromeFounder {
 public static String isPalindrome(int n)
 {   
	 String str="";
	 int temp = n,r=0;
	 while(temp!=0)
	 {
		 r = r*10+temp%10;
         temp /= 10;
         str +=r;
      }
        if(r==n)
        str = "Palindrome";
        
  return str;      
 }
}

