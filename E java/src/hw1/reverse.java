package hw1;

import java.util.*;

class Super_ab
{
	int l;
	void sup(int a)
	{
		l=a;
		System.out.println("The number you have entered is "+l);
		
	}
	}

class Sub_ab extends Super_ab
{
	int reversing()
	{
		int rev=0,rem=0;
		while(l!=0)
		{
			rem=l%10;
			rev=rev*10+rem;
			l=l/10;
		}
		return rev;
	}
	
}
public class reverse {

	public static void main(String[] args) {
	
		Scanner rz=new Scanner(System.in);
		System.out.println("Enter the number to reverse:-");
		int n=rz.nextInt();
		Sub_ab rk=new Sub_ab();
		rk.sup(n);
		int Store=rk.reversing();
		System.out.println("The reserved of the number is"+Store);
		
		

	}

}
