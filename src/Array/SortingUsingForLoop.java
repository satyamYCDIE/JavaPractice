package Array;

import java.util.Arrays;

public class SortingUsingForLoop {

	public static void main(String[] args) 
	{
		int a[]= {50,20,40,10,100,90,70,60,80,30};
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("sorted array is: "+Arrays.toString(a));
	}

}
