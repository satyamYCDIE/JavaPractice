package loop;

public class Armstrong {

	public static void main(String[] args)
	{
		int a=153,sum=0;
		int num=a;
		while(a>0)
		{
			int i=a%10;
			{
			 sum=sum+(i*i*i);
			}
			a=a/10;
		}
		if(num==sum)
		{
			System.out.println("The number is armstrong "+sum);
		}
		else
		{
			System.out.println("The Number is not armstrong "+sum);
		}
	}

}
