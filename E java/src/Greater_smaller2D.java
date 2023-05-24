// 2D array  to find greater and smaller number
import java.util.*;
public class Greater_smaller2D {

	public static void main(String[] args) {
		
		int i;
		int g;
		int s;
		int r;
		int c;
		int j;
		Scanner rz=new Scanner(System.in);
		System.out.println("Enter the row size of array:");
		r=rz.nextInt();
		System.out.println("Enter the column size of array:");
		c=rz.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter the "+r+" * " +c+ " numbers:-");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
			a[i][j]=rz.nextInt();
		}
		}
		g=s=a[0][0];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
			if(s>a[i][j])
			{
				s=a[i][j];
			}
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
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
