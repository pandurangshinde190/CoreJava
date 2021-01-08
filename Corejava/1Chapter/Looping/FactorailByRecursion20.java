//20 Wap to find the Factorail of the number using recursion


class FactorailByRecursion20
{
	static int fact=1;
	
	public static void main(String args[])
	{
		int no=5;
		FactorailByRecursion20 ob =new FactorailByRecursion20();
		ob.calcFact(no);
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