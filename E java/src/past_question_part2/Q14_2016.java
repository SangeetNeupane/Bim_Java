package past_question_part2;
import java.util.*;
public class Q14_2016 {
	public static void main(String[] args)
	{
		Scanner av=new Scanner(System.in);
		System.out.println("Enter the name of 4 students.");
		String a[]=new String[4];
		for(int i=0;i<4;i++)
		{
			a[i]=av.nextLine();
		}
		int count=0;
		System.out.println("The name that has character t are :");
		for(int i=0;i<4;i++)
		{
			if(a[i].contains("t"))
			{
				System.out.println(a[i]);
				
			}
			
		}
	}

}
