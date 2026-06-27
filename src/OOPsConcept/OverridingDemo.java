package OOPsConcept;

class Bank
{
	double roi()
	{
		return 0;
	}
}

class SBI
{
	double roi()
	{
		return 11.5;
	}
}

class ICICI
{
	double roi()
	{
		return 10.5;
	}
}

public class OverridingDemo {

	public static void main(String[] args)
	{
		SBI sb= new SBI();
		System.out.println(sb.roi()); 
		
		ICICI ic=new ICICI();
		System.out.println(ic.roi());
		
		Bank bk=new Bank();
		System.out.println(bk.roi());
	}

}
