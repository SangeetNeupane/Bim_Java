package exam;
class threading implements Runnable
{
	String a;
	Thread rz;
	threading(String a)
	{
		this.a=a;
	    rz=new Thread(this);
	    rz.start();
	}
	public void run() 
	{
		try
		{
		for(int i=0;i<3;i++)
		{
			System.out.println(a);
			Thread.sleep(2000);
		}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
public class Q16_2017_MultiThreading_example
{
	public static void main(String[] args)
	{
		threading av=new threading("hate");
		threading ar=new threading("you");
	}
	
}
