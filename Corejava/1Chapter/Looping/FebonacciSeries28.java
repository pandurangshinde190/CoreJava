//28 Wap to find the FebonacciSeries


class FebonacciSeries28
{
	public static void main(String args[])
	{
		int a=0,b=1;
		int c;
		System.out.println(a+ " " +b);		
		for(int i=1;i<=10;i++)
		{
			c=a+b;
			System.out.println(" "+c);

			a=b;
			b=c;
		}

	}
	
	

}