package this_keyword;



import java.util.Scanner;

class parameterized_cons {
	int a;
	int b;
	
	parameterized_cons(int a,int b)
	{
		this.a=a+b;
		this.b=a-b;
		
		System.out.println("Subtraction= "+this.b);
		System.out.println("Addition= "+this.a);
		//System.out.println("Subtraction= %d",this.b);
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
