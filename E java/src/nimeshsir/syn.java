package nimeshsir;
class Bim
{
	 void Bim_3rd(String C_name)
	{
		System.out.print("["+C_name);
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException rz)
		{
			System.out.println("InterruptedException"+rz);
		}
		System.out.println("]");
	}
}
class college1 implements Runnable
{
	String college_name;
	Thread t;
	Bim rk;
	college1(Bim rs,String s)
	{
		rk=rs;
		college_name=s;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		synchronized(rk)
		{
			rk.Bim_3rd(college_name);
		}
		
	}
}
public class syn {

	public static void main(String[] args)
	{
		Bim rk=new Bim();
		college1 sr1=new college1(rk,"BPC");
		college1 sr2=new college1(rk,"SDC");
		college1 sr3=new college1(rk,"NCC");
	}

}

