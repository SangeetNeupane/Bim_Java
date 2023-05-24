package JavaPractical;
import java.util.*;
public class plaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rz=new Scanner(System.in);
		System.out.println("Enter the String");
		String a;
		String b="";
		a=rz.nextLine();
		System.out.println("Given String is "+a);
		int c=a.length();
		for(int i=c-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println("Reverse String is "+b);
		if(a.equals(b))
		{
			System.out.println("Given String is Plaindrome.");
		}
		else
		{
			System.out.println("Given String isnot Plaindrome.");
		}
		}

}
