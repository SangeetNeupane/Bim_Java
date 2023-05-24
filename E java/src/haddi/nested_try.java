package haddi;

 class demo1 {
	void add()
	{
	try
	{
		int a=4;
		int b=5;
		int mul=(a+b)/b;
		System.out.println("the multipy is "+mul);
	try
	{
	int arr[]= {1,2};
	arr[3]=4;
	System.out.println("the value of array"+arr[3]);
	}
	
	
	
	
	catch(ArrayIndexOutOfBoundsException bd)
	{
		System.out.println(bd);
	}
	}
	catch(ArithmeticException bv)
	{
	System.out.println("ghjjj   "+bv);
	}
	}
}
	public class nested_try
	{
		public static void main(String[] args)
		{
		demo1 rz=new demo1();
				rz.add();
	}
	}
	
