package reezu;
class alive implements Runnable
{
	String name;
	Thread rz;
	alive(String name1)
	{
		name=name1;
		rz=new Thread(this,name);
		System.out.println("Thread Name: "+rz);
		rz.start();
	}
	public void run()
	{
		try 
		{
			for(int i=1;i<10;i++)
			{
				System.out.println(i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException rk)
		{
			System.out.println("Interrupted Exception Caught ");
		}
		System.out.println(name+" Exiting");
	}
}
public class is_alive_example {

	public static void main(String[] args) {
		alive rs=new alive("Sanu");
		alive sr=new alive("kanxu");
		System.out.println(rs.rz.isAlive());
		System.out.println(sr.rz.isAlive());
		
	}
}
