package StringsPractice;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		//int Wcount=0;
		
		/*char a[]=str.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(i == 0 && a[i] != ' ')
		    {
		        Wcount++;
		    }
		    else if(a[i] != ' ' && a[i-1] == ' ')
		    {
		        Wcount++;
		    }
		}
		System.out.println("The count of the words is:"+Wcount);
		sc.close();
		*/
		String[] words = str.trim().split("\\s+");
		System.out.println("The count of the words is: " + words.length);
		
		sc.close();
	}

}
