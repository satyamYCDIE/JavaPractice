package OOPsConcept;

interface shape
{
	int length=15;  //final and static 
	int width=20;   //final and static 
	
	void circle();  //abstract method
	
	default void square()  //default method
	{
		System.out.println("This is default method:");
	}
	static void rectangle()  //static method
	{
		System.out.println("This is static method:");
	}
}

public class InterfaceDemo implements shape
{
	public void circle()  // abstract method defined in class
	{
		System.out.println("This is abstract method");
	}
	public void triangle()  
	{
		System.out.println("This is triangle method:");
	}
	
	public static void main(String[] args)
	{
		//Scenario - 1
		InterfaceDemo idobj= new InterfaceDemo();
		idobj.circle();	   //abstract method
		idobj.square();    //default method
		shape.rectangle(); //static method can directly access from interface
		idobj.triangle();
		
		//Scenario - 2 
		shape sh=new InterfaceDemo();
		sh.circle();		//abstract method
		sh.square();		//default method
		shape.rectangle();  //static method can directly access from interface
		//sh.triangle(); // not able to access
		System.out.println(shape.length*shape.width);  //accessing static variable directly
	}

}
