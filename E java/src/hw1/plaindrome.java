package hw1;

import java.util.*;
public class plaindrome 
{
	void check(int a)
	{
		int rev=0;
		int r=a;
		int temp=0;
		while(a!=0)
		{
			temp=a%10;
			rev=(rev*10)+temp;
			a=a/10;
		}
		if(r==rev)
		{
			System.out.println("The number is palindrome.");
		}
		else
		{
			System.out.println("The number is not palindrome.");
		}
	}
	public static void main(String[] args)
	{
		Scanner av=new Scanner(System.in);
		System.out.println("Enter the number you want to check : ");
		int num=av.nextInt();
		plaindrome pd=new plaindrome();
		pd.check(num);
	}
}
