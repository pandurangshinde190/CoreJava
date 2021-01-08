//12 .calculator using do-while loop

import java.util.Scanner;
class CalculatorP12
{
	public static void main(String args[])
	{
		String yn;
		do
		{
			Scanner s= new Scanner(System.in);
			System.out.println("Enter Number1");
			int no1 =s.nextInt();
			
			System.out.println("Enter Number2");
			int no2 =s.nextInt();
				
			System.out.println("Select Number(1.Addition,2.Substraction,3.Multiplication,4.Division)");
			String sys=s.next();
			
			int res;
			
			switch(sys)
			{
				case"1":
				res=no1+no2;
				System.out.println("Addition is "+res);
				break;
				
				case"2":
				res=no1-no2;
				System.out.println("Subsraction is "+res);
				break;

				case"3":
				res=no1*no2;
				System.out.println("Multiplication is "+res);
				break;

				case"4":
				res=no1/no2;
				System.out.println("Division is "+res);
				break;

				default:
				System.out.println("Inbvalid Syntax");
				break;
			}System.out.println("Do You Want To Continue (Press y is yes and Press n is No)");
			yn =s.next();

			
		}while(yn.equals("y")||yn.equals("Y"));

	}
}