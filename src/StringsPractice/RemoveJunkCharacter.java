package StringsPractice;

import java.util.Scanner;

public class RemoveJunkCharacter {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to remove junk");
		String str=sc.next();
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("After removing junk: " + str);
        
        sc.close();
	}

}
