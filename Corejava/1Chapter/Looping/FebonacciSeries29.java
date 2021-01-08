//29 Wap to find the FebonacciSeries  Using Recursion


class FebonacciSeries29
{
	static int a=0,b=1,c;
	public static void main(String args[])
	{
		System.out.println(a+"  "+b);
		FebonacciSeries29 obj=new FebonacciSeries29();
		obj.printFeb(10);
	}
	
	void printFeb(int i)
	{
		if(i>=1)
		{
			c=a+b;
			System.out.print(" "+c);
			
			a=b;
			b=c;
			
			printFeb(i-1);
		}
		
	}
}