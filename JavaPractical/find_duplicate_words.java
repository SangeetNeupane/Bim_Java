package JavaPractical;
import java.util.*;
public class find_duplicate_words 
{
	public static void main(String[] args)
	{
		Scanner rz=new Scanner(System.in);
		System.out.println("Enter the String:-");
		String a =rz.nextLine();
		a=a.toLowerCase();
		int count;
		String word[]=a.split(" ");
		
		for(int i=0;i<word.length;i++)
		{
			count=1;
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equals(word[j]))
				{
					word[j]="0";
					count++;
				}
			}
			if(count>1 && word[i]!="0")
			{
				System.out.println(word[i]);
			}
		}

	}

}
