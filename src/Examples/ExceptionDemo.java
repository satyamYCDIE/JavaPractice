package Examples;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) 
	{
		System.out.println("Program is started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		
		try
		{
		System.out.println(100/a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid Data.....");
		}
		
		System.out.println("Program successfully executed:");
		System.out.println("Program successfully exited:");

	}

}
