package Array;

public class SearchElement {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,80,90};
		int findElement=90;
		boolean status=false;
		
		/*for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==findElement)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		}*/
		for(int x:a)
		{
			if(x ==findElement)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("Element not found");
		}
	}

}
