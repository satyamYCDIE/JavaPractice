package Array;

public class FindDuplicate {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,10,10,20,30,40};
		int num=10;
		int count=0;
		
		for(int x:a)
		{
			if(x==num)
			{
				count++;
			}
		}
		System.out.println("The count of "+num+" in the array list is:"+count);
	}

}
