//with_return_without_argument
package function_greater;

import java.util.Scanner;

class number3{
	int i;
	int g;
	
	
	
	int greater()
	{
		Scanner rz=new Scanner(System.in);
		int a[]=new int[4];
		System.out.println("Enter the 4 numbers:-");
		for(i=0;i<4;i++)
		{
			a[i]=rz.nextInt();
		}
		g=a[0];
		
		for(i=0;i<4;i++)
		{
			if(g<a[i])
			{
				g=a[i];
			}
		}
		return g;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		number3 rk =new number3();
		int x=rk.greater();
		System.out.println("The greatest number among the numbers is "+x);
	}

}
