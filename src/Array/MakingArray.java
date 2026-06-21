package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MakingArray {

	public static void main(String[] args) 
	{
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the "+i+" position element of the array");
			a[i]=sc.nextInt();
		}
		System.out.println("Array created from the inputs:"+Arrays.toString(a));
	}

}
