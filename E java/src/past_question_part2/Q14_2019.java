package past_question_part2;
import java.util.*;
public class Q14_2019
{
	public static void main(String [] args)
	{
		Scanner av=new Scanner(System.in);
		System.out.println("Enter the name of 7 countries : ");
		String a[]=new String[7];
		for(int i=0;i<7;i++)
		{
			a[i]=av.nextLine();
		}
		int count=0;
		System.out.println("The  country names with vowel are :");
		for(int i=0;i<7;i++)
		{
			if(a[i].endsWith("a")||a[i].endsWith("e")||a[i].endsWith("i")||a[i].endsWith("o")||a[i].endsWith("u"))
			{
				System.out.println(a[i]);
				count++;
			}
		}
		System.out.println("There are "+count+" country names with vowel");
	}
}
