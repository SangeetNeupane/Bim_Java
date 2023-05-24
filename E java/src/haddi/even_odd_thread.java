package haddi;
class even implements Runnable
{
	public void run()
	{
	try
	{
		for(int i=0;i<100;i++)
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
class odd implements Runnable
{
public void run()
{
try
{
	for(int i=101;i<200;i++)
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
}
}
public class even_odd_thread {
	public static void main(String[] args) {
		even rz=new even();
		odd rk=new odd();
		Thread t1=new Thread(rz);
		t1.start();
		Thread t2=new Thread(rk);
		t2.start();
		
		
	}

}
