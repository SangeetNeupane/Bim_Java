package reezu;
class ThreadA implements Runnable
{
	public void run()
	{
		for(int i=50;i<=100;i++)
		{
			try
		{
			if(i%2==0)
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
}
class ThreadB implements Runnable
{
	public void run()
	{
		for(int i=100;i<=200;i++)
		{
			try
		{
			if(i%2!=0)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
public class Q12_2016 
{
	public static void main(String[] args)
	{
		ThreadA av=new ThreadA();
		ThreadB ar=new ThreadB();
		Thread t1=new Thread(av);
		Thread t2=new Thread(ar);
		t1.start();
		t2.start();
	}
}
