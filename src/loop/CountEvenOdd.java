package loop;

public class CountEvenOdd {

	public static void main(String[] args) 
	{
		int a=234235678,Ocount=0,Ecount=0;
		while(a>0)
		{
			int res=a%10;
			
			if(res%2==0)
			{
				Ecount++;
			}
			else
			{
				Ocount++;
			}
			a=a/10;
		}
		System.out.println("Ecount "+ Ecount);
		System.out.println("Ocount "+ Ocount);
	}

}
