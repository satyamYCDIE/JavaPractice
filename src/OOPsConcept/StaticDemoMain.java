package OOPsConcept;

public class StaticDemoMain {

	public static void main(String[] args) 
	{
		//static variable and methods are accessible through class name if main method written differently
		System.out.println(StaticDemo.a);
		StaticDemo.m1();
				
		//non-static variable and methods are not accessible directly need to create an object of the class
		StaticDemo sd=new StaticDemo();
		System.out.println(sd.b);
		sd.m2();

	}

}
