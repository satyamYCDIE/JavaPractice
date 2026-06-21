package Array;

public class FindMissingNumber {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,5};
		int n=5;
		int ActualSum=0;
		
		int ExpectedSum=n*(n+1)/2;
		System.out.println(ExpectedSum);
		for(int i=0;i<a.length;i++)
		{
			ActualSum=ActualSum+a[i];
		}
		System.out.println(ActualSum);
		int MissingNum=ExpectedSum-ActualSum;
		if(MissingNum==0)
		{
			System.out.println("No number is missing from Array");
		}
		else
		{
		System.out.println("The missing number from the array is: "+MissingNum);
		}
	}

}
