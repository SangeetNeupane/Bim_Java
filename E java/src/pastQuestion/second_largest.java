package pastQuestion;
import java.util.*;
class array_2nd
{
	Scanner rz=new Scanner(System.in);
	void array() 
	{
		System.out.println("Enter the size of array:-");
		int n=rz.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the numbers of array:-");
		for(int i=0;i<n;i++)
		{
			arr[i]=rz.nextInt();
		}
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("The Second largest element of array is "+arr[1]);
		
	}
}

public class second_largest {

	public static void main(String[] args) {
		array_2nd rk=new array_2nd();
		rk.array();
		
	}

}
