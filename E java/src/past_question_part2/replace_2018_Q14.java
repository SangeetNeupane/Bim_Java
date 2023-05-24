package past_question_part2;
import java.util.*;
public class replace_2018_Q14 {

	public static void main(String[] args)
	{
		Scanner rz=new Scanner(System.in);
		int n=10;
		String a[]=new String[n];
		System.out.println("Enter the "+n+" Names:-");
		for(int i=0;i<10;i++)
		{
			a[i]=rz.nextLine();
		}
		String b[]=new String[n];
		for(int i=0;i<10;i++)
		{
			b[i]=a[i].replace('i','!');
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(b[i]);
		}
		
	}

}
