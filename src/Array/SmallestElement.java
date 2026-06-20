package Array;

public class SmallestElement {

	public static void main(String[] args) 
	{
		int a[]= {12,44,66,45,97,121,36,76},smallest=a[0];
		/*for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}*/
		for(int x:a)
		{
			if(x<smallest)
			{
				smallest=x;
			}
		}
		System.out.println("The largest number from them: "+smallest);
	}

	}

