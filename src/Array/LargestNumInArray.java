package Array;

import java.util.Scanner;

public class LargestNumInArray {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		int largest=a[0];

		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the "+i+" position element of the array");
			a[i]=sc.nextInt();
			
			if(a[i]>largest)
			{
				largest=a[i];
			}
		}
		System.out.println("The largest numer in the Array is: "+largest);
		sc.close();
	}
	
}
