package pastQuestion;

import java .util.*;
class student
{
	Scanner rz=new Scanner(System.in);
	int roll;
	void read() 
	{
		System.out.println("Enter the roll no of student:");
		roll=rz.nextInt();
	}
	void display()
	{
		System.out.println("Roll No: "+roll);
	}	
}
class test extends student
{
	int a;
	int b;
	void read()
	{
		super.read();
		System.out.println("Enter the mark of 1st Subject:");
	 	a=rz.nextInt();
		System.out.println("Enter the mark of 2nd Subject:");
		b=rz.nextInt();
	}
	void display()
	{
		super.display();
		System.out.println("Mark of 1st Subject: "+a);
		System.out.println("Mark of 2nd Subject: "+b);
	}
}
class result extends test
{
	int total;
	void calculate() 
	{
		super.read();
		total=a+b;
	}
	void display() 
	{
		super.display();
		System.out.println("Total marks: "+total);
	}
}

public class Inheritance_2017_Q12 {

	public static void main(String[] args) {
	 
	 result k=new result();
	 k.calculate();
	 k.display();
	}

}
