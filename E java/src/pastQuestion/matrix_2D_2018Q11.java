package pastQuestion;

import java.util.Scanner;

class matrix
{
	void sum() {
		Scanner rz=new Scanner(System.in);
		System.out.println("Enter the row size of array:");
		int m=rz.nextInt();
		System.out.println("Enter the column size of array:");
		int n=rz.nextInt();
		int a[][]=new int[m][n];
		System.out.println("Enter the "+m+" * " +n+ " numbers:-");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			a[i][j]=rz.nextInt();
		}
		}
		int sum=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			    sum=sum+a[i][j];
		}
		}
		System.out.println("The sum of elements is:- "+sum);
	}
}

public class matrix_2D_2018Q11 {

	public static void main(String[] args) {
		matrix rk=new matrix();
		rk.sum();

	}

}
