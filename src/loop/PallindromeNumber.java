package loop;

public class PallindromeNumber {

	public static void main(String[] args) 
	{
		int a=1234321,y=0,res;
		
		for(int i=1;i<=7;i++)
		{
			int x=a%10;
			y=(y*10)+(a/10);
			a=a/10;
			res=y;
			
		}
		System.out.println(y);
		
		if(res==a)
		{
			System.out.println("The number is Pallindrome");
		}
		else
		{
			System.out.println("The number is not Pallindrome");
		}

	}

}
