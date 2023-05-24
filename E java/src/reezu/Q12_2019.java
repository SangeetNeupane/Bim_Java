package reezu;
class month1 implements Runnable
{
	public void run() {
		try {
			String m[]= {"jan","feb","mar","april","may","june","july","august","september","october","november","december"};
			
			for(int i=0;i<12;i++)
			{
				System.out.println(m[i]);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
class week1 implements Runnable
{
	public void run()
	{
		try
		{
String w[]= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		for(int i=0;i<7;i++)
			{
				System.out.println(w[i]);
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	}


public class Q12_2019 {
	public static void main(String[] args)
	{
		month1 rz=new month1();
		week1 rk=new week1();
		Thread t1=new Thread(rz);
		Thread t2=new Thread(rk);
		t1.start();
		t2.start();
	}
	}
	


