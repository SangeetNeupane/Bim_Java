package haddi;
class odd1 extends Thread
{
	public void run()
	{
		try
		{
		for(int i=1;i<=50;i++)
		{
			if(i%2!=0)
			{
	
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
		}
		catch(InterruptedException e)
		{
		System.out.println(e);
		}	
}}
	class even1 extends Thread
	{
		public void run()
		{
			try
			{
				for(int i=50;i<=100;i++)
				{
					if(i%2==0)
					{
						System.out.println(i);
						Thread.sleep(1500);
					}
				}
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}

public class odd_even {

	public static void main(String[] args) {
		odd1 rz=new odd1();
		even1 rk=new even1();
		
		rz.start();
		rk.start();
		
	}
		// TODO Auto-generated method stub

	}


