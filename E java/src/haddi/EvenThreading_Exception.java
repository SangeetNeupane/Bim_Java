package haddi;

public class EvenThreading_Exception
{
	public static void main(String[] args)
	{
		try
		{
			for(int i=0;i<200;i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
					Thread.sleep(1000);
				}
			}
		}
		catch(InterruptedException a)
		{
			System.out.println(a);
		}
	}
}
