package loop;

public class PallindromeNumber {

	public static void main(String[] args) 
	{
		int a=123454321,y=0;
		int b=a;
		
		//for(int i=1;i<=9;i++)
		while(a>0)
		{
			int x=a%10;
			y=(y*10)+x;
			a=a/10;
			
		}
		System.out.println(y);
		
		
		if(y==b)
		{
			System.out.println("The number is Pallindrome");
		}
		else
		{
			System.out.println("The number is not Pallindrome");
		}

	}

}
