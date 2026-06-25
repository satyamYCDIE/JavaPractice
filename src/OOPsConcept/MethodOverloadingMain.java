package OOPsConcept;

public class MethodOverloadingMain {

	public static void main(String[] args) 
	{
		
		MethodOverloading add=new MethodOverloading();
		
		add.sum();
		add.sum(12,34);
		add.sum(198, 101.45);
		add.sum(123.45, 453);
		add.sum(123, 234, 45);
	}

}
