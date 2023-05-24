package reezu;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		Scanner rz= new Scanner (System.in);
		System.out.println("Enter the two number:-");
		int a=rz.nextInt();
		int b=rz.nextInt();
		int d=b-a;
		
		int rk[]=new int[d];
		a=a+1;
		d=d-1;
		for(int i=0;i<d;i++)
		{
			rk[i]=a++;
		}
		for(int i=0;i<d;i++)
		{
			System.out.println(rk[i]);
		}
		int rem=0;
		System.out.println("Prime Number are:-");
		for(int i=0;i<d;i++)
		{
			for(int j=2;j<rk[i];j++)
			{
					
				rem=0;
				if(rk[i]%j==0)
				{
					rem=1;
					break;
				}
				
			}
			if(rem==0)
			{
				System.out.println(rk[i]);
			}
			}
		}
		
		
	}

