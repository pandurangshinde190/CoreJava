//11. Calculator using switch metho in give the user input

import java.util.Scanner;

class CalculatorP11
{
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Number1");
		int no1 =s.nextInt();

		System.out.println("Enter the Number2");
		int no2 =s.nextInt();

		System.out.println("Select Symbol(+,-,*,/)");
		String sys =s.next();
		int res;
		switch(sys)
		{
			case"+":
			res =no1+no2;
			System.out.println("Addition is = "+res);
			break;


			case"-":
			res =no1-no2;
			System.out.println("Substraction is = "+res);
			break;



			case"*":
			res =no1*no2;
			System.out.println("Multiplication is = "+res);
			break;



			case"/":
			res =no1/no2;
			System.out.println("Division is = "+res);
			break;
		
			default:
			System.out.println("Invalid Syntax");
			break;
		}
		
	}
}