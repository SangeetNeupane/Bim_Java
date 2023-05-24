package constructor;

import java.util.Scanner;

class parameterized_cons {
	
	parameterized_cons(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition= "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner rz=new Scanner(System.in);
		System.out.println("Enter the two numbers:-");
		int x=rz.nextInt();
		int y=rz.nextInt();
		parameterized_cons rk=new parameterized_cons( x,y);
	}

}
