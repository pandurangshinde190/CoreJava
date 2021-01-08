//30 Palindrome Number

class PalindromeNo30
{
	public static void main(String args[])
	{
		int no =541;
		int rem;
		int rev=0;
		int temp=no;

		while(temp!=0)
		{
			rem=temp%10;

			rev=rev*10+rem;

			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
	
}