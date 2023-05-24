package reezu;
class suruchi implements Runnable
{
	public void run()
	{
		try
		{
		for(int i=100;i<=200;i++)
		{
			if((i%2==0)&&(i%3==0))
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
public class Q13_2022 
{
	public static void main(String[] args)
	{
		suruchi av=new suruchi();
				Thread t=new Thread(av);
		t.start();
	}
}
