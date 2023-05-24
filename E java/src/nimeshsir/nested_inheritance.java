package nimeshsir;
class reezu
{
	int a=5;
	class sanu 
	{
		void sanu_reezu()
		{
			System.out.println("My Cutest Sanu.");
			
		}
	}
	sanu rk=new  sanu();
	void cutest() 
	{
		rk.sanu_reezu();
		int b=a+a;
		System.out.println("B="+b);
		System.out.println("Cutest Sanu");
	}
}
class kanxu 
{
	reezu rz=new reezu();
	
	void kanxu1()
	{
		rz.cutest();
		System.out.println("Take care Sanu");
		
	}
}

public class nested_inheritance {

	public static void main(String[] args) {
		kanxu rs=new kanxu();
		rs.kanxu1();

	}

}
