package OOPsConcept;

public class ThisKeyword {
	
	int x,y;
	
	ThisKeyword(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	void display()
	{
		System.out.println("The value of X is:"+x);
		System.out.println("The value of Y is:"+y);
	}

	public static void main(String[] args) 
	{
		ThisKeyword th= new ThisKeyword(69,96);
		th.display();
	}

}
