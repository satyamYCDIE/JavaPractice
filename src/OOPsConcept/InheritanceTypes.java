package OOPsConcept;

class A
{
	int a=100;
	void display()
	{
		System.out.println("The value of A is:"+a);
	}
}

class B extends A
{
	int b=200;
	void show()
	{
		System.out.println("The value of B is:"+b);
	}
}

public class InheritanceTypes {

	public static void main(String[] args) 
	{
		B bobj=new B();
		System.out.println(bobj.a);  
		System.out.println(bobj.b);
		
		bobj.display();
		bobj.show();
	}

}
