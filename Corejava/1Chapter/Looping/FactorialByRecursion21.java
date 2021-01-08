//21 Wap to find the Factorail of the number using recursion

import java.util.Scanner;

class FactorialByRecursion21
{
	static int fact=1;
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the find out factorial Number = ");
		int no=s.nextInt();

		FactorialByRecursion21 obj =new FactorialByRecursion21();
		obj.calcFact(no);
	
		System.out.println("Factorial of "+ no +" is "+fact);
		
	}
	
	void calcFact(int no)
	{
		if(no>=1)
		{
			fact=fact*no;
			calcFact(no-1);
		}
	}
	


}