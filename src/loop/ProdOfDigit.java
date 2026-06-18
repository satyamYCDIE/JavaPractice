package loop;

public class ProdOfDigit {

	public static void main(String[] args) 
	{
		int a=12345,Pres=1;
		while(a>0)
		{
			int i=a%10;
			Pres=Pres*i;
			a=a/10;
		}
		System.out.println("The Product of the above number "+Pres);

	}

}
