package constructor;

import java.util.Scanner;



class number {
	int i;
	int g;
   number()
    {
	   System.out.println("mero naam haddi ho");
	}

	void suruchi()
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
		System.out.println("The greatest number among the numbers is "+g);
		
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub

	number rk =new number();
	rk.suruchi();
	}
}
