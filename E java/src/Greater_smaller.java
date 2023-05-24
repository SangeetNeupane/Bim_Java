// 1D array  to find greater and smaller number
import java.util.*;
public class Greater_smaller {

	public static void main(String[] args) {
		
		int i;
		int g;
		int s;
		int n;
		System.out.println("Enter the size of array:");
		Scanner rz=new Scanner(System.in);
		n=rz.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the "+n+ " numbers:-");
		for(i=0;i<n;i++)
		{
			a[i]=rz.nextInt();
		}
		g=s=a[0];
		for(i=0;i<n;i++)
		{
			if(s>a[i])
			{
				s=a[i];
			}
		}
		for(i=0;i<n;i++)
		{
			if(g<a[i])
			{
				g=a[i];
			}
		}
		System.out.println("The greatest number in an array is "+g);
		System.out.println("The Smaller number in an array is "+s);
	}

}
