package nimeshsir;
class abcd
{
	void results()
	{
		try {
			int a=8;
			int b=2;
			int c=a/b;
			System.out.println("Divide:"+c);
			try {
				int arr[]= {6,5};
				arr[6]=5;
				System.out.println("num:"+arr[1]);	
			}
			
			
			catch(ArrayIndexOutOfBoundsException rk)
			{
				System.out.println("Caught ArrayIndexOutOfBoundsException ");
				System.out.println(rk);
			}
		}
		catch(ArithmeticException rk)
		{
			System.out.println("Caught ArithmeticException ");
			System.out.println(rk);
		}
		finally {
			System.out.println("Finally Works");
		}
	}
}

public class nested_try1 {

	public static void main(String[] args) {
		abcd rz =new abcd();
		rz.results();


	}

}
