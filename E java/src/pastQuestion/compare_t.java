package pastQuestion;
import java.util.*;

class name{
	void Q14_2016()
	{
		Scanner rz=new Scanner(System.in);
		String a[]= new String[4];
		System.out.println("Enter the names:");
		for(int i=0;i<4;i++)
		{
		 a[i]  =rz.nextLine();
		}
		System.out.println("The names starts with t are: ");
		for(int i=0;i<4;i++)
		{
		 if(a[i].startsWith("t")||a[i].startsWith("T")) 
		 {
			 System.out.println(a[i]);
		 }
		}
	}
}
public class compare_t
{

	public static void main(String[] args) 
	{
		
		name rk=new name();
		rk.Q14_2016();
	}

}
