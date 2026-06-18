package loop;

public class CountNoOfDigits {

	public static void main(String[] args) 
	{
		int a=1234567654,count=0;
		/*for(int i=1;i<=7;i++) 
		{
			int x=a%10;
			a=a/10;
			count++;
		}*/
		while(a>0) 
		{
			a=a/10;
			count++;
		}
		System.out.println(count);
}
}
