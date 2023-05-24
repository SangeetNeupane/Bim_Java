package JavaPractical;
import java.util.*;
class third_largest
{
	void thirdDemo()
	{
		Scanner rz =new Scanner(System.in);
		System.out.println("Enter the size of array:-");
		int n=rz.nextInt();
		int td[]=new int[n];
		System.out.println("Enter The Data In Array:-");
		for(int i=0;i<n;i++)
		{
			td[i]=rz.nextInt();
		}
		System.out.println("The Data In Array are:-");
		for(int i=0;i<n;i++)
		{
			System.out.print(td[i]+" ");
			
		}
		System.out.println("");
		int temp;
		for (int i=0;i<n;i++)
		{
			for (int j=i+1;j<n;j++)
			{
			if(td[i]<td[j])
			{
				temp=td[i];
				td[i]=td[j];
				td[j]=temp;
			}
			}
		}
		System.out.println("The third largest element of array is "+td[2]);
	}
}

public class third_largest_element {

	public static void main(String[] args) {
		third_largest rk=new third_largest();
		rk.thirdDemo();

	}

}
