//24 Wap to find the Reverse String


class ReverseString24
{
	public static void main(String args[])
	{
		String name ="Pandurang";
		int leng=name.length();
		String rev=" ";
		for(int i=leng-1;i>=0;i--)
		{
			rev =rev+name.charAt(i);
		}
		System.out.println("Reverse String "+ name +" is = "+rev);
	}

}