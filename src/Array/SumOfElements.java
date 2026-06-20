package Array;

public class SumOfElements {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6,7,8,9},sum=0;
		/*for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}*/
		for(int x:a) 
		{
			sum=sum+x;
		}
		System.out.println("The sum of all the elements: "+sum);
	}

}
