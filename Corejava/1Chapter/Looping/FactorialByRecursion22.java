//22 Wap to find the Factorail of the number using recursion

import java.util.Scanner;

class FactorialByRecursion22
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the factorial no =");
		int no=s.nextInt();
		int fact;	
	
		FactorialByRecursion22 obj =new FactorialByRecursion22();
		fact=obj.calcFact(no);
	
		System.out.println("Factorial is ="+fact);
		
	}
	
	int calcFact(int no)
	{
		if(no>=1)
		{
			return(no*calcFact(no-1));
		}
		return 1;
	}

}