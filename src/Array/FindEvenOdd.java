package Array;

public class FindEvenOdd {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10},Ecount=0,Ocount=0;
		/*for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				Ecount++;
			}
			else
			{
				Ocount++;
			}
		}*/
		for(int x:a)
		{
			if(x%2==0)
			{
				Ecount++;
			}
			else
			{
				Ocount++;
			}
		}
		System.out.println("Even number count in the array is:"+Ecount);
		System.out.println("Odd number count in the array is:"+Ocount);
	}

}
