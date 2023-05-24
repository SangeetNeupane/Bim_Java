package nimeshsir;
interface data_1
{
	void sum();
	interface data_2
	{
		void difference();
	}
}
class nestedInterface implements data_1,data_1.data_2
{
	public void sum() 
	{
		int a=5;
		int b=10;
		int sum=a+b;
		System.out.println("Sum of 5 and 10 is "+sum);
	}
	public void difference() {
		int a=5;
		int b=10;
		int difference=b-a;
		System.out.println("Difference of 10 and 5 is "+difference);
		
	}
}
public class interface_nested {

	public static void main(String[] args) {
		data_1 rz=new nestedInterface();
		data_1.data_2 rk=new nestedInterface();
		rz.sum();
		rk.difference();
	}

}
