//18. Wap to fint the factorial of number

import.java.util Scanner;
class Factorial18
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no =s.nextInt();
		int fact=1;

		for(int i=1; i<=no;i++)
		{
			fact =fact*i;
		}
		System.out.println("factorial of"+no +"is"+fact);		
	}

}