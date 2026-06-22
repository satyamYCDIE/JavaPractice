package StringsPractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the word you want to reverse:");
		String word=sc.next();
		//Approach1......
		/*int length = word.length();
		System.out.println(length);
		String rev="";
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+word.charAt(i);
		}*/
		
		//Approach2.......
		char a[]=word.toCharArray();
		String rev="";
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.print(rev);
		
		sc.close();
	}
}
