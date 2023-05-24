package reezu;
class is_alive_join_example implements Runnable
{
	String name;
	Thread rz;
	is_alive_join_example(String name1)
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

public class is_alive_join {
	public static void main(String[] args) {
		is_alive_join_example rs=new is_alive_join_example("Sanu");
		is_alive_join_example sr=new is_alive_join_example("kanxu");
		System.out.println(rs.rz.isAlive());
		System.out.println(sr.rz.isAlive());
		
		try {
			rs.rz.join();
			sr.rz.join();
		}
		catch(InterruptedException rk)
		{
			System.out.println("Interrupted Exception join Caught ");
		}
		System.out.println(rs.rz.isAlive());
		System.out.println(sr.rz.isAlive());
	}

}
