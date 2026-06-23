package StringsPractice;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to remove white spaces");
		String str=sc.nextLine();
		
		str = str.replaceAll(" ", "");

        System.out.println("After removing Spaces from the string: " + str);
        
        sc.close();

	}

}
