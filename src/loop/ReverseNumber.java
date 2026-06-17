package loop;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		int a=1234567,y=0;
		
		for(int i=1;i<=7;i++)
		{
			int x=a%10;
			System.out.println(x);
			
			y=(y*10)+x;
			System.out.println(y);
			
			a=a/10;
			System.out.println(a);
			
		}

	}

}
