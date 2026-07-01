package Examples;

class Parent
{
	String name="Satyam";
	void m1()
	{
		System.out.println("This is parent class....");
	}
}

class Child extends Parent
{
	int i=100;
	void m2()
	{
		System.out.println("This is child class....");
	}
}

public class TypeCastingClass {

	public static void main(String[] args) 
	{
		/*Child c= new Child() ;
		System.out.println(c.name); //Parent
		c.m1(); //Parent
		System.out.println(c.i); //Child
		c.m2(); //Child
		*/
		
		Parent p = new Child(); 
		System.out.println(p.name); //Parent
		p.m1(); //Parent

		//System.out.println(p.i); //not accessible
		//p.m2();  //not accessible
	}

}
