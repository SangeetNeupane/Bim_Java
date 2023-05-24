package String_handling;

public class comparision_string 
{

	public static void main(String[] args)
	{
		String a="Sanu";
		String b="sanu";
		String c="sAnu";
		String d="Reezu";
		String e="Sanu";
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a.equals(e));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(a.equalsIgnoreCase(e));
		
	}

}
