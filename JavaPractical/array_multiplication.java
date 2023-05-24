package JavaPractical;
import java.util.*;
public class array_multiplication {

	public static void main(String[] args) {
		Scanner rz=new Scanner(System.in);
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		int i,j,k;
		System.out.println("Enter the matrix-A(2*2):-");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]=rz.nextInt();
			}
		}
		System.out.println("Enter the matrix-B(2*2):-");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				b[i][j]=rz.nextInt();
			}
		}
		System.out.println("The matrix-A(2*2) is:-");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The matrix-B(2*2) is:-");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				for(k=0;k<2;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("The multiplication of Matrix A & B(2*2) is:-");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
			
	}

}
