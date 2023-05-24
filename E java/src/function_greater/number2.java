//with_return_with_argument
package function_greater;

import java.util.Scanner;

class number2 {
	int i;
	int g;
	
	
	int greater(int a[])
	{

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
		
		Scanner rz=new Scanner(System.in);
		int x[]=new int[4];
		System.out.println("Enter the 4 numbers:-");
		for(int j=0;j<4;j++)
		{
			x[j]=rz.nextInt();
		}

		number2 rk =new number2();
		int a=rk.greater(x);
		System.out.println("The greatest number among the numbers is "+a);
	}

}
