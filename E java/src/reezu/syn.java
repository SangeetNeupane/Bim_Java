package reezu;
class Bim1
{
	synchronized void Bim_3rd(String C_name)
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
	Bim1 rk;
	college1(Bim1 rs,String s)
	{
		rk=rs;
		college_name=s;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		rk.Bim_3rd(college_name);
	}
}
public class syn {

	public static void main(String[] args) {
		Bim1 rk=new Bim1();
		college1 sr1=new college1(rk,"BPC");
		college1 sr2=new college1(rk,"SDC");
		college1 sr3=new college1(rk,"NCC");
	}

}
