package StringsPractice;

import java.util.Scanner;

public class CountOccurrences {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string containing only abc :");
		String word=sc.next();
		int Acount=0,Bcount=0,Ccount=0;
		
		char a[]=word.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='a')
			{
				Acount++;
			}
			else if(a[i]=='b')
			{
				Bcount++;
			}
			else if(a[i]=='c')
			{
				Ccount++;
			}
		}
		System.out.println("Count of A is:"+Acount);
		System.out.println("Count of B is:"+Bcount);
		System.out.println("Count of C is:"+Ccount);
		
		sc.close();
	}

}
