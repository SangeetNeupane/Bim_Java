package JavaPractical;
import java.util.*;
public class remove_duplicate_numbers_array {

	public static void main(String[] args)
	{
		Scanner rz =new Scanner(System.in);
		System.out.println("Enter the size of array:-");
		int n=rz.nextInt();
		int a[]=new int[n];
		int temp[]=new int[n];
		System.out.println("Enter The Data In Array:-");
		for(int i=0;i<n;i++)
		{
			a[i]=rz.nextInt();
		}
		Arrays.sort(a);
		System.out.println("The Sorted Data In Array are:-");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println("");
		int p=a.length;
		int j=0;
		for(int i=0;i<p-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j]=a[i];
				j++;
			}
		}
		temp[j]=a[p-1];
		
		System.out.println("After Removed duplicate  data in Sorted Array are:-");
		for(int k=0;k<j+1;k++)
		{
			System.out.print(temp[k]+" ");
		}
	}

}
