package reezu;
interface abc
{
	void sum();
	void sub();
}
interface xyz extends abc
{
	void mul();
	void div();
}
class sangeet implements xyz
{
		int a=12;
		int b=6;
	public void sum()
	{
		int c=a+b;
		System.out.println("Sum="+c);
	}
	public void sub()
	{	
		int c=a-b;
		System.out.println("Sub="+c);
	}
	public void mul()
	{
		int c=a*b;
		System.out.println("Mul="+c);
	}
	public void div()
	{	
		int c=a/b;
		System.out.println("Div="+c);
	}
	
}
public class extended_interface {

	public static void main(String[] args)
	{
		
		xyz rs=new sangeet();
		rs.sum();
		rs.sub();
		rs.mul();
		rs.div();
	}

}
