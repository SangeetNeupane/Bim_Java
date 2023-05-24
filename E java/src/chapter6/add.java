package chapter6;
import java.util.*;
public class add 
{
int a,b;
void input_data()
{
	Scanner rz=new Scanner(System.in);
	System.out.println("Enter the two numbers:-");
	a=rz.nextInt();
	b=rz.nextInt();
}
void output_data1()
{
	System.out.println("Addition="+(a+b));
}

public static void main (String[]args)
{
	add sum=new add();
	sum.input_data();
	sum.output_data1();
}
}
