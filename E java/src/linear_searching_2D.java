//linear searching 2D
import java.util.*;
public class linear_searching_2D {
	public static void main(String[] args)
	{
       Scanner rz = new Scanner(System.in);
		
		System.out.println("How many rows you want  to enter ?");
		int n=rz.nextInt();
		System.out.println("How many column you want  to enter ?");
		int c=rz.nextInt();
		int a[][]=new int [n][c];
		System.out.println("Enter the "+n+ "*"+c+" numbers in array");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<c;j++)
			{
			a[i][j]=rz.nextInt();
			}
		}
		System.out.println("Enter the  numbers you want to search position  in array");
		int b=rz.nextInt();
		int temp=0;
		int z=0;
		int y=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<c;j++)
			{
			if(a[i][j]==b)
			{
				temp=1;
				z=i;
				y=j;
				
				break;
			}	
		}
		}
		if(temp==1)
		{
			System.out.println("The number you have entered is present in a["+z+"]["+y+"] position of the given array");	
		}
		
	}
}

