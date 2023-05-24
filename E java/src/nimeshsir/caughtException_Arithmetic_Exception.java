package nimeshsir;

public class caughtException_Arithmetic_Exception {

	public static void main(String[] args)
	{
		try{
			 int a=8;
			 int b=20/(a-a);
			 System.out.println(b);
			 }
			 catch(ArithmeticException rz)
			  {
			  System.out.println(rz);
			  }
		finally
		{
			
			System.out.println(" Exception handled and It is executed");
			}
	}

}
