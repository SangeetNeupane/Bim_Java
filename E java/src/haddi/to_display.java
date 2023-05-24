package haddi;
import java.util.*;
class prime
{
	public void exam1()
	
	{
	int l;
	int h;
	int i,j;
	int temp=0;
	Scanner bv=new Scanner(System.in);
	System.out.println("enter the two numer");
	l=bv.nextInt();
	h=bv.nextInt();
	int k=h-l;
	int []a=new int[k];
	for(i=l;i<h;i++)
	{
		System.out.println(a[i]);
	}
		for(i=l;i<h;i++)
		{
			for(j=2;j<a[i];j++)
			{
			if(a[i]>1)
			{
				temp=1;
				if(a[i]%j==0)
				{
					temp=0;
					break;
				}
			}
			}
		}
	
	
	if(temp==0)
	{	
		System.out.println(a[i]);
	}
	}
	}
public class to_display {
	public static void main(String[] args)
	{
	prime bd=new prime();
	bd.exam1();
	}
}
	


