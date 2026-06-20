package Array;

public class LargestElement {

	public static void main(String[] args) 
	{
		int a[]= {12,44,66,45,97,121,36,76},largest=a[0];
		/*for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
		}*/
		for(int x:a)
		{
			if(x >largest)
			{
				largest=x;
			}
		}
		System.out.println("The largest number from them: "+largest);
	}

}
