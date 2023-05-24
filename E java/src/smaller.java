// 1D array  to find  smaller number
	import java.util.*;
	public class smaller {

		public static void main(String[] args) {
			
			int i;
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
			s=a[0];
			for(i=0;i<n;i++)
			{
				if(s>a[i])
				{
					s=a[i];
				}
			}
			System.out.println("The Smaller number in an array is "+s);
		}

	}

