package Nov9_Day8;
class IsPalindrome {
	public static boolean isPalindrome(int number)
	{
	   	int rev = 0,temp = number;
	   	while(temp != 0)
	   	{
	   		rev = rev*10+temp%10;
	   		temp /= 10;
	   	}
	   	return rev == number;
	}
	public static void printPalindrome(int num)
	{
		boolean x = isPalindrome(num);
		if(x)
			System.out.println("The "+num+" is Palindrome.");
		else
			System.out.println("The "+num+" is Not a Palindrome.");
		 
	}
}
