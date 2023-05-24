package hw1;

import java.util.*;
public class fibonacci
{
	void series()
	{
		Scanner av=new Scanner(System.in);
		System.out.println("Enter how many terms you want to print fibonacci series : ");
		int n=av.nextInt();
		int a=0,b=1,c;
		System.out.println("Fibonacci series till "+n+" terms are : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a+ " , ");
			c=a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args)
	{
		fibonacci ab=new fibonacci();
		ab.series();
	}
}