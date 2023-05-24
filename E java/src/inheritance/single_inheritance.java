package inheritance;
class abc
{
	 int a=50,b=12;
	void add()
	{
		a=a+b;
		System.out.println("Add of two Number in Super class "+a);
	}
	
}
class xyz extends abc
{
	int a=30;
	void add()
	{
		super.add();// super keyword use
		a=a+b;
		System.out.println("Add of two Number in Sub class "+a);
		System.out.println("value of a= "+a);
		System.out.println("value of b= "+b);
	}
	
	

}

public class single_inheritance {

	public static void main(String[] args) {
		xyz rz =new xyz();
		rz.add();
		

	}

}
