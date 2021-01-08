//16 printtable using Scanner

import java.util.Scanner;

class PrintTable16
{
	public static void main(String args[])
	{
		String yn;
		
		do
		{
			Scanner s =new Scanner(System.in);
			System.out.println("Enter the Printtable No =");
			int no=s.nextInt();
		
			for(int i=1;i<=10;i++)
			{
				System.out.println(no+" * "+ i +" = "+no*i);
			}
			System.out.println("Do Tou want to continue(Press y is yes and Press n i no)");
			yn =s.next();
		
		}while(yn.equals("y")|| yn.equals("Y"));
	}
}