package loop;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		int a=123456789,y=0;
		
		//for(int i=1;i<=7;i++)
		while(a>0)
		{
			int x=a%10;
			//System.out.println(x);
			
			y=(y*10)+x;
			//System.out.println(y);
			
			a=a/10;
			//System.out.println(a);
			
		}
		System.out.println("The reverse of the given number is "+y);

	}

}
