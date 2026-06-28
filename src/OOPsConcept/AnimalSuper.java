package OOPsConcept;

public class AnimalSuper 
{
	String color="Blue";
	void eat()
	{
		System.out.println("Eating Roti...");
	}
}

class Dog extends AnimalSuper
{
	String color="Red";
	
	void displayColor()
	{
		System.out.println(color); //showing of child class
		System.out.println(super.color); //showing of parent class due to super keyword
	}
	void eat()
	{
		System.out.println("Eating Bread..."); //showing of child class
		super.eat(); //showing of parent class due to super keyword
	}
}