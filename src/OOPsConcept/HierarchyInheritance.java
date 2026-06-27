package OOPsConcept;

class Parent
{
	int a;
	void display()
	{
		System.out.println("The value of A is:"+a);
	}
}
class child1 extends Parent
{
	int b;
	void show()
	{
		System.out.println("The value of B is:"+b);
	}
}
class child2 extends Parent
{
	int c;
	void print()
	{
		System.out.println("The value of C is:"+c);
	}
}

public class HierarchyInheritance {

	public static void main(String[] args) 
	{
		child1 ch1=new child1();
		ch1.a=123;
		ch1.b=456;
		ch1.display();
		ch1.show();
		
		child2 ch2 =new child2();
		ch2.c=789;
		ch2.a=321;
		ch2.display();
		ch2.print();

	}

}
