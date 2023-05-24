package haddi;
import java.util.*;
class country
{
	String name[]=new String[10];
	void display()
	{
		Scanner bv=new Scanner(System.in);
		System.out.println("enter the name of country");
		for(int i=0;i<10;i++)
		{
		name[i]=bv.nextLine();
		}
		for(int i=0;i<10;i++)
		{
			if(name[i].endsWith("a"))
			{
				System.out.println(name[i]);
			}
		}
	}
}


public class countries_name {
	public static void main(String[] argssca)
	{
		country bd=new country();
		bd.display();
}
}
