//without_return_with_argument
package function_greater;

import java.util.Scanner;

class number1 {
	int i;
	int g;
	
	
	
	void greater(int a[])
	{

		g=a[0];
		
		for(i=0;i<4;i++)
		{
			if(g<a[i])
			{
				g=a[i];
			}
		}
		System.out.println("The greatest number among the numbers is "+g);
		
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

		number1 rk =new number1();
		rk.greater(x);
	}

}
