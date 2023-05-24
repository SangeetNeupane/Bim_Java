
// 2D array  to find greater and smaller number
import java.util.*;
public class abc{

	public static void main(String[] args) {
		
		int i;
		int g;
		int s;
		int n;
		int b;
		int j;
		
		Scanner rz=new Scanner(System.in);
		System.out.println("Enter the size of row of array:");
		n=rz.nextInt();
		System.out.println("Enter the size of column of array:");
		b=rz.nextInt();
		int a[][]=new int[n][b];
		System.out.println("Enter the "+n+ "*"+b+ " numbers:-");
		for(i=0;i<n;i++)
		{
			for(j=0;j<b;j++) 
			{
			a[i][j]=rz.nextInt();
			}
		}
		g=s=a[0][0];
		for(i=0;i<n;i++)
		{
			for(j=0;j<b;j++) 
			{
				if(s>a[i][j])
			
			{
				s=a[i][j];
			}
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<b;j++) 
			{
				if(g<a[i][j])
			
			{
				g=a[i][j];
			}
			}
		}
		System.out.println("The greatest number in an array is "+g);
		System.out.println("The Smaller number in an array is "+s);
	}

}
