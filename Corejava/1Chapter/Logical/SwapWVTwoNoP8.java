//8 Wap Two Number whitout using third variable

class SwapWVTwoNoP8
{
	public static void main(String args[])
	{
		int a=10,b=20;

		System.out.println("Before Swaping A = "+a);
		System.out.println("Before Swaping B = "+b);

		a =a+b;
		b=a-b;
		a=a-b;

		System.out.println("After Swapping A = "+a);
		System.out.println("After Swapping B = "+b);
	}

}