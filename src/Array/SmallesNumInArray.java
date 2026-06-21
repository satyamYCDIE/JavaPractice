package Array;

import java.util.Scanner;

public class SmallesNumInArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the number:");
			a[i]=sc.nextInt();
		}
		
		int smallest=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		System.out.println("The smallest number in the array is:"+smallest);
		sc.close();
	}

}
