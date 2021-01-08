//17. Wap to fint the factorial of number
//5*4*3*2*1 =

class Factorail17
{
	public static void main(String args[])
	{
		int no =5;
		int fact=1;
	
		for(int i=1; i<=no; i++)
		{
			fact=fact*i;					
		}
		System.out.println("Factorial of"+no+" is = "+fact);
	}
}

