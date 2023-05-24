package haddi;
import java.util.*;
class exam
{
	void past()
	{
		System.out.println("enter the size of m and n");
		Scanner bv=new Scanner(System.in);
			int m=bv.nextInt();
			int n=bv.nextInt();
		int m1[][]=new int[m][n];
		System.out.println("enter the element");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				m1[i][j]=bv.nextInt();
			}
		}
			int sum=0;
			System.out.println("the sum is:");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					sum=sum+m1[i][j];
				}
			}
			System.out.println(sum);
		}
		
	}

public class matrix_sum {
	public static void main(String[] args)
	{
		exam rz=new exam();
		rz.past();
	}

}
