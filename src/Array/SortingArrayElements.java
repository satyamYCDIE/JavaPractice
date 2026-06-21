package Array;

import java.util.Arrays;

public class SortingArrayElements {

	public static void main(String[] args) 
	{
		//number sorting..
		int a[]= {10,99,67,54,89,69,88};
		
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(a));
		
		//String sorting....
		
		String s[]= {"satyam","ankit","chirag","monu","chini","silpi","avi"};
		
		System.out.println("Before sorting :"+Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After Sorting : "+Arrays.toString(s));
	}

}
