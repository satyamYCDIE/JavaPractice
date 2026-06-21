package Array;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter second number:");
		int num2=sc.nextInt();
		
		System.out.println("The sum of the 2 numbers is:"+(num1+num2));
		
		System.out.println("Enter the city you stay:");
		String city = sc.next();
		
		System.out.println("You stay in:"+city);
		
	}

}
