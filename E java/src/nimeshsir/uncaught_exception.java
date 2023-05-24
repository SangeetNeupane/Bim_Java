
package nimeshsir;

public class uncaught_exception  {

	public static void main(String[] args)
	{
		try{
			 int a=8;
			 int b=20/(a-a);
			 System.out.println(b);
			 }
			 
		finally
		{
			
			System.out.println(" Exception not handled and It is executed");
			}
	}

}
