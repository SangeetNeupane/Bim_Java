package String_handling;

public class getcharsDemo
{
	public static void main(String[]args)
	{
		String a= "Our Classes of Java is in 7AM";
		int start =5;
		int end=10;
		char new_a[]=new char[end-start];
		a.getChars(start, end, new_a, 0);
		System.out.println(new_a);
	}

}
