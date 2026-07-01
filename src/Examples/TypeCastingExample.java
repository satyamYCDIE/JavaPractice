package Examples;

public class TypeCastingExample {

	public static void main(String[] args) 
	{
		//UpCasting means smaller to larger and this is automatic process
		int a=100;
		long b=a;
		System.out.println(b);
		
		float c=12.5f;
		double d=c;
		System.out.println(d);

		//DownCasting means larger to smaller and this is manual process
		
		long e=12345;
		int f=(int)e;
		System.out.println(f);
		
		double g=345.43;
		float h=(float)g;
		System.out.println(h);
	}

}
