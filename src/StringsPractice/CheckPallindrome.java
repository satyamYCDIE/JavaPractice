package StringsPractice;

import java.util.Scanner;

public class CheckPallindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check pallindrome");
		String word=sc.next();
		
		char a[]=word.toCharArray();
		String rev="";
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);
		
		if(word.equals(rev))
		{
			System.out.println("The given string is Pallindrome");
		}
		else
		{
			System.out.println("The given string is not Pallindrome");
		}
		sc.close();
	}

}
