//6. Wap to check leap Year   
// 400 ==0 , (4==0 & 100 !=0)

class LeapYearP6
{
	public static void main(String args[])
	{
		int year=2021;

		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("Leap Year");
				}
				else
				{
					System.out.println("Not Leap Year");
				}	
			}
			else
			{
				System.out.println("Leap Year");
			}	
		}
		else
		{
			System.out.println("Not Leap Year");
		} 
		
		
	}

}