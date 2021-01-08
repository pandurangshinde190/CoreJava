//19. Factorial find in the Factorial no

import java.util.Scanner;

class FactorialType19
{
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the No =");
		int no=s.nextInt();
		int fact =1;
		
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+ no +" is = "+fact);
		
	}
}