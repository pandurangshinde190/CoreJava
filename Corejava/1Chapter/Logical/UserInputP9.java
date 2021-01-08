//9. Userinput in Scanner java.util using

import java.util.Scanner;

class UserInputP9
{
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter your name");
		String name =s.next();

		System.out.println("Enter your Roll no");
		int rollno =s.nextInt();

		System.out.println("Enter Your Gender");
		char gender = s.next().charAt(0);

		System.out.println("Enter Your PhoneNo");
		long pno =s.nextLong();

		System.out.println("----------------------------------------");

		System.out.println("Name = "+name);
		System.out.println("Rollno = "+rollno);
		System.out.println("Gender = "+gender);
		System.out.println("Phone No = "+pno);
	}
}