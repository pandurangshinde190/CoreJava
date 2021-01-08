//31 Palindrome Number

import java.util.Scanner;
class PalindromeNo31
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=s.nextInt();
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