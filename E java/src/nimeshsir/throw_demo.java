package nimeshsir;
class throw_keywords
{
	void protect()
	{
		try
		{
			throw new ArithmeticException("Error Arithmetic Exception");
		}
		catch(Exception e)
		{
			System.out.println("Caught Error Arithmetic Exception. "+e);
			throw e;
		}
	}
}
public class throw_demo {

	public static void main(String[] args) {
		throw_keywords rz =new throw_keywords();
		try
		{
			rz.protect();
		}
		catch(Exception e)
		{
			System.out.println("abc Again Caught Error"+e);	
		}
	}

}
