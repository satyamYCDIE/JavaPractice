package loop;

public class SumOfDigits {

	public static void main(String[] args)
	{
		int a=123456789,Tsum=0;
		while(a>0)
		{
			int i=a%10;
			Tsum=Tsum+i;
			a=a/10;
		}
		System.out.println("The sum of the above number is "+Tsum);

	}

}
