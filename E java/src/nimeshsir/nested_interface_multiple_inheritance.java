package nimeshsir;
interface A{
	interface B
	{
		void sum();
	}
	interface C
	{
		void differ();
	}
}
class nested_interface implements A.B,A.C
{
	public void sum()
	{
		int a=5;
		int b=8;
		int sum=a+b;
		System.out.println("Sum of a+b :"+sum);
		System.out.println("Inheritace of A.B");
	}
	public void differ()
	{
		int a=9;
		int b=6;
		int diff=a-b;
		System.out.println("Difference of a-b :"+diff);
		System.out.println("Inheritace of A.C");
	}
}
public class nested_interface_multiple_inheritance 
{

	public static void main(String[] args) 
	{
		A.B rz=new nested_interface();//nested_interface rz=new nested_interface();
		A.C rk=new nested_interface();
		rz.sum();
		rk.differ();

	}

}
