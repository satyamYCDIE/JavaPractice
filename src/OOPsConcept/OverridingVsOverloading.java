package OOPsConcept;

class ABC
{
	void m1(int a)
	{
		System.out.println("The value of ABC method M1 is:"+a);
	}
	void m2(int b)
	{
		System.out.println("The value of ABC method M2 is:"+b);
	}
}

class XYZ extends ABC
{
	void m1(int a) //method overloading
	{
		System.out.println("The value of XYZ method M1 is:"+(a*a));
	}
	void m2(int a,int b)  //method overriding
	{
		System.out.println("The value of XYZ method M2 is:"+a+b);
	}
}

public class OverridingVsOverloading {

	public static void main(String[] args) 
	{
		XYZ xobj=new XYZ();
		xobj.m1(12);
		xobj.m2(23);
		
		ABC aobj=new ABC();
		aobj.m1(10);
		aobj.m2(19);
		
	}

}
