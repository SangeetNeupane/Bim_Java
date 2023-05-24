package reezu;
class number implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=1;i<=20;i++)
				
			{
				
			System.out.println(i);
			Thread.sleep(2000);
			}
				
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}

public class Q12_2015 {
public static void main(String[] args)
{
	number rz=new number();
	Thread t1=new Thread(rz);
	t1.start();
	
}
}
