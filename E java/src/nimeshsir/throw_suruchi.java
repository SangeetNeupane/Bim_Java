package nimeshsir;
class suruchi32
{
	void check()
	{
		try
		{
			throw new ArrayIndexOutOfBoundsException("Error found .");
		}
		catch(Exception e)
		{
			System.out.println("Error caught ."+e);
			throw e;
		}
	}
}
public class throw_suruchi 
{
	public static void main(String[] args)
	{
		suruchi32 ob=new suruchi32();
		try
		{
			ob.check();
		}
		catch(Exception e)
		{
			System.out.println("Wrong vayo . "+e);
		}
	}
}
