package JavaPractical;
import java.util.*;
public class count {

	public static void main(String[] args)
	{
	Scanner rz=new Scanner(System.in);
	String a;
	System.out.println("Enter the string:-");
	a=rz.nextLine();
	a=a.toLowerCase();
	int vowel=0;
	int constant=0;
	int word=1;
	int len=a.length();
	for(int i=0;i<len;i++)
	{
		if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
		{
			vowel++;
		}
		else if(a.charAt(i)==' ')
		{
			word++;
		}
		else
		{
			constant++;
		}
	}
	System.out.println("Word Count= "+word+" Vowels Count= "+vowel+" & Constant Count= "+constant);
	}

}
