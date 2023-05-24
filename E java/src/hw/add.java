package hw;


import java .util.*;
class add
{ 
	int a;
	int b;
	int c; 
	add()
	{
		Scanner rz=new Scanner(System.in);
		System.out.println("Enter the two numbers:-");
		a=rz.nextInt();
		b=rz.nextInt();
		c=a+b;
		System.out.println("Addition= "+c);
		
	}
	public static void main(String[]args)
	{
		add rk=new add();
	}
}

