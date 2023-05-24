package haddi;
class reeja
{
	void sangeet()throws IllegalAccessException
	{
	throw new IllegalAccessException("error occurs");	
	}
}
public class throws_suruchi {
	public static void main(String[] args)
	{
		reeja av=new reeja();
		try
		{
			av.sangeet();	
		}
		catch(Exception e)
		{
		System.out.println("exception found");
		System.out.println(e);
		}
	}	
}
		
	
	 


