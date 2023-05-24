package nimeshsir;
//can interface be extended
interface casio
{
	void sum();
	void difference();
}
interface yasuda extends casio{
	void multiply();
	void divide();
}
class extended_interface implements yasuda{
	public void sum() 
	{
		int a=5;
		int b=10;
		int sum=a+b;
		System.out.println("Sum of 5 and 10 is "+sum);
	}
	public void difference() 
	{
		int a=5;
		int b=10;
		int difference=b-a;
		System.out.println("Difference of 10 and 5 is "+difference);
	}
	public void multiply() 
	{
		int a=5;
		int b=10;
		int multiply=a*b;
		System.out.println("Multiply of 10 and 5 is "+multiply);
	}
	public void divide() 
	{
		int a=5;
		int b=10;
		int divide=b/a;
		System.out.println("Divide of 10 by 5 is "+divide);
	}
}
public class interface_extended {

	public static void main(String[] args) {
		extended_interface rs=new extended_interface();
		rs.sum();
		rs.multiply();
		rs.difference();
		rs.divide();
	}

}
