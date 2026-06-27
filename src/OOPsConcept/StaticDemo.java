package OOPsConcept;

public class StaticDemo {
	
	static int a=10;
	int b=20;
	
	static void m1()
	{
		System.out.println("This is static method M1:");
	}
	
	void m2()
	{
		System.out.println("This is non-static method M2:");
	}

	/*public static void main(String[] args) 
	{
		//static variable and methods are accessible directly
		System.out.println(a);
		m1();
		
		//non-static variable and methods are not accessible directly need to create an object of the class
		StaticDemo sd=new StaticDemo();
		System.out.println(sd.b);
		sd.m2();

	}*/

}
