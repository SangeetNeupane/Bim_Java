//1d linear searching
import java.util.*;
public class linear_searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rz = new Scanner(System.in);
		
		System.out.println("How many numbers you want  to enter ?");
		int n=rz.nextInt();
		int a[]=new int [n];
		System.out.println("Enter the "+n+" numbers in array");
		for(int i=0;i<n;i++)
		{
			a[i]=rz.nextInt();
		}
		System.out.println("Enter the  numbers you want to search position  in array");
		int b=rz.nextInt();
		int temp=0;
		int z=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==b)
			{
				temp=1;
				z=i;
				break;
			}	
		}
		if(temp==1)
		{
			System.out.println("The number you have entered is present in "+z+"(array starts with zero) position of the given array");	
		}
	}

}
