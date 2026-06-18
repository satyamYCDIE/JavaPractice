package loop;

public class LargestOfDigit {

	public static void main(String[] args) 
	{
		int a=12734,largest=0;
		while(a>0)
		{
			int i=a%10;
			if(i>largest)
			{
			 largest=i;
			}
			a=a/10;
		}
		System.out.println("The Largest number from the above number "+largest);
	}

}
