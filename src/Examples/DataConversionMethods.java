package Examples;

public class DataConversionMethods {

	public static void main(String[] args) 
	{
		//String to integer
		String a="12345";
		String b="123";
		System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
		
		//String to Double
		String c="12.12";
		String d="23.45";
		System.out.println(Double.parseDouble(c)+Double.parseDouble(d));

		//String to boolean
		String e="false";
		System.out.println(Boolean.parseBoolean(e));
		
		//String to char not possible
		
		//integer,double,boolean,char to String
		
		int f=123;
		double g=23.45;
		boolean bool=false;
		char ch='A';
		
		String s1=String.valueOf(f);
		System.out.println(s1);
		
		String s2=String.valueOf(g);
		System.out.println(s2);
		
		String s3=String.valueOf(bool);
		System.out.println(s3);
		
		String s4=String.valueOf(ch);
		System.out.println(s4);
	}

}
