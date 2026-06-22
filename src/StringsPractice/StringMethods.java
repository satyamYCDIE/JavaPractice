package StringsPractice;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) 
	{
		//Length counting
		String s="Welcome";
		System.out.println(s.length());
		
		//Concatenation...
		String s1="Welcome ";
		String s2="to java ";
		String s3="Automation";
		System.out.println(s1.concat(s2).concat(s3));
		
		//Trim.....
		String a="   Automation   ";
		System.out.println(a);
		System.out.println(a.trim());
		
		//charAt.......
		String b="Automation";
		System.out.println(b.charAt(8));
		
		//Contains......
		String c="Automation";
		System.out.println(c.contains("tom"));
		
		//equals and equalsIgnoreCase......
		String d="Automation";
		String e="automation";
		System.out.println(d.equals(e));
		System.out.println(d.equalsIgnoreCase(e));
		
		//replace......
		String f="Welcome to java programming java automation java language";
		System.out.println(f.replace('a','x'));
		System.out.println(f.replace("java","python"));
		
		//Substring.......
		String g="Automation";
		System.out.println(g.substring(1,5));
		System.out.println(g.substring(0,5));
		
		//toUpperCase and toLowerCase.......
		String h="Automation";
		System.out.println(h.toUpperCase());
		System.out.println(h.toLowerCase());
		
		//split......
		String i="satyam20sarha@gmail.com";
		String j[]=i.split("@");
		System.out.println(Arrays.toString(j));
		System.out.println(j[0]);
		System.out.println(j[1]);
	}

}
