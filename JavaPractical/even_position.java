package JavaPractical;
import java.util.*;
class even_position_array
{
	void even_Demo()
	{
		Scanner rz=new Scanner(System.in);
		System.out.println("Enter the Size of Array:-");
		int n=rz.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the data in Array:-");
		for(int i=0;i<n;i++)
		{
			a[i]=rz.nextInt();
		}
		System.out.println("The data in Array are:-");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.println("The data present in even position of Array are:-");
		for(int i=1;i<n;i=i+2)
		{
			System.out.print(a[i]+" ");
		}
	}
}
public class even_position {

	public static void main(String[] args)
{
		even_position_array rk=new even_position_array();
		rk.even_Demo();

	}

}
