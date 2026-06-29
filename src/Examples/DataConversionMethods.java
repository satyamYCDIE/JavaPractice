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
	}

}
